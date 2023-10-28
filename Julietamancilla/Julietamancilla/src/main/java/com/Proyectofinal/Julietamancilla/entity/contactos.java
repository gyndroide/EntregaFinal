package com.Proyectofinal.Julietamancilla.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "contactos")
public class contactos extends Entidad{

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private LocalDate direccion;

    @Column(name = "ciudad")
    private LocalDate ciudad;

    @Column(name = "provincia")
    private LocalDate provincia;

    @Column(name = "codigo_postal")
    private LocalDate codigoPostal;

}
