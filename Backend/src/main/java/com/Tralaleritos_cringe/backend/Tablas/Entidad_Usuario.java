package com.Tralaleritos_cringe.backend.Tablas;


import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Entidad_Usuario {
    @Id
    private long ID_USUARIO;

    private String NOMBRE;
    private String CORREO;
    private String USUARIO;
    private String CONTRASEÑA;
    private String TELEFONO;


    @ManyToOne
    @JoinColumn(name = "ID_ROL")
    private Entidad_Roles roles;

    private boolean ACTIVO;
    private String IP_ADDRESS;
    private LocalDateTime FECHA_CREACION;
    private LocalDate FECHA_ELIMINACION;
}
