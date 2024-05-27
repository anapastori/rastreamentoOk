package src.main.java.com.example.demo.controller;

import src.main.java.com.example.demo.com.rastreamento.fiap.Caminhao;
import src.main.java.com.example.demo.rastreamento.repository.CaminhaoRepository;

import java.util.List;

public class CaminhaoController {


    private CaminhaoRepository caminhaoRepository;


    public List<Caminhao> getAllCaminhoes() {

        return caminhaoRepository.findAll();
    }


    public Caminhao createCaminhao(Caminhao caminhao) {
        return caminhaoRepository.save(caminhao);
    }


    public Caminhao updateCaminhao(Long id, Caminhao caminhaoDetails) {
        Caminhao caminhao = (Caminhao) (Caminhao) caminhaoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Caminhão não encontrado"));
        caminhao.setPlaca(caminhaoDetails.getPlaca());
        caminhao.setStatus(caminhaoDetails.getStatus());
        return caminhaoRepository.save(caminhao);
    }


    public ResponseEntity<?> deleteCaminhao(Long id) {
        Caminhao caminhao = caminhaoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Caminhão não encontrado"));
        caminhaoRepository.delete(caminhao);
        return ResponseEntity.ok().build();
    }
}
