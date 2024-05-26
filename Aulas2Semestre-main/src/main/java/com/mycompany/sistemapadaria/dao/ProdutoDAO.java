/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapadaria.dao;

import com.mycompany.sistemapadaria.models.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardo.mcjesus
 */

/** 
 * Classe para conexão do sistema ao banco de dados
 * @version 1.0.0
 * @since 2024-05-13
 */
public class ProdutoDAO {

    public static String url = "jdbc:mysql://localhost:3306/sistemapadaria";
    public static String usuario = "root";
    public static String senha = "admin";
    /**
     * Abre a conexão com o banco de dados e cadastra um produto.
     * 
     * @param obj O objeto Produto a ser cadastrado.
     * @return true se o produto foi cadastrado com sucesso, false caso contrário.
     */
    public static boolean cadastrar(Produto obj) {
        boolean retorno = false;
        Connection conexao = null;

        try {
            // 1) Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2) Abrir conexão
            conexao = DriverManager.getConnection(url, usuario, senha);

            // 3) Preparar o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO produto (idProduto, nomeProduto, descricaoProduto, precoProduto, categoriaProduto, validadeProduto, volumeProduto, quantidadeProduto, observacaoProduto) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            // 4) Passar parâmetros para o comando SQL
            comandoSQL.setInt(1, obj.getIdProduto());
            comandoSQL.setString(2, obj.getNomeProduto());
            comandoSQL.setString(3, obj.getDescricaoProduto());
            comandoSQL.setFloat(4, obj.getPrecoProduto());
            comandoSQL.setString(5, obj.getCategoriaProduto());
            comandoSQL.setDate(6, new java.sql.Date(obj.getValidadeProduto().getTime()));
            comandoSQL.setString(7, obj.getVolumeProduto());
            comandoSQL.setInt(8, obj.getQuantidadeProduto());
            comandoSQL.setString(9, obj.getObservacaoProduto());
            // 5) Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                // Gravou com sucesso!
                retorno = true;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return retorno;
    }
    /**
     * Abre a conexão com o banco de dados e altera um produto existente.
     * 
     * @param obj O objeto Produto a ser alterado.
     * @return true se o produto foi alterado com sucesso, false caso contrário.
     */
    public static boolean alterar(Produto obj) {
        boolean retorno = false;
        Connection conexao = null;

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
        
            conexao = DriverManager.getConnection(url, usuario, senha);

            
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE produto SET nomeProduto = ?, descricaoProduto = ?, precoProduto = ?, categoriaProduto = ?, validadeProduto = ?, volumeProduto = ?, quantidadeProduto = ?, observacaoProduto = ? WHERE idProduto = ?");
            comandoSQL.setString(1, obj.getNomeProduto());
            comandoSQL.setString(2, obj.getDescricaoProduto());
            comandoSQL.setFloat(3, obj.getPrecoProduto());
            comandoSQL.setString(4, obj.getCategoriaProduto());
            comandoSQL.setDate(5, new java.sql.Date(obj.getValidadeProduto().getTime()));
            comandoSQL.setString(6, obj.getVolumeProduto());
            comandoSQL.setInt(7, obj.getQuantidadeProduto());
            comandoSQL.setString(8, obj.getObservacaoProduto());
            comandoSQL.setInt(9, obj.getIdProduto());
          
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
              
                retorno = true;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return retorno;
    }
    /**
     * Abre a conexão com o banco de dados e exclui um produto pelo seu ID.
     * 
     * @param idExcluir O ID do produto a ser excluído.
     * @return true se o produto foi excluído com sucesso, false caso contrário.
     */
    public static boolean excluir(int idExcluir) {
        boolean retorno = false;
        Connection conexao = null;

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM produto WHERE idProduto = ?");
            comandoSQL.setInt(1, idExcluir);
            
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                
                retorno = true;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return retorno;
    }
    /**
     * Abre a conexão com o banco de dados e lista todos os produtos.
     * 
     * @return Uma lista de objetos Produto.
     */
    public static ArrayList<Produto> listar() {
        ArrayList<Produto> lstProduto = new ArrayList<>();
        Connection conexao = null;
        ResultSet rs = null;
        try {        
         
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM produto");
            
            rs = comandoSQL.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("idProduto");
                String nome = rs.getString("nomeProduto");
                String descricao = rs.getString("descricaoProduto");
                float preco = rs.getFloat("precoProduto");
                String categoria = rs.getString("categoriaProduto");
                Date dataValidade = new java.util.Date(rs.getDate("validadeProduto").getTime());
                String volume = rs.getString("volumeProduto");
                int quantidade = rs.getInt("quantidadeProduto");
                String observacoes = rs.getString("observacaoProduto");

                Produto item = new Produto(id, nome, descricao, preco, categoria, dataValidade, volume, quantidade, observacoes);
                lstProduto.add(item);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstProduto;
    }
     /**
     * Abre a conexão com o banco de dados e busca produtos por categoria.
     * 
     * @param categoriaProduto A categoria dos produtos a serem buscados.
     * @return Uma lista de objetos Produto que pertencem à categoria especificada.
     */
    public static ArrayList<Produto> buscarCategoria(String categoriaProduto) {
        ArrayList<Produto> lstProduto = new ArrayList<>();
        Connection conexao = null;
        ResultSet rs = null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE categoriaProduto = ?");
            
            comandoSQL.setString(1, categoriaProduto);
            rs = comandoSQL.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("idProduto");
                String nome = rs.getString("nomeProduto");
                String descricao = rs.getString("descricaoProduto");
                float preco = rs.getFloat("precoProduto");
                String categoria = rs.getString("categoriaProduto");
                Date dataValidade = new java.util.Date(rs.getDate("validadeProduto").getTime());
                String volume = rs.getString("volumeProduto");
                int quantidade = rs.getInt("quantidadeProduto");
                String observacoes = rs.getString("observacaoProduto");

                Produto item = new Produto(id, nome, descricao, preco, categoria, dataValidade, volume, quantidade,observacoes);
                lstProduto.add(item);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstProduto;
    }
    /**
     * Abre a conexão com o banco de dados e busca produtos por data de validade.
     * 
     * @param validadeProduto A data de validade dos produtos a serem buscados.
     * @return Uma lista de objetos Produto que possuem a data de validade especificada.
     */
    public static ArrayList<Produto> buscarValidade(Date validadeProduto){
        ArrayList<Produto> lstProduto = new ArrayList<>();
        Connection conexao = null;
        ResultSet rs = null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE validadeProduto = ?");
            
            comandoSQL.setDate(1,new java.sql.Date( validadeProduto.getTime()));
            rs = comandoSQL.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("idProduto");
                String nome = rs.getString("nomeProduto");
                String descricao = rs.getString("descricaoProduto");
                float preco = rs.getFloat("precoProduto");
                String categoria = rs.getString("categoriaProduto");
                Date dataValidade = new java.util.Date(rs.getDate("validadeProduto").getTime());
                String volume = rs.getString("volumeProduto");
                int quantidade = rs.getInt("quantidadeProduto");
                String observacoes = rs.getString("observacaoProduto");

                Produto item = new Produto(id, nome, descricao, preco, categoria, dataValidade, volume, quantidade, observacoes);
                lstProduto.add(item);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstProduto;
    }
}
