/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.cursos.Controller;

import com.api.cursos.Models.Cursos;
import com.api.cursos.Repository.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CursosControler {
    
    @Autowired
    private CursosRepository repository;
     
    @RequestMapping(value="/CadastrarCursos", method = RequestMethod.GET)
    public String form(ModelMap model){
        return "Cursos/CadastrarCurso";
    }
    
    @RequestMapping(value="/CadastrarCursos", method = RequestMethod.POST)
    public String form(Cursos curso){
        repository.save(curso);
        return "redirect:/CadastrarCursos";
    }
    
    @RequestMapping("/cursos")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView("Cursos/Listagem");
        Iterable<Cursos> cursos = repository.findAll();
        
        mv.addObject("cursos", cursos);
        return mv;
    }
    
}
