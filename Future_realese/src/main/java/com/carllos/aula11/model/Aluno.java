package com.carllos.aula11.model;

import java.time.LocalDate;
import java.util.UUID;

public class Aluno {
    private UUID idAluno;
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private String cpf;
    private String matricula;
    private String emailInstitucional;
    private String telefone;

    public Aluno() {
        this.idAluno = UUID.randomUUID();
    }

    public Aluno(String nomeCompleto, LocalDate dataNascimento, String cpf, String matricula, String emailInstitucional, String telefone) {
        this();
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.matricula = matricula;
        this.emailInstitucional = emailInstitucional;
        this.telefone = telefone;
    }

    // Getters e Setters
    public UUID getIdAluno() { return idAluno; }
    public void setIdAluno(UUID idAluno) { this.idAluno = idAluno; }
    
    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }
    
    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }
    
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    
    public String getEmailInstitucional() { return emailInstitucional; }
    public void setEmailInstitucional(String emailInstitucional) { this.emailInstitucional = emailInstitucional; }
    
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}