package com.Proyectofinal.Julietamancilla.controller;
import com.Proyectofinal.Julietamancilla.service.CursoservicioSub;
import com.Proyectofinal.Julietamancilla.entity.cursos;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/cursos")
public class CursoController extends ControladorSub<cursos, CursoservicioSub> {

    public CursoController(CursoservicioSub servicio) {
        super(servicio);
    }
}
