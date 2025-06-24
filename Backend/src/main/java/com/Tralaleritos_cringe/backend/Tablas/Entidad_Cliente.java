package com.Tralaleritos_cringe.backend.Tablas;

import jakarta.persistence.*;

@Entity
@Table(name = "CLIENTE")
public class Entidad_Cliente {
    @Id
    private long ID_CLIENTE;

    @ManyToOne
    @JoinColumn(name = "ID_ROL")
    private Entidad_Roles rol;

    private String PREFERENCIAS;
    private String DIRECCION;
    private String CODIGO_POSTAL;
    private String TARJETA;
    private Integer TIENDA_PREDETERMINADA_ID;
}
