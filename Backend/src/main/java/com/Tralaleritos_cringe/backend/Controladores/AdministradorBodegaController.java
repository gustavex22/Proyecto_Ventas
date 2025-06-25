package com.Tralaleritos_cringe.backend.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Tralaleritos_cringe.backend.Repositorio.AdministradorBodegaRepository;
import com.Tralaleritos_cringe.backend.Tablas.Entidad_AdministradorBodega;

@RestController
@RequestMapping("/api/administradores-bodega")
public class AdministradorBodegaController {
    @Autowired
    private AdministradorBodegaRepository administradorBodegaRepository;

    @GetMapping
    public List<Entidad_AdministradorBodega> listar() {
        return administradorBodegaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Entidad_AdministradorBodega> obtenerPorId(@PathVariable Long id) {
        return administradorBodegaRepository.findById(id);
    }

    @PostMapping
    public Entidad_AdministradorBodega crear(@RequestBody Entidad_AdministradorBodega entidad) {
        return administradorBodegaRepository.save(entidad);
    }

    @PutMapping("/{id}")
    public Entidad_AdministradorBodega actualizar(@PathVariable Long id, @RequestBody Entidad_AdministradorBodega entidad) {
        entidad.setID_ADMINISTRADOR_BODEGA(id);
        return administradorBodegaRepository.save(entidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        administradorBodegaRepository.deleteById(id);
    }
}
