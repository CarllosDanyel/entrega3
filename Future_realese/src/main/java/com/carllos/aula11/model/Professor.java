package com.carllos.aula11.model;

import java.util.UUID;

public class Professor {
    private UUID idProfessor;
    private String nomeCompleto;
    private String cpf;
    private String emailInstitucional;
    private String telefone;
    private String titulacao;
    private String areaDeAtuacao;
    private String regimeTrabalho;

    public Professor() {
        this.idProfessor = UUID.randomUUID();
    }

    public Professor(String nomeCompleto, String cpf, String emailInstitucional, String telefone, String titulacao, String areaDeAtuacao, String regimeTrabalho) {
        this();
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.emailInstitucional = emailInstitucional;
        this.telefone = telefone;
        this.titulacao = titulacao;
        this.areaDeAtuacao = areaDeAtuacao;
        this.regimeTrabalho = regimeTrabalho;
    }

    // Getters e Setters
    public UUID getIdProfessor() { return idProfessor; }
    public void setIdProfessor(UUID idProfessor) { this.idProfessor = idProfessor; }
    
    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }
    
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    
    public String getEmailInstitucional() { return emailInstitucional; }
    public void setEmailInstitucional(String emailInstitucional) { this.emailInstitucional = emailInstitucional; }
    
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    
    public String getTitulacao() { return titulacao; }
    public void setTitulacao(String titulacao) { this.titulacao = titulacao; }
    
    public String getAreaDeAtuacao() { return areaDeAtuacao; }
    public void setAreaDeAtuacao(String areaDeAtuacao) { this.areaDeAtuacao = areaDeAtuacao; }
    
    public String getRegimeTrabalho() { return regimeTrabalho; }
    public void setRegimeTrabalho(String regimeTrabalho) { this.regimeTrabalho = regimeTrabalho; }
}