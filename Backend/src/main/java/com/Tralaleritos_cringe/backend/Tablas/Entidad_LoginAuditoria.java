package main.java.com.Tralaleritos_cringe.backend.Tablas;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "LOGIN_AUDITORIA")
public class Entidad_LoginAuditoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_AUDITORIA;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Entidad_Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_ROL")
    private Entidad_Roles rol;

    private String ESTADO_LOGIN;
    private String TIPO_ACCION;
    private String CAMPO_MODIFICADO;
    private String DATO_ANTERIOR;
    private String DATO_NUEVO;
    private LocalDate FECHA_CREACION;
    private LocalDate FECHA_ACCION;
    private String IP_ADDRESS;
}
