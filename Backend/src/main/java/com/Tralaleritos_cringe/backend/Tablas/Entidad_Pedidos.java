package main.java.com.Tralaleritos_cringe.backend.Tablas;

import jakarta.persistence.*;
import java.time.LocalDateTime;

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
}
