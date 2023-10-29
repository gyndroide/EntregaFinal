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
@Table(name = "instructor")
public class instructores extends Entidad {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

}
