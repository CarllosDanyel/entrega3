package com.carllos.aula11.repository;

import com.carllos.aula11.model.Funcionario;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FuncionarioRepository {
    private final Map<UUID, Funcionario> funcionarios = new HashMap<>();

    public List<Funcionario> findAll() {
        return new ArrayList<>(funcionarios.values());
    }

    public Optional<Funcionario> findById(UUID id) {
        return Optional.ofNullable(funcionarios.get(id));
    }

    public Funcionario save(Funcionario funcionario) {
        funcionarios.put(funcionario.getIdFuncionario(), funcionario);
        return funcionario;
    }

    public void deleteById(UUID id) {
        funcionarios.remove(id);
    }
}