package com.Tralaleritos_cringe.backend.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Tralaleritos_cringe.backend.Repositorio.DevolucionRepository;
import com.Tralaleritos_cringe.backend.Tablas.Entidad_Devolucion;

@RestController
@RequestMapping("/api/devoluciones")
public class DevolucionController {
    @Autowired
    private DevolucionRepository devolucionRepository;

    @GetMapping
    public List<Entidad_Devolucion> listar() {
        return devolucionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Entidad_Devolucion> obtenerPorId(@PathVariable Long id) {
        return devolucionRepository.findById(id);
    }

    @PostMapping
    public Entidad_Devolucion crear(@RequestBody Entidad_Devolucion entidad) {
        return devolucionRepository.save(entidad);
    }

    @PutMapping("/{id}")
    public Entidad_Devolucion actualizar(@PathVariable Long id, @RequestBody Entidad_Devolucion entidad) {
        entidad.setID_DEVOLUCION(id);
        return devolucionRepository.save(entidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        devolucionRepository.deleteById(id);
    }
}
