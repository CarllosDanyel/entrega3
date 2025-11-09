package com.carllos.aula11.repository;

import com.carllos.aula11.model.Aluno;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AlunoRepository {
    private final Map<UUID, Aluno> alunos = new HashMap<>();

    public List<Aluno> findAll() {
        return new ArrayList<>(alunos.values());
    }

    public Optional<Aluno> findById(UUID id) {
        return Optional.ofNullable(alunos.get(id));
    }

    public Aluno save(Aluno aluno) {
        alunos.put(aluno.getIdAluno(), aluno);
        return aluno;
    }

    public void deleteById(UUID id) {
        alunos.remove(id);
    }

    public Optional<Aluno> findByMatricula(String matricula) {
        return alunos.values().stream()
                .filter(aluno -> aluno.getMatricula().equals(matricula))
                .findFirst();
    }
}