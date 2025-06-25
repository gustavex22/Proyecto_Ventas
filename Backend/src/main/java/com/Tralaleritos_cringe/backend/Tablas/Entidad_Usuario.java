package com.Tralaleritos_cringe.backend.Tablas;


import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Entidad_Usuario {
    @Id
    @Column(name = "ID_USUARIO")
    private long ID_USUARIO;

    @Column(name = "NOMBRE")
    private String NOMBRE;

    @Column(name = "CORREO")
    private String CORREO;

    @Column(name = "USUARIO")
    private String USUARIO;

    @Column(name = "CONTRASENA")
    private String CONTRASENA;

    @Column(name = "TELEFONO")
    private String TELEFONO;


    @ManyToOne
    @JoinColumn(name = "ID_ROL")
    private Entidad_Roles roles;

    @Column(name = "ACTIVO")
    private boolean ACTIVO;

    @Column(name = "IP_ADDRESS")
    private String IP_ADDRESS;

    @Column(name = "FECHA_CREACION")
    private LocalDateTime FECHA_CREACION;

    @Column(name = "FECHA_ELIMINACION")
    private LocalDate FECHA_ELIMINACION;

    public long getID_USUARIO() { return ID_USUARIO; }
    public void setID_USUARIO(long ID_USUARIO) { this.ID_USUARIO = ID_USUARIO; }

    public String getNOMBRE() { return NOMBRE; }
    public void setNOMBRE(String NOMBRE) { this.NOMBRE = NOMBRE; }

    public String getCORREO() { return CORREO; }
    public void setCORREO(String CORREO) { this.CORREO = CORREO; }

    public String getUSUARIO() { return USUARIO; }
    public void setUSUARIO(String USUARIO) { this.USUARIO = USUARIO; }

    public String getCONTRASENA() { return CONTRASENA; }
    public void setCONTRASENA(String CONTRASENA) { this.CONTRASENA = CONTRASENA; }

    public String getTELEFONO() { return TELEFONO; }
    public void setTELEFONO(String TELEFONO) { this.TELEFONO = TELEFONO; }

    public Entidad_Roles getRoles() { return roles; }
    public void setRoles(Entidad_Roles roles) { this.roles = roles; }

    public boolean isACTIVO() { return ACTIVO; }
    public void setACTIVO(boolean ACTIVO) { this.ACTIVO = ACTIVO; }

    public String getIP_ADDRESS() { return IP_ADDRESS; }
    public void setIP_ADDRESS(String IP_ADDRESS) { this.IP_ADDRESS = IP_ADDRESS; }

    public java.time.LocalDateTime getFECHA_CREACION() { return FECHA_CREACION; }
    public void setFECHA_CREACION(java.time.LocalDateTime FECHA_CREACION) { this.FECHA_CREACION = FECHA_CREACION; }

    public java.time.LocalDate getFECHA_ELIMINACION() { return FECHA_ELIMINACION; }
    public void setFECHA_ELIMINACION(java.time.LocalDate FECHA_ELIMINACION) { this.FECHA_ELIMINACION = FECHA_ELIMINACION; }
}
