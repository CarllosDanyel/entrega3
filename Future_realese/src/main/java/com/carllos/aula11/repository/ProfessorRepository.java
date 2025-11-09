package com.carllos.aula11.repository;

import com.carllos.aula11.model.Professor;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProfessorRepository {
    private final Map<UUID, Professor> professores = new HashMap<>();

    public List<Professor> findAll() {
        return new ArrayList<>(professores.values());
    }

    public Optional<Professor> findById(UUID id) {
        return Optional.ofNullable(professores.get(id));
    }

    public Professor save(Professor professor) {
        professores.put(professor.getIdProfessor(), professor);
        return professor;
    }

    public void deleteById(UUID id) {
        professores.remove(id);
    }
}