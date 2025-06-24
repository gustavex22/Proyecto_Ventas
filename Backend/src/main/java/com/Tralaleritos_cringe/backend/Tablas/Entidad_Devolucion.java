package main.java.com.Tralaleritos_cringe.backend.Tablas;

import jakarta.persistence.*;
import java.time.LocalDateTime;

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
}
