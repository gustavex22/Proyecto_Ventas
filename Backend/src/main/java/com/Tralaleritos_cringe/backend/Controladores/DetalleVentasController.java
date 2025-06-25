package com.Tralaleritos_cringe.backend.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Tralaleritos_cringe.backend.Repositorio.DetalleVentasRepository;
import com.Tralaleritos_cringe.backend.Tablas.Entidad_DetalleVentas;

@RestController
@RequestMapping("/api/detalle-ventas")
public class DetalleVentasController {
    @Autowired
    private DetalleVentasRepository detalleVentasRepository;

    @GetMapping
    public List<Entidad_DetalleVentas> listar() {
        return detalleVentasRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Entidad_DetalleVentas> obtenerPorId(@PathVariable Long id) {
        return detalleVentasRepository.findById(id);
    }

    @PostMapping
    public Entidad_DetalleVentas crear(@RequestBody Entidad_DetalleVentas entidad) {
        return detalleVentasRepository.save(entidad);
    }

    @PutMapping("/{id}")
    public Entidad_DetalleVentas actualizar(@PathVariable Long id, @RequestBody Entidad_DetalleVentas entidad) {
        entidad.setID_DETALLE_VENTA(id);
        return detalleVentasRepository.save(entidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        detalleVentasRepository.deleteById(id);
    }
}
