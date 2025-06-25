package com.Tralaleritos_cringe.backend.Tablas;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;


@Entity
@Table(name = "PRODUCTOS")
public class Entidad_Producto {
    @Id
    @Column(name = "ID_PRODUCTO")
    private long ID_PRODUCTO;

    @Column(name = "NOMBRE")
    private String NOMBRE;

    @Column(name = "DESCRIPCION")
    private String DESCRIPCION;

    @Column(name = "PRECIO_COSTO")
    private BigDecimal PRECIO_COSTO;

    @Column(name = "NOMBRE_CATEGORIA")
    private String NOMBRE_CATEGORIA;

    @ManyToOne
    @JoinColumn(name = "ID_PROVEEDOR")
    private Entidad_Proveedor proveedor;

    @Column(name = "ESTADO")
    private String ESTADO;

    @Column(name = "FECHA_VENCIMIENTO")
    private LocalDate FECHA_VENCIMIENTO;

    @Column(name = "FECHA_PRODUCCION")
    private LocalDate FECHA_PRODUCCION;

    // getters y setters...
}
