package main.java.com.Tralaleritos_cringe.backend.Tablas;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "DETALLE_VENTAS")
public class Entidad_DetalleVentas {
    @Id
    private long ID_DETALLE;

    @ManyToOne
    @JoinColumn(name = "ID_VENTAS")
    private Entidad_Ventas ventas;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTO")
    private Entidad_Producto producto;

    private int CANTIDAD;
    private BigDecimal PRECIO_UNITARIO;
    // SUB_TOTAL is a computed column in SQL, not mapped here
}
