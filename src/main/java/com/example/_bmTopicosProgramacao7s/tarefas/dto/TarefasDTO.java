package com.example._bmTopicosProgramacao7s.tarefas.dto;
import com.example._bmTopicosProgramacao7s.tarefas.enuns.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarefasDTO {
    private String titulo;
    private String descricao;
    private StatusEnum status;
}
