package com.mycompany.sistemapadaria.models;

import java.util.Date;

public class RelatorioSintetico {
    private int idVenda;
    private Date dataVenda;
    private int idCliente;
    private String nomeCliente;
    private double valorVenda;

    public RelatorioSintetico(int idVenda, Date dataVenda, int idCliente, String nomeCLiente, double valorVenda) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.idCliente = idCliente;
        this.nomeCliente = nomeCLiente;
        this.valorVenda = valorVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCLiente() {
        return nomeCliente;
    }

    public void setNomeCLiente(String nomeCLiente) {
        this.nomeCliente = nomeCLiente;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
}
