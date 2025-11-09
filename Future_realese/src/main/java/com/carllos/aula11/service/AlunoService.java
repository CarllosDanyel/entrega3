package com.carllos.aula11.service;

import com.carllos.aula11.model.Aluno;
import com.carllos.aula11.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AlunoService {
    
    @Autowired
    private AlunoRepository alunoRepository;
    
    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }
    
    public Optional<Aluno> buscarPorId(UUID id) {
        return alunoRepository.findById(id);
    }
    
    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
    
    public void deletar(UUID id) {
        alunoRepository.deleteById(id);
    }
    
    public Optional<Aluno> buscarPorMatricula(String matricula) {
        return alunoRepository.findByMatricula(matricula);
    }
}