package com.Tralaleritos_cringe.backend.Tablas;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "INVENTARIO")
public class Entidad_Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_INVENTARIO;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTO")
    private Entidad_Producto producto;

    @ManyToOne
    @JoinColumn(name = "ID_BODEGA")
    private Entidad_SucursalBodega bodega;

    @ManyToOne
    @JoinColumn(name = "ID_PROVEEDOR")
    private Entidad_Proveedor proveedor;

    private int CANTIDAD;
    private LocalDateTime FECHA_INGRESO;
    private LocalDateTime FECHA_ACTUALIZACION;
    private BigDecimal COSTO_UNITARIO;
    private BigDecimal COSTO_VENTA;
    private String ESTADO;
    private int MINIMO_STOCK;
    private int MAXIMO_STOCK;

    public long getID_INVENTARIO() { return ID_INVENTARIO; }
    public void setID_INVENTARIO(long ID_INVENTARIO) { this.ID_INVENTARIO = ID_INVENTARIO; }

    public Entidad_Producto getProducto() { return producto; }
    public void setProducto(Entidad_Producto producto) { this.producto = producto; }

    public Entidad_SucursalBodega getBodega() { return bodega; }
    public void setBodega(Entidad_SucursalBodega bodega) { this.bodega = bodega; }

    public Entidad_Proveedor getProveedor() { return proveedor; }
    public void setProveedor(Entidad_Proveedor proveedor) { this.proveedor = proveedor; }

    public int getCANTIDAD() { return CANTIDAD; }
    public void setCANTIDAD(int CANTIDAD) { this.CANTIDAD = CANTIDAD; }

    public java.time.LocalDateTime getFECHA_INGRESO() { return FECHA_INGRESO; }
    public void setFECHA_INGRESO(java.time.LocalDateTime FECHA_INGRESO) { this.FECHA_INGRESO = FECHA_INGRESO; }

    public java.time.LocalDateTime getFECHA_ACTUALIZACION() { return FECHA_ACTUALIZACION; }
    public void setFECHA_ACTUALIZACION(java.time.LocalDateTime FECHA_ACTUALIZACION) { this.FECHA_ACTUALIZACION = FECHA_ACTUALIZACION; }

    public java.math.BigDecimal getCOSTO_UNITARIO() { return COSTO_UNITARIO; }
    public void setCOSTO_UNITARIO(java.math.BigDecimal COSTO_UNITARIO) { this.COSTO_UNITARIO = COSTO_UNITARIO; }

    public java.math.BigDecimal getCOSTO_VENTA() { return COSTO_VENTA; }
    public void setCOSTO_VENTA(java.math.BigDecimal COSTO_VENTA) { this.COSTO_VENTA = COSTO_VENTA; }

    public String getESTADO() { return ESTADO; }
    public void setESTADO(String ESTADO) { this.ESTADO = ESTADO; }

    public int getMINIMO_STOCK() { return MINIMO_STOCK; }
    public void setMINIMO_STOCK(int MINIMO_STOCK) { this.MINIMO_STOCK = MINIMO_STOCK; }

    public int getMAXIMO_STOCK() { return MAXIMO_STOCK; }
    public void setMAXIMO_STOCK(int MAXIMO_STOCK) { this.MAXIMO_STOCK = MAXIMO_STOCK; }
}
