package com.Tralaleritos_cringe.backend.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Tralaleritos_cringe.backend.Repositorio.AuditoriaStockRepository;
import com.Tralaleritos_cringe.backend.Tablas.Entidad_AuditoriaStock;

@RestController
@RequestMapping("/api/auditoria-stock")
public class AuditoriaStockController {
    @Autowired
    private AuditoriaStockRepository auditoriaStockRepository;

    @GetMapping
    public List<Entidad_AuditoriaStock> listar() {
        return auditoriaStockRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Entidad_AuditoriaStock> obtenerPorId(@PathVariable Long id) {
        return auditoriaStockRepository.findById(id);
    }

    @PostMapping
    public Entidad_AuditoriaStock crear(@RequestBody Entidad_AuditoriaStock entidad) {
        return auditoriaStockRepository.save(entidad);
    }

    @PutMapping("/{id}")
    public Entidad_AuditoriaStock actualizar(@PathVariable Long id, @RequestBody Entidad_AuditoriaStock entidad) {
        entidad.setID_AUDITORIA_STOCK(id);
        return auditoriaStockRepository.save(entidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        auditoriaStockRepository.deleteById(id);
    }
}
