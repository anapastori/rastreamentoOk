package src.main.java.com.example.demo.rastreamento.repository;


import src.main.java.com.example.demo.com.rastreamento.fiap.Caminhao;

import java.util.List;
import java.util.Optional;

public interface CaminhaoRepository extends JpaRepository<Caminhao, Long>{
    List<Caminhao> findAll();

    Caminhao save(Caminhao caminhao);

    Optional<Object> findById(Long id);

    void delete(Caminhao caminhao);
}
