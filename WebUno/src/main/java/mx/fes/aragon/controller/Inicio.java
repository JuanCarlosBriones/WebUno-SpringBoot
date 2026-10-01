package mx.fes.aragon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "fes")
public class Inicio {
    @GetMapping("inicio")
    public String getInicio(Model model){
        model.addAttribute("saludo", "Soy tu padre");
        return "index";
    }
    @GetMapping("principal")
    public String getPrincipal(Model model){
        model.addAttribute("saludo", "Soy tu padre");
        return "principal";
    }

    @GetMapping("primera")
    public String getPrimera(Model model){
        return "primera";
    }

    @GetMapping("segunda")
    public String getSegunda(Model model){
        return "segunda";
    }

    @GetMapping("tercera")
    public String getTercera(Model model){
        return "tercera";
    }
}


