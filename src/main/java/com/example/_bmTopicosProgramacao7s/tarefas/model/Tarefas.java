package com.example._bmTopicosProgramacao7s.tarefas.model;

import com.example._bmTopicosProgramacao7s.tarefas.enuns.StatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "tarefas")
@Entity(name = "tarefas")
public class Tarefas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "titulos")
    String titulo;

    @Column(name = "descricao")
    String descricao;

    @Column(name = "status")
    StatusEnum status;

}
