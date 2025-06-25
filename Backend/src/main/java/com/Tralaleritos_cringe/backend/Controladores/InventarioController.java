package com.Tralaleritos_cringe.backend.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Tralaleritos_cringe.backend.Repositorio.InventarioRepository;
import com.Tralaleritos_cringe.backend.Tablas.Entidad_Inventario;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {
    @Autowired
    private InventarioRepository inventarioRepository;

    @GetMapping
    public List<Entidad_Inventario> listar() {
        return inventarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Entidad_Inventario> obtenerPorId(@PathVariable Long id) {
        return inventarioRepository.findById(id);
    }

    @PostMapping
    public Entidad_Inventario crear(@RequestBody Entidad_Inventario entidad) {
        return inventarioRepository.save(entidad);
    }

    @PutMapping("/{id}")
    public Entidad_Inventario actualizar(@PathVariable Long id, @RequestBody Entidad_Inventario entidad) {
        entidad.setID_INVENTARIO(id);
        return inventarioRepository.save(entidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        inventarioRepository.deleteById(id);
    }
}
