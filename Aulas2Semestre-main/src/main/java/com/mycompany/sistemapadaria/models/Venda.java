package com.mycompany.sistemapadaria.models;

import java.util.List;
    
public class Venda {
    private int idVenda;
    private int itemVenda;
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private float preco;
    private String formaPagamento;

    public Venda(int cliente, String produto, int quantidade, float preco, String categoria, String formaPagamento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Venda(String cliente, String produto, int quantidade, float preco, String categoria, String formaPagamento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Venda(String cliente, String produto, String quantidade, float preco, String categoria, String formaPagamento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Venda(int cliente, String produto, int quantidade, float preco, String categoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Venda(int itemVenda, Cliente cliente, Produto produto, int quantidade) {
        this.itemVenda = itemVenda;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Venda(String cliente, List<String> produtosSelecionados, String quantidade, String preco, String categoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda(int itemVenda) {
        this.itemVenda = itemVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
