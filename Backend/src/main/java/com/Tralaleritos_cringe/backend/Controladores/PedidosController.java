package com.Tralaleritos_cringe.backend.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Tralaleritos_cringe.backend.Repositorio.PedidosRepository;
import com.Tralaleritos_cringe.backend.Tablas.Entidad_Pedidos;

@RestController
@RequestMapping("/api/pedidos")
public class PedidosController {
    @Autowired
    private PedidosRepository pedidosRepository;

    @GetMapping
    public List<Entidad_Pedidos> listar() {
        return pedidosRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Entidad_Pedidos> obtenerPorId(@PathVariable Long id) {
        return pedidosRepository.findById(id);
    }

    @PostMapping
    public Entidad_Pedidos crear(@RequestBody Entidad_Pedidos entidad) {
        return pedidosRepository.save(entidad);
    }

    @PutMapping("/{id}")
    public Entidad_Pedidos actualizar(@PathVariable Long id, @RequestBody Entidad_Pedidos entidad) {
        entidad.setID_PEDIDO(id);
        return pedidosRepository.save(entidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        pedidosRepository.deleteById(id);
    }
}
