package com.carllos.aula11.controller;

import com.carllos.aula11.model.Funcionario;
import com.carllos.aula11.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {
    
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    
    @GetMapping
    public List<Funcionario> listarTodos() {
        return funcionarioRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> buscarPorId(@PathVariable UUID id) {
        return funcionarioRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public Funcionario criar(@RequestBody Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> atualizar(@PathVariable UUID id, @RequestBody Funcionario funcionario) {
        return funcionarioRepository.findById(id)
                .map(existente -> {
                    funcionario.setIdFuncionario(id);
                    return ResponseEntity.ok(funcionarioRepository.save(funcionario));
                })
                .orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        if (funcionarioRepository.findById(id).isPresent()) {
            funcionarioRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}