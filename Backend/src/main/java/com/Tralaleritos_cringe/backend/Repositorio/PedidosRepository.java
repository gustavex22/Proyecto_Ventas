package main.java.com.Tralaleritos_cringe.backend.Repositorio;

import com.Tralaleritos_cringe.backend.Tablas.Entidad_Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Entidad_Pedidos, Long> {
}
