package com.mycompany.sistemapadaria.models;

import java.util.Date;

public class Cliente {
    // Atributos da classe
    private String nome;
    private int cpf;
    private int telefone;
    private String email;
    private String sexo;
    private String civil;
    private Date nascimento;
    private String endereco;
    private int numeroCasa;
    private String bairro;
    private String cidade;
    private String complemento;
    private int cep;
    private String estado;
    
    //Setters
    public void setNome(String cNome) {
        this.nome = cNome;
    }
    
    public void setCpf(int cCpf) {
        this.cpf = cCpf;
    }
    
    public void setTelefone(int cTelefone) {
        this.telefone = cTelefone;
    }
    
    public void setEmail(String cEmail) {
        this.email = cEmail;
    }
    
    public void setSexo(String cSexo) {
        this.sexo = cSexo;
    }
    
    public void setCivil(String cCivil) {
        this.civil = cCivil;
    }
    
    public void setNascimento(Date cNascimento) {
        this.nascimento = cNascimento;
    }
    
    public void setEndereco(String cEndereco) {
        this.endereco = cEndereco;
    }
    
    public void setNumeroCasa(int cNumeroCasa) {
        this.numeroCasa = cNumeroCasa;
    }
    
    public void setBairro(String cBairro) {
        this.bairro = cBairro;
    }
    
    public void setCidade(String cCidade) {
        this.cidade = cCidade;
    }
    
    public void setComplemento(String cComplemento) {
        this.complemento = cComplemento;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //Getters
    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCivil() {
        return civil;
    }
    
    public Date getNascimento() {
        return nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public int getCep() {
        return cep;
    }

    public String getEstado() {
        return estado;
    }
    
    //Métodos
    public void cadastrar() {
        
    }
}
