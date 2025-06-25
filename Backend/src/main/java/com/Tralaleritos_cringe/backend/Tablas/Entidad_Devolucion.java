package com.Tralaleritos_cringe.backend.Tablas;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "DEVOLUCION")
public class Entidad_Devolucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_DEVOLUCIONE;

    @ManyToOne
    @JoinColumn(name = "ID_VENTAS")
    private Entidad_Ventas ventas;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Entidad_Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTO")
    private Entidad_Producto producto;

    private String MOTIVO;
    private LocalDateTime FECHA;
    private int CANTIDAD_DEVUELTA;

    public long getID_DEVOLUCIONE() { return ID_DEVOLUCIONE; }
    public void setID_DEVOLUCIONE(long ID_DEVOLUCIONE) { this.ID_DEVOLUCIONE = ID_DEVOLUCIONE; }

    public Entidad_Ventas getVentas() { return ventas; }
    public void setVentas(Entidad_Ventas ventas) { this.ventas = ventas; }

    public Entidad_Usuario getUsuario() { return usuario; }
    public void setUsuario(Entidad_Usuario usuario) { this.usuario = usuario; }

    public Entidad_Producto getProducto() { return producto; }
    public void setProducto(Entidad_Producto producto) { this.producto = producto; }

    public String getMOTIVO() { return MOTIVO; }
    public void setMOTIVO(String MOTIVO) { this.MOTIVO = MOTIVO; }

    public java.time.LocalDateTime getFECHA() { return FECHA; }
    public void setFECHA(java.time.LocalDateTime FECHA) { this.FECHA = FECHA; }

    public int getCANTIDAD_DEVUELTA() { return CANTIDAD_DEVUELTA; }
    public void setCANTIDAD_DEVUELTA(int CANTIDAD_DEVUELTA) { this.CANTIDAD_DEVUELTA = CANTIDAD_DEVUELTA; }

    public void setID_DEVOLUCION(Long id) {
        this.ID_DEVOLUCIONE = id;
    }
}
