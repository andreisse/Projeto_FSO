(function(){
    $("#tabpacientes").on("click", ".js-delete", function(){
        console.log("pq voce nao passa la");
        let botaoClicado = $(this);
        $("#btnsim").attr("data-id", botaoClicado.attr("data-id"));
        $("#modalpaciente").modal("show");
    })
    $("#btnsim").on("click", function(){
        let botaoSim = $(this);
        let id = botaoSim.attr("data-id");
        $.ajax({
            url: "/cliente/remover/" + id,
            method: "GET",
            sucess: function(){
                window.location.href = "/cliente";
            }
        });
    });

})();