package com.Proyectofinal.Julietamancilla.controller;
import com.Proyectofinal.Julietamancilla.service.InstructorservicioSub;
import com.Proyectofinal.Julietamancilla.entity.instructores;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/instructores")
public class InstructorController extends ControladorSub<instructores, InstructorservicioSub> {

    public InstructorController(InstructorservicioSub servicio) {
        super(servicio);
    }
}

