(function(){
    $("#tabdentista").on("click", ".js-delete", function(){
        let botaoClicado = $(this);
        $("#btnsim").attr("data-id", botaoClicado.attr("data-id"));
        $("#modaldentista").modal("show");
    })
    $("#btnsim").on("click", function(){
        let botaoSim = $(this);
        let id = botaoSim.attr("data-id");
        $.ajax({
            url: "/dentista/remover/" + id,
            method: "GET",
            success: function(){
                window.location.href = "/dentista";
            }
        });
    });

})();