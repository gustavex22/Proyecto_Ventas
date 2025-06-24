package main.java.com.Tralaleritos_cringe.backend.Tablas;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "INVENTARIO")
public class Entidad_Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_INVENTARIO;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTO")
    private Entidad_Producto producto;

    @ManyToOne
    @JoinColumn(name = "ID_BODEGA")
    private Entidad_SucursalBodega bodega;

    @ManyToOne
    @JoinColumn(name = "ID_PROVEEDOR")
    private Entidad_Proveedor proveedor;

    private int CANTIDAD;
    private LocalDateTime FECHA_INGRESO;
    private LocalDateTime FECHA_ACTUALIZACION;
    private BigDecimal COSTO_UNITARIO;
    private BigDecimal COSTO_VENTA;
    private String ESTADO;
    private int MINIMO_STOCK;
    private int MAXIMO_STOCK;
}
