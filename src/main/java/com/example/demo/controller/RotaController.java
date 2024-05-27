package src.main.java.com.example.demo.controller;

import src.main.java.com.example.demo.com.rastreamento.fiap.Rota;
import src.main.java.com.example.demo.rastreamento.repository.RotaRepository;

import java.util.List;

public class RotaController {


    private RotaRepository rotaRepository;


    public List<Rota> getAllRotas() {
        return rotaRepository.findAll();
    }

    public Rota createRota(Rota rota) {
        return rotaRepository.save(rota);
    }

    public Rota updateRota(Long id, Rota rotaDetails) {
        Rota rota = rotaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Rota não encontrada"));
        rota.setDescricao(rotaDetails.getDescricao());
        rota.setLatitude(rotaDetails.getLatitude());
        rota.setLongitude(rotaDetails.getLongitude());
        return rotaRepository.save(rota);
    }

    public ResponseEntity<?> deleteRota(Long id) {
        Rota rota = rotaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Rota não encontrada"));
        rotaRepository.delete(rota);
        return (ResponseEntity<?>) (ResponseEntity<?>) ResponseEntity.ok().build();
    }

    public List<Rota> getRotasByCaminhao(Long caminhaoId) {
        return rotaRepository.findByCaminhaoId(caminhaoId);
    }
}