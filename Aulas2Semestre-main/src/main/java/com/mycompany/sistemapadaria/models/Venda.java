
package com.mycompany.sistemapadaria.models;

/**
 *
 * @author Vinicius Damaceno
 */
public class Venda {
    
public class CarrinhoDeCompras {
    private String produto;
    private int quantidade;
    private double preco;
    private String categoria;

        public String getProduto() {
            return produto;
        }

        public void setProduto(String produto) {
            this.produto = produto;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }
    }
}
