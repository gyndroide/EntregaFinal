package com.Proyectofinal.Julietamancilla.service;
import com.Proyectofinal.Julietamancilla.entity.estudiantes;
import com.Proyectofinal.Julietamancilla.repository.Estudianterepository;
import com.Proyectofinal.Julietamancilla.repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteservicioSub extends ServicioSub<estudiantes, Integer> implements Estudianteservicio {

    @Autowired
    private Estudianterepository estudianterepositorio;

    public EstudianteservicioSub(Repositorio<estudiantes, Integer> repositorio) {
        super(repositorio);
    }

}
