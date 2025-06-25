package com.Tralaleritos_cringe.backend.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Tralaleritos_cringe.backend.Repositorio.SucursalBodegaRepository;
import com.Tralaleritos_cringe.backend.Tablas.Entidad_SucursalBodega;

@RestController
@RequestMapping("/api/sucursales-bodega")
public class SucursalBodegaController {
    @Autowired
    private SucursalBodegaRepository sucursalBodegaRepository;

    @GetMapping
    public List<Entidad_SucursalBodega> listar() {
        return sucursalBodegaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Entidad_SucursalBodega> obtenerPorId(@PathVariable Long id) {
        return sucursalBodegaRepository.findById(id);
    }

    @PostMapping
    public Entidad_SucursalBodega crear(@RequestBody Entidad_SucursalBodega entidad) {
        return sucursalBodegaRepository.save(entidad);
    }

    @PutMapping("/{id}")
    public Entidad_SucursalBodega actualizar(@PathVariable Long id, @RequestBody Entidad_SucursalBodega entidad) {
        entidad.setID_SUCURSAL_BODEGA(id);
        return sucursalBodegaRepository.save(entidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        sucursalBodegaRepository.deleteById(id);
    }
}
