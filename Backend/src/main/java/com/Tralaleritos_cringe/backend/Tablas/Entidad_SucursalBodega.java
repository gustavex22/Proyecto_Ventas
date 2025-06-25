package com.Tralaleritos_cringe.backend.Tablas;

import jakarta.persistence.*;

@Entity
@Table(name = "SUCURSALES_BODEGAS")
public class Entidad_SucursalBodega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_BODEGA;

    private String NOMBRE;
    private String DIRECCION;
    private String CIUDAD;
    private Long ID_SUCURSAL_BODEGA;

    public long getID_BODEGA() { return ID_BODEGA; }
    public void setID_BODEGA(long ID_BODEGA) { this.ID_BODEGA = ID_BODEGA; }

    public String getNOMBRE() { return NOMBRE; }
    public void setNOMBRE(String NOMBRE) { this.NOMBRE = NOMBRE; }

    public String getDIRECCION() { return DIRECCION; }
    public void setDIRECCION(String DIRECCION) { this.DIRECCION = DIRECCION; }

    public String getCIUDAD() { return CIUDAD; }
    public void setCIUDAD(String CIUDAD) { this.CIUDAD = CIUDAD; }

    public Long getID_SUCURSAL_BODEGA() { return ID_SUCURSAL_BODEGA; }
    public void setID_SUCURSAL_BODEGA(Long id) { this.ID_SUCURSAL_BODEGA = id; }
}
