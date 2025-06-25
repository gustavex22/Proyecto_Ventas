package com.Tralaleritos_cringe.backend.Tablas;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ROLES")
public class Entidad_Roles {
    @Id
    private long ID_ROL;
    private String NOMBRE_ROL;

    public long getID_ROL() { return ID_ROL; }
    public void setID_ROL(long ID_ROL) { this.ID_ROL = ID_ROL; }

    public String getNOMBRE_ROL() { return NOMBRE_ROL; }
    public void setNOMBRE_ROL(String NOMBRE_ROL) { this.NOMBRE_ROL = NOMBRE_ROL; }
}
