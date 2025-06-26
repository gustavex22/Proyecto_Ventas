package com.Tralaleritos_cringe.backend.Tablas;

import jakarta.persistence.*;

@Entity
@Table(name = "VENTAS")
public class Entidad_Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_VENTAS;

    @ManyToOne
    @JoinColumn(name = "ID_PEDIDO")
    private Entidad_Pedidos pedido;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Entidad_Usuario usuario;

    private String FECHA_VENTA;
    private String ESTADO;
    

    public long getID_VENTAS() { return ID_VENTAS; }
    public void setID_VENTAS(long ID_VENTAS) { this.ID_VENTAS = ID_VENTAS; }

    public Entidad_Pedidos getPedido() { return pedido; }
    public void setPedido(Entidad_Pedidos pedido) { this.pedido = pedido; }

    public Entidad_Usuario getUsuario() { return usuario; }
    public void setUsuario(Entidad_Usuario usuario) { this.usuario = usuario; }

    public String getFECHA_VENTA() { return FECHA_VENTA; }
    public void setFECHA_VENTA(String FECHA_VENTA) { this.FECHA_VENTA = FECHA_VENTA; }

    public String getESTADO() { return ESTADO; }
    public void setESTADO(String ESTADO) { this.ESTADO = ESTADO; }

}
