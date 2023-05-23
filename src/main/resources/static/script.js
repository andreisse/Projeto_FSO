(function() {
    const btnDeletePaciente = document.getElementById('btnDeletePaciente');
    const modal = document.getElementById('modalpaciente');
    const btnNao = document.getElementById('btnnao');
    const btnSim = document.getElementById('btnsim');
    const close = document.getElementById('close');

    btnDeletePaciente.addEventListener('click', function() {
        const id = this.getAttribute('data-id');

        modal.classList.remove('modal');
        modal.classList.add('show');

        btnNao.addEventListener('click', closeModal);
        close.addEventListener('click', closeModal);
        btnSim.addEventListener('click', handleDelete);

        function closeModal() {
            modal.classList.remove('show');
            modal.classList.add('modal');
        }

        function handleDelete() {
            fetch(`/paciente/remover/${id}`)
                .then(function() {
                    window.location.href = '/paciente';
                });
        }
    });
})();