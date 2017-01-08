package co.bergamota.controllers;

import co.bergamota.dataaccess.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@RequestMapping(value = {"/","/home"})
public class HomeController {

    PublicacaoRepository publicacaoRepository;

    public HomeController(){
        publicacaoRepository = new PublicacaoRepository();
    }

    @RequestMapping( value = {"/", "/index"})
    public String indexAction (ModelMap model) {
        model.addAttribute("name", "world");
        return "home/index";
    }


}
