package com.Tralaleritos_cringe.backend.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Tralaleritos_cringe.backend.Repositorio.RolesRepository;
import com.Tralaleritos_cringe.backend.Tablas.Entidad_Roles;

@RestController
@RequestMapping("/api/roles")
public class RolesController {
    @Autowired
    private RolesRepository rolesRepository;

    @GetMapping
    public List<Entidad_Roles> listar() {
        return rolesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Entidad_Roles> obtenerPorId(@PathVariable Long id) {
        return rolesRepository.findById(id);
    }

    @PostMapping
    public Entidad_Roles crear(@RequestBody Entidad_Roles entidad) {
        return rolesRepository.save(entidad);
    }

    @PutMapping("/{id}")
    public Entidad_Roles actualizar(@PathVariable Long id, @RequestBody Entidad_Roles entidad) {
        entidad.setID_ROL(id);
        return rolesRepository.save(entidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        rolesRepository.deleteById(id);
    }
}
