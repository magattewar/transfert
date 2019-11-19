package com.magatte.transfertargent.transfert.controller;

import com.magatte.transfertargent.transfert.model.Partenaire;
import com.magatte.transfertargent.transfert.service.PartenairesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/partenaires")
    public String showAll(Model model) {
        PartenairesService partenairesService = new PartenairesService();
//        model.addAttribute("partenaires", partenairesService.findAll());
        model.addAttribute("test","juste un test");
        return "partenaires/liste";
    }

}
