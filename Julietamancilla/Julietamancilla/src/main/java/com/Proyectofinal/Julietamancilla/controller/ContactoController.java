package com.Proyectofinal.Julietamancilla.controller;
import com.Proyectofinal.Julietamancilla.service.Contactoserviciosub;
import com.Proyectofinal.Julietamancilla.entity.contactos;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/contactos")
public class ContactoController extends ControladorSub<contactos, Contactoserviciosub> {

    public ContactoController(Contactoserviciosub servicio) {
        super(servicio);
    }
}





