package com.example.salaoBeleza_backend.Model;

public enum StatusAgendamento {
    REALIZADO("Realizado"),
    PENDENTE("Pendente");

    private String descricao;

    StatusAgendamento(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
