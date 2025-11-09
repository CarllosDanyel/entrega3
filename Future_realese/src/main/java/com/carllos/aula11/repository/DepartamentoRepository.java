package com.carllos.aula11.repository;

import com.carllos.aula11.model.Departamento;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class DepartamentoRepository {
    private final Map<UUID, Departamento> departamentos = new HashMap<>();

    public List<Departamento> findAll() {
        return new ArrayList<>(departamentos.values());
    }

    public Optional<Departamento> findById(UUID id) {
        return Optional.ofNullable(departamentos.get(id));
    }

    public Departamento save(Departamento departamento) {
        departamentos.put(departamento.getIdDepartamento(), departamento);
        return departamento;
    }

    public void deleteById(UUID id) {
        departamentos.remove(id);
    }

    public Optional<Departamento> findBySigla(String sigla) {
        return departamentos.values().stream()
                .filter(dept -> dept.getSigla().equals(sigla))
                .findFirst();
    }
}