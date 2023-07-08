(function(){
    $("#tabpacientes").on("click", ".js-delete", function(){
        console.log("err");
        let botaoClicado = $(this);
        $("#btnsim").attr("data-id", botaoClicado.attr("data-id"));
        $("#modalpaciente").modal("show");
    })
    $("#btnsim").on("click", function(){
        let botaoSim = $(this);
        let id = botaoSim.attr("data-id");
        $.ajax({
            url: "/paciente/remover/" + id,
            method: "GET",
            success: function(){
                window.location.href = "/paciente";
            }
        });
    });
})();