/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.cursos.Services;

import com.api.cursos.Models.Cursos;
import com.api.cursos.Repository.CursosRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class CursosServices implements ApplicationRunner {

    private final CursosRepository repository;

    public CursosServices(CursosRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        
        var curso = new Cursos("Inglês");
        repository.save(curso);
        var findCursos = repository.findAll();
        System.out.println(findCursos);

  
    }
}
