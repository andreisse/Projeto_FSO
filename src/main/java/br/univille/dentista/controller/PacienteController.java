package br.univille.dentista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.dentista.service.PacienteService;

@Controller
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;


    @GetMapping
    public ModelAndView index(){
        var listaPacientes = pacienteService.getAll();
        return new ModelAndView("paciente/index","listaPacientes",listaPacientes);
    }

}
