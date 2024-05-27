package src.main.java.com.example.demo.rastreamento.repository;

import src.main.java.com.example.demo.com.rastreamento.fiap.Rota;

import java.util.List;
import java.util.Optional;

public interface RotaRepository extends JpaRepository<Rota, Long> {

    List<Rota> findByCaminhaoId(Long caminhaoId);

    List<Rota> findAll();

    Rota save(Rota rota);

    Optional<Object> findById(Long id);

    void delete(Rota rota);
}
