package com.example._bmTopicosProgramacao7s.tarefas.service;
import com.example._bmTopicosProgramacao7s.tarefas.model.Tarefas;
import com.example._bmTopicosProgramacao7s.tarefas.repository.TarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefasService {
    @Autowired
    TarefasRepository tarefasRepository;

    public Tarefas create(Tarefas tarefas){
        Tarefas novaTarefa = this.tarefasRepository.save(tarefas);
        return novaTarefa;
    }

    public Tarefas update(Tarefas novatarefa, Long Id) {
        Tarefas tarefa = tarefasRepository.findById(Id).orElse(null);
        if(tarefa != null) {
            tarefa.setTitulo(novatarefa.getTitulo());
            tarefa.setDescricao(novatarefa.getDescricao());
            tarefa.setStatus(novatarefa.getStatus());
            return tarefasRepository.save(tarefa);
        }
        return tarefa;
    }

    public List<Tarefas> findall() {
        return tarefasRepository.findAll();
    }

    public Tarefas findById(Long id) {
        return tarefasRepository.findById(id).get();
    }

    public Tarefas delete(Long id) {
        Tarefas tarefa = findById(id);
        tarefasRepository.deleteById(id);
        return tarefa;
    }
}
