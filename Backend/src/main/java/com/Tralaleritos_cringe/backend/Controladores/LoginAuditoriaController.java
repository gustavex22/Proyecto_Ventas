package com.Tralaleritos_cringe.backend.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Tralaleritos_cringe.backend.Repositorio.LoginAuditoriaRepository;
import com.Tralaleritos_cringe.backend.Tablas.Entidad_LoginAuditoria;

@RestController
@RequestMapping("/api/login-auditoria")
public class LoginAuditoriaController {
    @Autowired
    private LoginAuditoriaRepository loginAuditoriaRepository;

    @GetMapping
    public List<Entidad_LoginAuditoria> listar() {
        return loginAuditoriaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Entidad_LoginAuditoria> obtenerPorId(@PathVariable Long id) {
        return loginAuditoriaRepository.findById(id);
    }

    @PostMapping
    public Entidad_LoginAuditoria crear(@RequestBody Entidad_LoginAuditoria entidad) {
        return loginAuditoriaRepository.save(entidad);
    }

    @PutMapping("/{id}")
    public Entidad_LoginAuditoria actualizar(@PathVariable Long id, @RequestBody Entidad_LoginAuditoria entidad) {
        entidad.setID_LOGIN_AUDITORIA(id);
        return loginAuditoriaRepository.save(entidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        loginAuditoriaRepository.deleteById(id);
    }
}
