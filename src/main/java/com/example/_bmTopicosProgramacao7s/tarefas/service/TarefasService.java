package com.example._bmTopicosProgramacao7s.tarefas.service;


import com.example._bmTopicosProgramacao7s.tarefas.model.Tarefas;
import com.example._bmTopicosProgramacao7s.tarefas.repository.TarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefasService {
    @Autowired
    TarefasRepository tarefasRepository;

    public Tarefas create(Tarefas tarefas){
        Tarefas novaTarefa = this.tarefasRepository.save(tarefas);
        return novaTarefa;
    }
}
