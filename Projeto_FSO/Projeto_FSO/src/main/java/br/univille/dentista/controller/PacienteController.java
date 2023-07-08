package br.univille.dentista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.dentista.entity.Paciente;
import br.univille.dentista.service.PacienteService;

@Controller
@RequestMapping("/paciente")
@PreAuthorize("hasAuthority('APPROLE_admin') or hasAuthority('APPROLE_user')")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;


    @GetMapping
    public ModelAndView index(){
        var listaPacientes = pacienteService.getAll();
        return new ModelAndView("paciente/index","listaPacientes",listaPacientes);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var paciente = new Paciente();
        return new ModelAndView("paciente/form","paciente", paciente);
    } 

    @PostMapping(params = "form")
    public ModelAndView save(Paciente paciente){
        pacienteService.save(paciente);
        return new ModelAndView("redirect:/paciente");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        Paciente paciente = pacienteService.findById(id);

        return new ModelAndView("paciente/form", "paciente", paciente);
    }
    @GetMapping("/remover/{id}")
    public ModelAndView remover (@PathVariable("id") long id){
        pacienteService.delete(id);
        return new ModelAndView("redirect:/paciente");
    }
}
