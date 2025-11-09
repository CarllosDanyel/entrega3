package com.carllos.aula11.controller;

import com.carllos.aula11.model.Aluno;
import com.carllos.aula11.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {
    
    @Autowired
    private AlunoService alunoService;
    
    @GetMapping
    public List<Aluno> listarTodos() {
        return alunoService.listarTodos();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscarPorId(@PathVariable UUID id) {
        return alunoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public Aluno criar(@RequestBody Aluno aluno) {
        return alunoService.salvar(aluno);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Aluno> atualizar(@PathVariable UUID id, @RequestBody Aluno aluno) {
        return alunoService.buscarPorId(id)
                .map(existente -> {
                    aluno.setIdAluno(id);
                    return ResponseEntity.ok(alunoService.salvar(aluno));
                })
                .orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        if (alunoService.buscarPorId(id).isPresent()) {
            alunoService.deletar(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
    
    @GetMapping("/matricula/{matricula}")
    public ResponseEntity<Aluno> buscarPorMatricula(@PathVariable String matricula) {
        return alunoService.buscarPorMatricula(matricula)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}