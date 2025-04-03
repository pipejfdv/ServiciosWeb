package com.ServiciosWeb.CloudAPI.Entidad;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "usuarios")
public class Usuario {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombres;
    private String apellidos;
    private String telefono;
    private Date fechaNacimiento;
    private String urlImagen;
}
