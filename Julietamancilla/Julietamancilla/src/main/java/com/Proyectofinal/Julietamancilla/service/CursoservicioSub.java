package com.Proyectofinal.Julietamancilla.service;
import com.Proyectofinal.Julietamancilla.entity.cursos;
import com.Proyectofinal.Julietamancilla.repository.Cursorepository;
import com.Proyectofinal.Julietamancilla.repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoservicioSub extends ServicioSub<cursos, Integer> implements Cursoservicio {

    @Autowired
    private Cursorepository cursorepositorio;
    public CursoservicioSub(Repositorio<cursos, Integer> repositorio) {
        super(repositorio);
    }

}



