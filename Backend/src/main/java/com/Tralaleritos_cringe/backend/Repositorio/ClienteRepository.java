package main.java.com.Tralaleritos_cringe.backend.Repositorio;

import com.Tralaleritos_cringe.backend.Tablas.Entidad_Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Entidad_Cliente, Long> {
}
