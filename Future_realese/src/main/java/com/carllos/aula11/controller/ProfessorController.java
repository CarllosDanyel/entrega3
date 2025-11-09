package com.carllos.aula11.controller;

import com.carllos.aula11.model.Professor;
import com.carllos.aula11.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/professores")
public class ProfessorController {
    
    @Autowired
    private ProfessorRepository professorRepository;
    
    @GetMapping
    public List<Professor> listarTodos() {
        return professorRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Professor> buscarPorId(@PathVariable UUID id) {
        return professorRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public Professor criar(@RequestBody Professor professor) {
        return professorRepository.save(professor);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Professor> atualizar(@PathVariable UUID id, @RequestBody Professor professor) {
        return professorRepository.findById(id)
                .map(existente -> {
                    professor.setIdProfessor(id);
                    return ResponseEntity.ok(professorRepository.save(professor));
                })
                .orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        if (professorRepository.findById(id).isPresent()) {
            professorRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}