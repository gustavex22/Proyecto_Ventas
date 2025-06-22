package com.Tralaleritos_cringe.backend.Tablas;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ROLES")
public class Entidad_Roles {
    @Id
    private long ID_ROL;
    private String NOMBRE_ROL;
}
