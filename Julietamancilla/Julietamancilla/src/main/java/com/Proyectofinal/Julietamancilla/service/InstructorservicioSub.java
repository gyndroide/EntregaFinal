package com.Proyectofinal.Julietamancilla.service;

import com.Proyectofinal.Julietamancilla.entity.instructores;
import com.Proyectofinal.Julietamancilla.repository.Instructorrepository;
import com.Proyectofinal.Julietamancilla.repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructorservicioSub extends ServicioSub<instructores, Integer> implements Instructorservicio {

    @Autowired
    private Instructorrepository instructorrepositorio;
    public InstructorservicioSub(Repositorio<instructores, Integer> repositorio) {
        super(repositorio);
    }

}


