package com.Tralaleritos_cringe.backend.Tablas;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "DETALLE_VENTAS")
public class Entidad_DetalleVentas {
    @Id
    private long ID_DETALLE;

    @ManyToOne
    @JoinColumn(name = "ID_VENTAS")
    private Entidad_Ventas ventas;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTO")
    private Entidad_Producto producto;

    private int CANTIDAD;
    private BigDecimal PRECIO_UNITARIO;
    // SUB_TOTAL is a computed column in SQL, not mapped here

    private Long ID_DETALLE_VENTA;

    public long getID_DETALLE() { return ID_DETALLE; }
    public void setID_DETALLE(long ID_DETALLE) { this.ID_DETALLE = ID_DETALLE; }

    public Entidad_Ventas getVentas() { return ventas; }
    public void setVentas(Entidad_Ventas ventas) { this.ventas = ventas; }

    public Entidad_Producto getProducto() { return producto; }
    public void setProducto(Entidad_Producto producto) { this.producto = producto; }

    public int getCANTIDAD() { return CANTIDAD; }
    public void setCANTIDAD(int CANTIDAD) { this.CANTIDAD = CANTIDAD; }

    public java.math.BigDecimal getPRECIO_UNITARIO() { return PRECIO_UNITARIO; }
    public void setPRECIO_UNITARIO(java.math.BigDecimal PRECIO_UNITARIO) { this.PRECIO_UNITARIO = PRECIO_UNITARIO; }

    public Long getID_DETALLE_VENTA() { return ID_DETALLE_VENTA; }
    public void setID_DETALLE_VENTA(Long id) { this.ID_DETALLE_VENTA = id; }
}
