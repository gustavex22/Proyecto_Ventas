package com.Tralaleritos_cringe.backend.Tablas;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "PEDIDOS")
public class Entidad_Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_PEDIDO;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Entidad_Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_BODEGA")
    private Entidad_SucursalBodega bodega;

    private LocalDateTime FECHA;
    private Integer ESTADO;
    private String METODO_PAGO;
    private java.math.BigDecimal TOTAL;

    public long getID_PEDIDO() { return ID_PEDIDO; }
    public void setID_PEDIDO(long ID_PEDIDO) { this.ID_PEDIDO = ID_PEDIDO; }

    public Entidad_Usuario getUsuario() { return usuario; }
    public void setUsuario(Entidad_Usuario usuario) { this.usuario = usuario; }

    public Entidad_SucursalBodega getBodega() { return bodega; }
    public void setBodega(Entidad_SucursalBodega bodega) { this.bodega = bodega; }

    public java.time.LocalDateTime getFECHA() { return FECHA; }
    public void setFECHA(java.time.LocalDateTime FECHA) { this.FECHA = FECHA; }

    public Integer getESTADO() { return ESTADO; }
    public void setESTADO(Integer ESTADO) { this.ESTADO = ESTADO; }

    public String getMETODO_PAGO() { return METODO_PAGO; }
    public void setMETODO_PAGO(String METODO_PAGO) { this.METODO_PAGO = METODO_PAGO; }

    public java.math.BigDecimal getTOTAL() { return TOTAL; }
    public void setTOTAL(java.math.BigDecimal TOTAL) { this.TOTAL = TOTAL; }
}
