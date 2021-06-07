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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CursosControler {
    
    @Autowired
    private CursosRepository repository;
     
    @RequestMapping(value="/CadastrarCurso", method = RequestMethod.GET)
    public String formCurso(ModelMap model){
        return "Cursos/CadastrarCurso";
    }
    
    @RequestMapping(value="/CadastrarCurso", method = RequestMethod.POST)
    public String formCurso(Cursos curso){
        repository.save(curso);
        return "redirect:/CadastrarCurso";
    }
    
    @RequestMapping(value="/cursos",  method = RequestMethod.GET)
    public ModelAndView listCurso(){
        ModelAndView mv = new ModelAndView("Cursos/VerCursos");
        Iterable<Cursos> cursos = repository.findAll();
        
        mv.addObject("cursos", cursos);
        return mv;
    }
    
    @RequestMapping(value="/cursos/delete/{id}", method = RequestMethod.POST)
    public String removeCurso(@PathVariable Long id){
        repository.deleteById(id);
        return "redirect:/cursos"; 
    }
    
    @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editCurso(@PathVariable Long id){
        Cursos curso = repository.findById(id).get();
        ModelAndView mv = new ModelAndView("Cursos/EditarCurso");
        
        mv.addObject("nome", curso.getNome());
        mv.addObject("dataInicio", curso.getDataInicio());
        mv.addObject("dataCadastro", curso.getDataCadastro());
        mv.addObject("descricao", curso.getDescricao());
        mv.addObject("ementa", curso.getEmenta());
        mv.addObject("valor", curso.getValor());

        return mv;
    }
    
    @RequestMapping(value="/edit/{id}", method = RequestMethod.POST)
    public String editCurso(Cursos newCurso){
      
        repository.save(newCurso);
        return "redirect:/cursos";
    }
}
