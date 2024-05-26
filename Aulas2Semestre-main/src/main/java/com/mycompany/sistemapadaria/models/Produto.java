package com.mycompany.sistemapadaria.models;

import java.util.Date;

public class Produto {

    private int idProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private float precoProduto;
    private String categoriaProduto;
    private Date validadeProduto;
    private String volumeProduto;
    private int quantidadeProduto;
    private String observacaoProduto;

    public Produto(int idProduto, String nomeProduto, String descricaoProduto, float precoProduto, String categoriaProduto, String volumeProduto, int quantidadeProduto,String observacaoProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
        this.categoriaProduto = categoriaProduto;
        this.volumeProduto = volumeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.observacaoProduto = observacaoProduto;
    }

    public Produto(String nomeProduto, String descricaoProduto, float precoProduto, String categoriaProduto, Date validadeProduto, String volumeProduto, int quantidadeProduto,String observacaoProduto) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
        this.categoriaProduto = categoriaProduto;
        this.validadeProduto = validadeProduto;
        this.volumeProduto = volumeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.observacaoProduto = observacaoProduto;
    }

    public Produto(int idProduto, String nomeProduto, String descricaoProduto, float precoProduto, String categoriaProduto, Date validadeProduto, String volumeProduto, int quantidadeProduto, String observacaoProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
        this.categoriaProduto = categoriaProduto;
        this.validadeProduto = validadeProduto;
        this.volumeProduto = volumeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.observacaoProduto = observacaoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
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

    public String getObservacaoProduto() {
        return observacaoProduto;
    }

    public void setObservacaoProduto(String observacaoProduto) {
        this.observacaoProduto = observacaoProduto;
    }

}
