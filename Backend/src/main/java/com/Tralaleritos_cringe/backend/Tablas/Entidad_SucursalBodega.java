package com.Tralaleritos_cringe.backend.Tablas;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "SUCURSALES_BODEGAS")
public class Entidad_SucursalBodega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_BODEGA;

    private String NOMBRE;
    private String DIRECCION;
    private String CIUDAD;
}
