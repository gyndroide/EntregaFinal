package com.Proyectofinal.Julietamancilla.service;
import com.Proyectofinal.Julietamancilla.entity.contactos;
import com.Proyectofinal.Julietamancilla.repository.Contactorepository;
import com.Proyectofinal.Julietamancilla.repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Contactoserviciosub extends ServicioSub<contactos, Integer> implements Contactoservicio {

    @Autowired
    private Contactorepository contactorepositorio;
    public Contactoserviciosub(Repositorio<contactos, Integer> repositorio) {
        super(repositorio);
    }

}

