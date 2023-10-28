package com.Proyectofinal.Julietamancilla.controller;
import com.Proyectofinal.Julietamancilla.service.EstudianteservicioSub;
import com.Proyectofinal.Julietamancilla.entity.estudiantes;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/estudiantes")
public class EstudianteController extends ControladorSub<estudiantes, EstudianteservicioSub> {

    public EstudianteController(EstudianteservicioSub servicio) {
        super(servicio);
    }
}
