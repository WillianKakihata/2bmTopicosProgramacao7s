package com.example._bmTopicosProgramacao7s.tarefas.controller;

import com.example._bmTopicosProgramacao7s.tarefas.dto.TarefasDTO;
import com.example._bmTopicosProgramacao7s.tarefas.model.Tarefas;
import com.example._bmTopicosProgramacao7s.tarefas.service.TarefasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefasController {
    @Autowired
    TarefasService tarefasService;

    @PostMapping()
    public TarefasDTO create(@RequestBody TarefasDTO tarefas) {
        return this.tarefasService.create(tarefas);
    }

    @GetMapping("/{id}")
    public TarefasDTO findById(@PathVariable Long id) {
        return this.tarefasService.findById(id);
    }

    @GetMapping()
    public List<TarefasDTO> findAll() {
        return this.tarefasService.findall();
    }

    @DeleteMapping("/{id}")
    public TarefasDTO delete(@PathVariable Long id) {
        return this.tarefasService.delete(id);
    }

    @PutMapping("/{id}")
    public TarefasDTO update(@PathVariable Long id, @RequestBody TarefasDTO tarefas) {
        return this.tarefasService.update(tarefas,id);
    }


}
