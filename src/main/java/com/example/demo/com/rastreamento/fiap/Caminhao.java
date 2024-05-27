package com.example.demo.com.rastreamento.fiap;

public class Caminhao {

    @src.main.java.com.example.demo.com.rastreamento.fiap.Id
    @src.main.java.com.example.demo.com.rastreamento.fiap.GeneratedValue(strategy = IDENTITY)
    private Long id;

    @src.main.java.com.example.demo.com.rastreamento.fiap.NotBlank(message = "Placa é obrigatória")
    private String placa;

    private String status;

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private static class IDENTITY {
    }
}


