package com.Tralaleritos_cringe.backend.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Tralaleritos_cringe.backend.Repositorio.UsuarioRepository;
import com.Tralaleritos_cringe.backend.Tablas.Entidad_Usuario;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Entidad_Usuario> listar() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Entidad_Usuario> obtenerPorId(@PathVariable Long id) {
        return usuarioRepository.findById(id);
    }

    @PostMapping
    public Entidad_Usuario crear(@RequestBody Entidad_Usuario entidad) {
        return usuarioRepository.save(entidad);
    }

    @PutMapping("/{id}")
    public Entidad_Usuario actualizar(@PathVariable Long id, @RequestBody Entidad_Usuario entidad) {
        entidad.setID_USUARIO(id);
        return usuarioRepository.save(entidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }
}
