package com.Tralaleritos_cringe.backend.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Tralaleritos_cringe.backend.Repositorio.ClienteRepository;
import com.Tralaleritos_cringe.backend.Tablas.Entidad_Cliente;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Entidad_Cliente> listar() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Entidad_Cliente> obtenerPorId(@PathVariable Long id) {
        return clienteRepository.findById(id);
    }

    @PostMapping
    public Entidad_Cliente crear(@RequestBody Entidad_Cliente entidad) {
        return clienteRepository.save(entidad);
    }

    @PutMapping("/{id}")
    public Entidad_Cliente actualizar(@PathVariable Long id, @RequestBody Entidad_Cliente entidad) {
        entidad.setID_CLIENTE(id);
        return clienteRepository.save(entidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }
}
