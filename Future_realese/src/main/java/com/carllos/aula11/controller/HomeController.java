package com.carllos.aula11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public Map<String, Object> home() {
        return Map.of(
            "message", "Sistema Acadêmico - API REST",
            "endpoints", Map.of(
                "alunos", "/api/alunos",
                "professores", "/api/professores", 
                "funcionarios", "/api/funcionarios",
                "departamentos", "/api/departamentos"
            )
        );
    }
}