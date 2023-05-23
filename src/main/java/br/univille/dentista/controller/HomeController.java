package br.univille.dentista.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ModelAndView index() {
        HashMap<String, String> map = new HashMap<>();
        map.put("apelido", "apelido");
        map.put("nome", "teste");
        return new ModelAndView("home/index", map);
    }
}
