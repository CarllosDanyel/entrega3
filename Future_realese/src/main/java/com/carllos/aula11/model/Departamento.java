package com.carllos.aula11.model;

import java.util.UUID;

public class Departamento {
    private UUID idDepartamento;
    private String nome;
    private String sigla;
    private String centroUnidadeAcademica;
    private UUID chefeDepartamentoId;
    private String emailContato;
    private String telefone;
    private String localizacao;

    public Departamento() {
        this.idDepartamento = UUID.randomUUID();
    }

    public Departamento(String nome, String sigla, String centroUnidadeAcademica, UUID chefeDepartamentoId, String emailContato, String telefone, String localizacao) {
        this();
        this.nome = nome;
        this.sigla = sigla;
        this.centroUnidadeAcademica = centroUnidadeAcademica;
        this.chefeDepartamentoId = chefeDepartamentoId;
        this.emailContato = emailContato;
        this.telefone = telefone;
        this.localizacao = localizacao;
    }

    // Getters e Setters
    public UUID getIdDepartamento() { return idDepartamento; }
    public void setIdDepartamento(UUID idDepartamento) { this.idDepartamento = idDepartamento; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getSigla() { return sigla; }
    public void setSigla(String sigla) { this.sigla = sigla; }
    
    public String getCentroUnidadeAcademica() { return centroUnidadeAcademica; }
    public void setCentroUnidadeAcademica(String centroUnidadeAcademica) { this.centroUnidadeAcademica = centroUnidadeAcademica; }
    
    public UUID getChefeDepartamentoId() { return chefeDepartamentoId; }
    public void setChefeDepartamentoId(UUID chefeDepartamentoId) { this.chefeDepartamentoId = chefeDepartamentoId; }
    
    public String getEmailContato() { return emailContato; }
    public void setEmailContato(String emailContato) { this.emailContato = emailContato; }
    
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    
    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
}