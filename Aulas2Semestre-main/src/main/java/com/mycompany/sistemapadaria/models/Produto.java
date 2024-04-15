package com.mycompany.sistemapadaria.models;

import java.util.Date;

public class Produto {
    
    private String nomeProduto;
    private String descricao;
    private float preco;
    private String categoria;
    private Date validade;
    private String volume;
    private String Observacoes;

    public String getNomeProduto() {
        return nomeProduto;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
     public float getPreco() {
        return preco;
    }
      
    public String getCategoria() {
        return categoria;
    }
     public Date getValidade() {
        return validade;
    }
     
    public String getVolume() {
        return volume;
    }
    
    public String getObservacoes() {
        return Observacoes;
    }


    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
 
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

     public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setObservacoes(String Observacoes) {
        this.Observacoes = Observacoes;
    }
      
}
