package com.mycompany.sistemapadaria.models;

import java.util.Date;

public class Produto {
    
    private String nomeProduto;
<<<<<<< HEAD
    private String descricaoProduto;
    private float precoProduto;
    private String categoriaProduto;
    private Date validadeProduto;
    private String volumeProduto;
    private String observacoesProduto;

    public Produto(){
        
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
=======
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

>>>>>>> be64f95c8aaf1b601481fcaf8fb9a04bc80145bc

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
<<<<<<< HEAD

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public Date getValidadeProduto() {
        return validadeProduto;
    }

    public void setValidadeProduto(Date validadeProduto) {
        this.validadeProduto = validadeProduto;
    }

    public String getVolumeProduto() {
        return volumeProduto;
    }

    public void setVolumeProduto(String volumeProduto) {
        this.volumeProduto = volumeProduto;
    }

    public String getObservacoesProduto() {
        return observacoesProduto;
    }

    public void setObservacoesProduto(String observacoesProduto) {
        this.observacoesProduto = observacoesProduto;
    }

   
=======
 
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
>>>>>>> be64f95c8aaf1b601481fcaf8fb9a04bc80145bc
      
}
