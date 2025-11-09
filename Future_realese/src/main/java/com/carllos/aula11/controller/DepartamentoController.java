package com.carllos.aula11.controller;

import com.carllos.aula11.model.Departamento;
import com.carllos.aula11.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/departamentos")
public class DepartamentoController {
    
    @Autowired
    private DepartamentoRepository departamentoRepository;
    
    @GetMapping
    public List<Departamento> listarTodos() {
        return departamentoRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Departamento> buscarPorId(@PathVariable UUID id) {
        return departamentoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public Departamento criar(@RequestBody Departamento departamento) {
        return departamentoRepository.save(departamento);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Departamento> atualizar(@PathVariable UUID id, @RequestBody Departamento departamento) {
        return departamentoRepository.findById(id)
                .map(existente -> {
                    departamento.setIdDepartamento(id);
                    return ResponseEntity.ok(departamentoRepository.save(departamento));
                })
                .orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        if (departamentoRepository.findById(id).isPresent()) {
            departamentoRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
    
    @GetMapping("/sigla/{sigla}")
    public ResponseEntity<Departamento> buscarPorSigla(@PathVariable String sigla) {
        return departamentoRepository.findBySigla(sigla)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}