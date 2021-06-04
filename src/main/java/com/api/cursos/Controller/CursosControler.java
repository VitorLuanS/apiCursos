/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.cursos.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CursosControler {
    
    @RequestMapping("/cursos")
    public String cursos(ModelMap model){
        model.addAttribute("Curso", "Deu Certo! To Certo!");
        return "Events/Cursos";
    }
}
