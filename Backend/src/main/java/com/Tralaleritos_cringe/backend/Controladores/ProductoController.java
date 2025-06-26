package com.Tralaleritos_cringe.backend.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Tralaleritos_cringe.backend.Repositorio.ProductoRepository;
import com.Tralaleritos_cringe.backend.Tablas.Entidad_Producto;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    public List<Entidad_Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @PostMapping
    public Entidad_Producto crearProducto(@RequestBody Entidad_Producto producto) {
        return productoRepository.save(producto);
    }
    @PutMapping("/{id}")
    public Entidad_Producto actualizar(@PathVariable Long id, @RequestBody Entidad_Producto entidad) {
        entidad.setID_PRODUCTO(id);
        return productoRepository.save(entidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        productoRepository.deleteById(id);
    }
}
