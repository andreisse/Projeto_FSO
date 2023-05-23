package br.univille.dentista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.dentista.entity.Dentista;
import br.univille.dentista.service.DentistaService;

@Controller
@RequestMapping("/dentista")
public class DentistaController {

    @Autowired
    private DentistaService dentistaService;


    @GetMapping
    public ModelAndView index(){
        final var listaDentista = dentistaService.getAll();
        return new ModelAndView("dentista/index","listaDentista",listaDentista);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var dentista = new Dentista();
        return new ModelAndView("dentista/form","dentista", dentista);
    } 

    /**
     * @param dentista
     * @return
     */
    @PostMapping(params = "form")
    public ModelAndView save(Dentista dentista){
        dentistaService.save(dentista);
        return new ModelAndView("redirect:/dentista");
    }

    /**
     * @param id
     * @return
     */
    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        final Dentista dentista = dentistaService.findById(id);

        return new ModelAndView("dentista/form", "dentista", dentista);
    }
    /**
     * @param id
     * @return
     */
    @GetMapping("/remover/{id}")
    public ModelAndView remover (@PathVariable("id") long id){
        ((DentistaService) dentistaService).delete(id);
        return new ModelAndView("redirect:/dentista");
    }
}
