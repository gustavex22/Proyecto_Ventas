package com.Tralaleritos_cringe.backend.Tablas;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "PROVEEDOR")
public class Entidad_Proveedor {
    @Id
    @Column(name = "ID_PROVEEDOR")
    private long ID_PROVEEDOR;

    @Column(name = "NOMBRE")
    private String NOMBRE;

    @Column(name = "TELEFONO")
    private String TELEFONO;

    @Column(name = "CORREO")
    private String CORREO;

    @Column(name = "DIRECCION")
    private String DIRECCION;

    @Column(name = "FECHA")
    private LocalDateTime FECHA;

    @Column(name = "Total_Compra")
    private BigDecimal TOTAL_COMPRA;

    public long getID_PROVEEDOR() { return ID_PROVEEDOR; }
    public void setID_PROVEEDOR(long ID_PROVEEDOR) { this.ID_PROVEEDOR = ID_PROVEEDOR; }

    public String getNOMBRE() { return NOMBRE; }
    public void setNOMBRE(String NOMBRE) { this.NOMBRE = NOMBRE; }

    public String getTELEFONO() { return TELEFONO; }
    public void setTELEFONO(String TELEFONO) { this.TELEFONO = TELEFONO; }

    public String getCORREO() { return CORREO; }
    public void setCORREO(String CORREO) { this.CORREO = CORREO; }

    public String getDIRECCION() { return DIRECCION; }
    public void setDIRECCION(String DIRECCION) { this.DIRECCION = DIRECCION; }

    public LocalDateTime getFECHA() { return FECHA; }
    public void setFECHA(LocalDateTime FECHA) { this.FECHA = FECHA; }

    public BigDecimal getTOTAL_COMPRA() { return TOTAL_COMPRA; }
    public void setTOTAL_COMPRA(BigDecimal TOTAL_COMPRA) { this.TOTAL_COMPRA = TOTAL_COMPRA; }
}
