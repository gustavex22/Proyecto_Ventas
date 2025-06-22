package com.Tralaleritos_cringe.backend.Tablas;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.*;


@Entity
@Table(name = "PRODUCTOS")
public class Entidad_Producto{
    @Id
    private long ID_PRODUCTO;

    private String NOMBRE;
    private String DESCRIPCION;
    private BigDecimal PRECIO_COSTO;
    private String NOMBRE_CATEGORIA;


    // *Relacion con la tabla Proveedor
    @ManyToOne
    @JoinColumn(name = "ID_PROVEEDOR")
    private Entidad_Proveedor proveedor;

    private String ESTADO;
    private LocalDate FECHA_VENCIMIENTO;
    private LocalDate FECHA_PRODUCCION;
    
}
