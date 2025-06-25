package com.Tralaleritos_cringe.backend.Tablas;

import jakarta.persistence.*;

@Entity
@Table(name = "CLIENTE")
public class Entidad_Cliente {
    @Id
    @Column(name = "ID_CLIENTE")
    private long ID_CLIENTE;

    @ManyToOne
    @JoinColumn(name = "ID_ROL")
    private Entidad_Roles rol;

    @Column(name = "PREFERENCIAS")
    private String PREFERENCIAS;

    @Column(name = "DIRECCION")
    private String DIRECCION;

    @Column(name = "CODIGO_POSTAL")
    private String CODIGO_POSTAL;

    @Column(name = "TARJETA")
    private String TARJETA;

    @Column(name = "TIENDA_PREDETERMINADA_ID")
    private Integer TIENDA_PREDETERMINADA_ID;

    public long getID_CLIENTE() { return ID_CLIENTE; }
    public void setID_CLIENTE(long ID_CLIENTE) { this.ID_CLIENTE = ID_CLIENTE; }

    public Entidad_Roles getRol() { return rol; }
    public void setRol(Entidad_Roles rol) { this.rol = rol; }

    public String getPREFERENCIAS() { return PREFERENCIAS; }
    public void setPREFERENCIAS(String PREFERENCIAS) { this.PREFERENCIAS = PREFERENCIAS; }

    public String getDIRECCION() { return DIRECCION; }
    public void setDIRECCION(String DIRECCION) { this.DIRECCION = DIRECCION; }

    public String getCODIGO_POSTAL() { return CODIGO_POSTAL; }
    public void setCODIGO_POSTAL(String CODIGO_POSTAL) { this.CODIGO_POSTAL = CODIGO_POSTAL; }

    public String getTARJETA() { return TARJETA; }
    public void setTARJETA(String TARJETA) { this.TARJETA = TARJETA; }

    public Integer getTIENDA_PREDETERMINADA_ID() { return TIENDA_PREDETERMINADA_ID; }
    public void setTIENDA_PREDETERMINADA_ID(Integer TIENDA_PREDETERMINADA_ID) { this.TIENDA_PREDETERMINADA_ID = TIENDA_PREDETERMINADA_ID; }
}
