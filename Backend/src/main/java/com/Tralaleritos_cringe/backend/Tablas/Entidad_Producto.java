package com.Tralaleritos_cringe.backend.Tablas;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;


@Entity
@Table(name = "PRODUCTOS")
public class Entidad_Producto {
    @Id
    private long ID_PRODUCTO;

    private String NOMBRE;

    private String DESCRIPCION;

    private BigDecimal PRECIO_COSTO;

    private String NOMBRE_CATEGORIA;

    @ManyToOne
    @JoinColumn(name = "ID_PROVEEDOR")
    private Entidad_Proveedor proveedor;

    private String ESTADO;
  
    private LocalDate FECHA_VENCIMIENTO;
   
    private LocalDate FECHA_PRODUCCION;

    // getters y setters...

    public long getID_PRODUCTO() { return ID_PRODUCTO; }
    public void setID_PRODUCTO(long ID_PRODUCTO) { this.ID_PRODUCTO = ID_PRODUCTO; }

    public String getNOMBRE() { return NOMBRE; }
    public void setNOMBRE(String NOMBRE) { this.NOMBRE = NOMBRE; }

    public String getDESCRIPCION() { return DESCRIPCION; }
    public void setDESCRIPCION(String DESCRIPCION) { this.DESCRIPCION = DESCRIPCION; }

    public BigDecimal getPRECIO_COSTO() { return PRECIO_COSTO; }
    public void setPRECIO_COSTO(BigDecimal PRECIO_COSTO) { this.PRECIO_COSTO = PRECIO_COSTO; }

    public String getNOMBRE_CATEGORIA() { return NOMBRE_CATEGORIA; }
    public void setNOMBRE_CATEGORIA(String NOMBRE_CATEGORIA) { this.NOMBRE_CATEGORIA = NOMBRE_CATEGORIA; }

    public Entidad_Proveedor getProveedor() { return proveedor; }
    public void setProveedor(Entidad_Proveedor proveedor) { this.proveedor = proveedor; }

    public String getESTADO() { return ESTADO; }
    public void setESTADO(String ESTADO) { this.ESTADO = ESTADO; }

    public LocalDate getFECHA_VENCIMIENTO() { return FECHA_VENCIMIENTO; }
    public void setFECHA_VENCIMIENTO(LocalDate FECHA_VENCIMIENTO) { this.FECHA_VENCIMIENTO = FECHA_VENCIMIENTO; }

    public LocalDate getFECHA_PRODUCCION() { return FECHA_PRODUCCION; }
    public void setFECHA_PRODUCCION(LocalDate FECHA_PRODUCCION) { this.FECHA_PRODUCCION = FECHA_PRODUCCION; }
}
