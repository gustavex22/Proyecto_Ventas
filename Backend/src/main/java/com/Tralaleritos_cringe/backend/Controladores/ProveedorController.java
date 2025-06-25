package com.Tralaleritos_cringe.backend.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Tralaleritos_cringe.backend.Repositorio.ProveedorRepository;
import com.Tralaleritos_cringe.backend.Tablas.Entidad_Proveedor;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {
    @Autowired
    private ProveedorRepository proveedorRepository;

    @GetMapping
    public List<Entidad_Proveedor> listar() {
        return proveedorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Entidad_Proveedor> obtenerPorId(@PathVariable Long id) {
        return proveedorRepository.findById(id);
    }

    @PostMapping
    public Entidad_Proveedor crear(@RequestBody Entidad_Proveedor entidad) {
        return proveedorRepository.save(entidad);
    }

    @PutMapping("/{id}")
    public Entidad_Proveedor actualizar(@PathVariable Long id, @RequestBody Entidad_Proveedor entidad) {
        entidad.setID_PROVEEDOR(id);
        return proveedorRepository.save(entidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        proveedorRepository.deleteById(id);
    }
}
