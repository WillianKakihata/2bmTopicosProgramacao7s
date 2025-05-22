package com.example._bmTopicosProgramacao7s.tarefas.enuns;

public enum StatusEnum {
    EM_PROCESSO("andamento"),
    INICIO("inicio"),
    FINALIZADO("finalizado");

    String status;
    StatusEnum(String andamento) {
        this.status = andamento;
    }

    public String getStatus() {
        return status;
    }
}
