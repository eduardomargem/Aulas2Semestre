
package com.mycompany.sistemapadaria.models;

import java.util.Date;

public class Relatorios {
     
private int datainicio;
    private int datadefim;
    private int data;
    private String cliente;
    private int valortotal;
    private int codigodoproduto;
    private String nome;
    private int quantidade;
    private int valorunitario;
    
    public void setDatainicio (int Datainicio){
        this.datainicio = datainicio;
    }
    public void setData (int Data){
        this.data = data;
    }
    public void setCliente (String Cliente){
        this.cliente = cliente;
    }
    public void setValortotal (int Valortotal){
        this.valortotal = valortotal;
    }
    public void setCodigoproduto (int codigoproduto){
        this.codigodoproduto = codigoproduto;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public void setQuantidade (int quantidade){
        this.quantidade = quantidade;
    }
    public void setValorunitario (int valorunitario){
        this.valorunitario = valorunitario;
    }
    public int getDatainicio(){
        return datainicio;
    }
    public String getNome(){
        return nome;
    }
    public int getData(){
        return data;
    }
    public String getCliente(){
        return cliente;
    }
    public int getValortotal(){
        return valortotal;
    }
    public int getCodigodoproduto(){
        return codigodoproduto;
    }
    public int getDatadefim(){
        return datadefim;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public int getValorunitario(){
        return valorunitario;
    }
}    