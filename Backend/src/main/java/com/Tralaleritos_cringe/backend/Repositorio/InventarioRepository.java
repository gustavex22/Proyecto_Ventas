package main.java.com.Tralaleritos_cringe.backend.Repositorio;

import com.Tralaleritos_cringe.backend.Tablas.Entidad_Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Entidad_Inventario, Long> {
}
