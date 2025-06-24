package main.java.com.Tralaleritos_cringe.backend.Tablas;

import jakarta.persistence.*;

@Entity
@Table(name = "ADMINISTRADOR_BODEGA")
public class Entidad_AdministradorBodega {
    @Id
    private long ADMIN_ID;

    @ManyToOne
    @JoinColumn(name = "ID_ROL")
    private Entidad_Roles rol;

    @ManyToOne
    @JoinColumn(name = "ID_BODEGA")
    private Entidad_SucursalBodega bodega;

    private String ROL_ADMINISTRATIVO;
}
