package com.gestion.empleados.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
//@Table(name = "empleado")
@Table(name = "persona")
public class Empleado {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long idEmpleado;
    private Long idPersona;
    
    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;
    
    @Column(name = "apellido", length = 45, nullable = false)
    private String apellido;
    
    @Column(name = "email", length = 45, nullable = false, unique = true)
    private String email;
    
    @Column(name = "telefono", length = 45, nullable = false, unique = true)
    private String telefono;
    
    
}
