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

    public long getID_AUDITORIA_STOCK() { return ID_AUDITORIA_STOCK; }
    public void setID_AUDITORIA_STOCK(long ID_AUDITORIA_STOCK) { this.ID_AUDITORIA_STOCK = ID_AUDITORIA_STOCK; }

    public Entidad_Producto getProducto() { return producto; }
    public void setProducto(Entidad_Producto producto) { this.producto = producto; }

    public Entidad_Inventario getInventario() { return inventario; }
    public void setInventario(Entidad_Inventario inventario) { this.inventario = inventario; }

    public String getTIPO_MOVIMIENTO() { return TIPO_MOVIMIENTO; }
    public void setTIPO_MOVIMIENTO(String TIPO_MOVIMIENTO) { this.TIPO_MOVIMIENTO = TIPO_MOVIMIENTO; }

    public int getCANTIDAD_ANTERIOR() { return CANTIDAD_ANTERIOR; }
    public void setCANTIDAD_ANTERIOR(int CANTIDAD_ANTERIOR) { this.CANTIDAD_ANTERIOR = CANTIDAD_ANTERIOR; }

    public int getCANTIDAD_NUEVA() { return CANTIDAD_NUEVA; }
    public void setCANTIDAD_NUEVA(int CANTIDAD_NUEVA) { this.CANTIDAD_NUEVA = CANTIDAD_NUEVA; }

    public String getDESCRIPCION() { return DESCRIPCION; }
    public void setDESCRIPCION(String DESCRIPCION) { this.DESCRIPCION = DESCRIPCION; }

    public java.time.LocalDate getFECHA_MOVIMIENTO() { return FECHA_MOVIMIENTO; }
    public void setFECHA_MOVIMIENTO(java.time.LocalDate FECHA_MOVIMIENTO) { this.FECHA_MOVIMIENTO = FECHA_MOVIMIENTO; }
}
