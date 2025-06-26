package com.Tralaleritos_cringe.backend.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Tralaleritos_cringe.backend.Repositorio.VentasRepository;
import com.Tralaleritos_cringe.backend.Tablas.Entidad_Ventas;

@RestController
@RequestMapping("/api/ventas")
public class VentasController {
    @Autowired
    private VentasRepository ventasRepository;

    @GetMapping
    public List<Entidad_Ventas> listar() {
        return ventasRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Entidad_Ventas> obtenerPorId(@PathVariable Long id) {
        return ventasRepository.findById(id);
    }

    @PostMapping
    public Entidad_Ventas crear(@RequestBody Entidad_Ventas entidad) {
        return ventasRepository.save(entidad);
    }

    @PutMapping("/{id}")
    public Entidad_Ventas actualizar(@PathVariable Long id, @RequestBody Entidad_Ventas entidad) {
        entidad.setID_VENTAS(id);
        return ventasRepository.save(entidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        ventasRepository.deleteById(id);
    }
}

