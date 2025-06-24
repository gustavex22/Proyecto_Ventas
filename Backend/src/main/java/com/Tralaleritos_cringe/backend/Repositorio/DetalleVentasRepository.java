package main.java.com.Tralaleritos_cringe.backend.Repositorio;

import com.Tralaleritos_cringe.backend.Tablas.Entidad_DetalleVentas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleVentasRepository extends JpaRepository<Entidad_DetalleVentas, Long> {
}
