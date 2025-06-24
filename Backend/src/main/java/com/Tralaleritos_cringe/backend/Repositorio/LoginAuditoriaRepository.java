package com.Tralaleritos_cringe.backend.Repositorio;

import com.Tralaleritos_cringe.backend.Tablas.Entidad_LoginAuditoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginAuditoriaRepository extends JpaRepository<Entidad_LoginAuditoria, Long> {
}
