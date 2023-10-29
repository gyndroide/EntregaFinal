package com.Proyectofinal.Julietamancilla.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "estudiantes")
public class estudiantes extends Entidad {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "estudiante_curso",
            joinColumns = @JoinColumn(name = "id_estudiante"),
            inverseJoinColumns = @JoinColumn(name = "id_curso"))
    private List<cursos> cursos = new ArrayList<>();

}

