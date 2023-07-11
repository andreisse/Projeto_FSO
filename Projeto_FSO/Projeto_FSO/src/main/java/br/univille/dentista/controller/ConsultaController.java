package br.univille.dentista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.dentista.entity.Consulta;
import br.univille.dentista.service.ConsultaService;

@Controller
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @GetMapping
    public ModelAndView index(){
        var listaConsulta = consultaService.getAll();
        return new ModelAndView("consulta/index","listaConsulta",listaConsulta);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var consulta = new Consulta();
        return new ModelAndView("consulta/form","consulta", consulta);
    } 

    @PostMapping(params = "form")
    public ModelAndView save(Consulta consulta){
        consultaService.save(consulta);
        return new ModelAndView("redirect:/consulta");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        Consulta consulta = consultaService.findById(id);

        return new ModelAndView("consulta/form", "consulta", consulta);
    }
    @GetMapping("/remover/{id}")
    public ModelAndView remover (@PathVariable("id") long id){
        consultaService.delete(id);
        return new ModelAndView("redirect:/consulta");
    }
    
}
