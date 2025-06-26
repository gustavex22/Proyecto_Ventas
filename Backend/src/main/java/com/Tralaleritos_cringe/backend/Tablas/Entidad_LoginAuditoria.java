package com.Tralaleritos_cringe.backend.Tablas;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "LOGIN_AUDITORIA")
public class Entidad_LoginAuditoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_AUDITORIA;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Entidad_Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_ROL")
    private Entidad_Roles rol;

    private String ESTADO_LOGIN;
    private String TIPO_ACCION;
    private String CAMPO_MODIFICADO;
    private String DATO_ANTERIOR;
    private String DATO_NUEVO;
    private LocalDate FECHA_CREACION;
    private LocalDate FECHA_ACCION;
    private String IP_ADDRESS;


    public long getID_AUDITORIA() { return ID_AUDITORIA; }
    public void setID_AUDITORIA(long ID_AUDITORIA) { this.ID_AUDITORIA = ID_AUDITORIA; }

    public Entidad_Usuario getUsuario() { return usuario; }
    public void setUsuario(Entidad_Usuario usuario) { this.usuario = usuario; }

    public Entidad_Roles getRol() { return rol; }
    public void setRol(Entidad_Roles rol) { this.rol = rol; }

    public String getESTADO_LOGIN() { return ESTADO_LOGIN; }
    public void setESTADO_LOGIN(String ESTADO_LOGIN) { this.ESTADO_LOGIN = ESTADO_LOGIN; }

    public String getTIPO_ACCION() { return TIPO_ACCION; }
    public void setTIPO_ACCION(String TIPO_ACCION) { this.TIPO_ACCION = TIPO_ACCION; }

    public String getCAMPO_MODIFICADO() { return CAMPO_MODIFICADO; }
    public void setCAMPO_MODIFICADO(String CAMPO_MODIFICADO) { this.CAMPO_MODIFICADO = CAMPO_MODIFICADO; }

    public String getDATO_ANTERIOR() { return DATO_ANTERIOR; }
    public void setDATO_ANTERIOR(String DATO_ANTERIOR) { this.DATO_ANTERIOR = DATO_ANTERIOR; }

    public String getDATO_NUEVO() { return DATO_NUEVO; }
    public void setDATO_NUEVO(String DATO_NUEVO) { this.DATO_NUEVO = DATO_NUEVO; }

    public java.time.LocalDate getFECHA_CREACION() { return FECHA_CREACION; }
    public void setFECHA_CREACION(java.time.LocalDate FECHA_CREACION) { this.FECHA_CREACION = FECHA_CREACION; }

    public java.time.LocalDate getFECHA_ACCION() { return FECHA_ACCION; }
    public void setFECHA_ACCION(java.time.LocalDate FECHA_ACCION) { this.FECHA_ACCION = FECHA_ACCION; }

    public String getIP_ADDRESS() { return IP_ADDRESS; }
    public void setIP_ADDRESS(String IP_ADDRESS) { this.IP_ADDRESS = IP_ADDRESS; }

}
