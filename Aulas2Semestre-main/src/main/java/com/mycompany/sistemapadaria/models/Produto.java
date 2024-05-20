package com.mycompany.sistemapadaria.models;

import java.util.Date;

public class Produto {
    
    private String nomeProduto;
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

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

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

   
      
}
