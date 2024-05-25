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
public class ProdutoDAO {

    public static String url = "jdbc:mysql://localhost:3306/sistemaPadaria";
    public static String usuario = "root";
    public static String senha = "";

    public static boolean cadastrar(Produto obj) {
        boolean retorno = false;
        Connection conexao = null;

        try {
            // 1) Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2) Abrir conexão
            conexao = DriverManager.getConnection(url, usuario, senha);

            // 3) Preparar o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO produto (idProduto, nomeProduto, descricaoProduto, precoProduto, categoriaProduto, validadeProduto, volumeProduto, observacaoProduto) values (?, ?, ?, ?, ?, ?, ?, ?)");
            comandoSQL.setInt(1, obj.getIdProduto());
            comandoSQL.setString(2, obj.getNomeProduto());
            comandoSQL.setString(3, obj.getDescricaoProduto());
            comandoSQL.setFloat(4, obj.getPrecoProduto());
            comandoSQL.setString(5, obj.getCategoriaProduto());
            comandoSQL.setDate(6, new java.sql.Date(obj.getValidadeProduto().getTime()));
            comandoSQL.setString(7, obj.getVolumeProduto());
            comandoSQL.setString(8, obj.getObservacaoProduto());
            // 4) Passar parâmetros para o comando SQL
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

    public static boolean alterar(Produto obj) {
        boolean retorno = false;
        Connection conexao = null;

        try {
            // 1) Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2) Abrir conexão
            conexao = DriverManager.getConnection(url, usuario, senha);

            // 3) Preparar o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE produto SET idProduto = ?, nomeProduto = ?, descricaoProduto = ?, precoProduto = ?, categoriaProduto = ?, validadeProduto = ?, volumeProduto = ?, observacaoProduto = ? WHERE idProduto = ?");
            comandoSQL.setString(1, obj.getNomeProduto());
            comandoSQL.setString(2, obj.getDescricaoProduto());
            comandoSQL.setFloat(3, obj.getPrecoProduto());
            comandoSQL.setString(4, obj.getCategoriaProduto());
            comandoSQL.setDate(5, new java.sql.Date(obj.getValidadeProduto().getTime()));
            comandoSQL.setString(6, obj.getVolumeProduto());
            comandoSQL.setString(7, obj.getObservacaoProduto());
            comandoSQL.setInt(8, obj.getIdProduto());
            // 4) Passar parâmetros para o comando SQL
            // 5) Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                // Gravou com sucesso!
                retorno = true;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return retorno;
    }

    public static boolean excluir(Produto obj) {
        boolean retorno = false;
        Connection conexao = null;

        try {
            // 1) Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2) Abrir conexão
            conexao = DriverManager.getConnection(url, usuario, senha);

            // 3) Preparar o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE produto WHERE idProduto = ?");
            comandoSQL.setInt(1, idExcluir);
            // 4) Passar parâmetros para o comando SQL
            // 5) Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                // Gravou com sucesso!
                retorno = true;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return retorno;
    }

    public static ArrayList<Produto> listar() {
        ArrayList<Produto> lstProduto = new ArrayList<>();
        Connection conexao = null;
        ResultSet rs = null;
        try {
            // SEGUINDO OS PASSOS DA PRIMEIRA PARTE
            //1) PASSO
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2) PASSO
            conexao = DriverManager.getConnection(url, usuario, senha);
            //3) PASSO
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM produto");
            //5) PASSO
            rs = comandoSQL.executeQuery();
            // ENQUANTO HOUVER LINHAS NO RESULTSET, ADICIONO UM OBJETO NA LISTA DE RETORNO
            while (rs.next()) {
                int id = rs.getInt("idProduto");
                String nome = rs.getString("nomeProduto");
                String descricao = rs.getString("descricaoProduto");
                float preco = rs.getFloat("precoProduto");
                String categoria = rs.getString("categoriaProduto");
                Date dataValidade = new java.util.Date(rs.getDate("validadeProduto").getTime());
                String volume = rs.getString("volumeProduto");
                String observacoes = rs.getString("observacaoProduto");

                Produto item = new Produto(id, nome, descricao, preco, categoria, dataValidade, volume, observacoes);
                lstProduto.add(item);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstProduto;
    }

    public static ArrayList<Produto> buscarCategoria(Produto obj) {
        ArrayList<Produto> lstProduto = new ArrayList<>();
        Connection conexao = null;
        ResultSet rs = null;
        try {
            // SEGUINDO OS PASSOS DA PRIMEIRA PARTE
            //1) PASSO
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2) PASSO
            conexao = DriverManager.getConnection(url, usuario, senha);
            //3) PASSO
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE categoriaProduto = ?");
            //5) PASSO
            rs = comandoSQL.executeQuery();
            // ENQUANTO HOUVER LINHAS NO RESULTSET, ADICIONO UM OBJETO NA LISTA DE RETORNO
            while (rs.next()) {
                int id = rs.getInt("idProduto");
                String nome = rs.getString("nomeProduto");
                String descricao = rs.getString("descricaoProduto");
                float preco = rs.getFloat("precoProduto");
                String categoria = rs.getString("categoriaProduto");
                Date dataValidade = new java.util.Date(rs.getDate("validadeProduto").getTime());
                String volume = rs.getString("volumeProduto");
                String observacoes = rs.getString("observacaoProduto");

                Produto item = new Produto(id, nome, descricao, preco, categoria, dataValidade, volume, observacoes);
                lstProduto.add(item);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstProduto;
    }
    
    public static ArrayList<Produto> buscarValidade(Produto obj){
        ArrayList<Produto> lstProduto = new ArrayList<>();
        Connection conexao = null;
        ResultSet rs = null;
        try {
            // SEGUINDO OS PASSOS DA PRIMEIRA PARTE
            //1) PASSO
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2) PASSO
            conexao = DriverManager.getConnection(url, usuario, senha);
            //3) PASSO
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE ValidadeProduto = ?");
            //5) PASSO
            rs = comandoSQL.executeQuery();
            // ENQUANTO HOUVER LINHAS NO RESULTSET, ADICIONO UM OBJETO NA LISTA DE RETORNO
            while (rs.next()) {
                int id = rs.getInt("idProduto");
                String nome = rs.getString("nomeProduto");
                String descricao = rs.getString("descricaoProduto");
                float preco = rs.getFloat("precoProduto");
                String categoria = rs.getString("categoriaProduto");
                Date dataValidade = new java.util.Date(rs.getDate("validadeProduto").getTime());
                String volume = rs.getString("volumeProduto");
                String observacoes = rs.getString("observacaoProduto");

                Produto item = new Produto(id, nome, descricao, preco, categoria, dataValidade, volume, observacoes);
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
