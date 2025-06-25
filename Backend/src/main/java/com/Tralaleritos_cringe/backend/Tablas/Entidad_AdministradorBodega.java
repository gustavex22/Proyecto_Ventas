package com.Tralaleritos_cringe.backend.Tablas;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ADMINISTRADOR_BODEGA")
public class Entidad_AdministradorBodega {
    @Id
    private long ADMIN_ID;

    @ManyToOne
    @JoinColumn(name = "ID_ROL")
    private Entidad_Roles rol;

    @ManyToOne
    @JoinColumn(name = "ID_BODEGA")
    private Entidad_SucursalBodega bodega;

    private String ROL_ADMINISTRATIVO;
    private Long ID_ADMINISTRADOR_BODEGA;

    public long getADMIN_ID() { return ADMIN_ID; }
    public void setADMIN_ID(long ADMIN_ID) { this.ADMIN_ID = ADMIN_ID; }

    public Entidad_Roles getRol() { return rol; }
    public void setRol(Entidad_Roles rol) { this.rol = rol; }

    public Entidad_SucursalBodega getBodega() { return bodega; }
    public void setBodega(Entidad_SucursalBodega bodega) { this.bodega = bodega; }

    public String getROL_ADMINISTRATIVO() { return ROL_ADMINISTRATIVO; }
    public void setROL_ADMINISTRATIVO(String ROL_ADMINISTRATIVO) { this.ROL_ADMINISTRATIVO = ROL_ADMINISTRATIVO; }

    public Long getID_ADMINISTRADOR_BODEGA() { return ID_ADMINISTRADOR_BODEGA; }
    public void setID_ADMINISTRADOR_BODEGA(Long id) { this.ID_ADMINISTRADOR_BODEGA = id; }
}
