package com.example._bmTopicosProgramacao7s.tarefas.controller;

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
    public Tarefas create(@RequestBody Tarefas tarefas) {
        return this.tarefasService.create(tarefas);
    }

    @GetMapping("/{id}")
    public Tarefas findById(@PathVariable Long id) {
        return this.tarefasService.findById(id);
    }

    @GetMapping()
    public List<Tarefas> findAll() {
        return this.tarefasService.findall();
    }

    @DeleteMapping("/{id}")
    public Tarefas delete(@PathVariable Long id) {
        return this.tarefasService.delete(id);
    }

    @PutMapping("/{id}")
    public Tarefas update(@PathVariable Long id, @RequestBody Tarefas tarefas) {
        return this.tarefasService.update(tarefas,id);
    }


}
