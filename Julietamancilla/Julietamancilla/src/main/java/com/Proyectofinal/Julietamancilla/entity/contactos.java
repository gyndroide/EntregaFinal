package com.Proyectofinal.Julietamancilla.entity;
import jakarta.persistence.*;
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
    private String direccion;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "provincia")
    private String provincia;

    @Column(name = "codigo_postal")
    private String codigoPostal;
    @OneToOne(cascade = CascadeType.ALL)

    @JoinColumn(name = "id_estudiante")
    private estudiantes estudiante;

}
