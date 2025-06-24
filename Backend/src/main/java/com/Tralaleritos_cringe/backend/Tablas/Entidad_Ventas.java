package com.Tralaleritos_cringe.backend.Tablas;

import jakarta.persistence.*;
import java.time.LocalDateTime;

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
}
