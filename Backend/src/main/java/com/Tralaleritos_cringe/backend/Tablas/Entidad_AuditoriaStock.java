package com.Tralaleritos_cringe.backend.Tablas;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "AUDITORIA_STOCK")
public class Entidad_AuditoriaStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_AUDITORIA_STOCK;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTO")
    private Entidad_Producto producto;

    @ManyToOne
    @JoinColumn(name = "ID_INVENTARIO")
    private Entidad_Inventario inventario;

    private String TIPO_MOVIMIENTO;
    private int CANTIDAD_ANTERIOR;
    private int CANTIDAD_NUEVA;
    private String DESCRIPCION;
    private LocalDate FECHA_MOVIMIENTO;
}
