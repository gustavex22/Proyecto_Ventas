package com.Tralaleritos_cringe.backend.Tablas;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROVEEDORES")
public class Entidad_Proveedor {
    @Id
    private long ID_PROVEEDOR;
    private String NOMBRE;
    private String TELEFONO;
    private String CORREO;
    private String DIRECCION;
    private LocalDateTime FECHA;
    private BigDecimal total_Compra;

}
