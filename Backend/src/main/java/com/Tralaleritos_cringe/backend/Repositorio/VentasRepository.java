package main.java.com.Tralaleritos_cringe.backend.Repositorio;

import com.Tralaleritos_cringe.backend.Tablas.Entidad_Ventas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentasRepository extends JpaRepository<Entidad_Ventas, Long> {
}
