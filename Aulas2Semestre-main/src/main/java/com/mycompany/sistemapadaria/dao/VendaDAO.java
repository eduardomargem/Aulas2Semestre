/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapadaria.dao;

import static com.mycompany.sistemapadaria.dao.ProdutoDAO.senha;
import static com.mycompany.sistemapadaria.dao.ProdutoDAO.url;
import static com.mycompany.sistemapadaria.dao.ProdutoDAO.usuario;
import com.mycompany.sistemapadaria.models.Produto;
import com.mycompany.sistemapadaria.models.Venda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardo.mcjesus
 */
public class VendaDAO {
    public static String url = "jdbc:mysql://localhost:3306/sistemapadaria";
    public static String usuario = "root";
    public static String senha = "admin";
    public static List<Produto> listar() {
        List<Produto> lstProduto = new ArrayList<>();
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
        } finally {
            try {
                if (rs != null) rs.close();
                if (conexao != null) conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lstProduto;
    }
    public static boolean cadastrar(Venda obj) {
        boolean retorno = false;
        Connection conexao = null;

        try {
            // 1) Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2) Abrir conexão
            conexao = DriverManager.getConnection(url, usuario, senha);

            // 3) Preparar o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO venda (idVenda, itemVenda, cpf, nomeProduto, quantidade, formaPagamento");
            // 4) Passar parâmetros para o comando SQL
            comandoSQL.setInt(1, obj.getIdVenda());
            comandoSQL.setInt(2, obj.getItemVenda());
            comandoSQL.setString(3, obj.getCliente().getCpf());
            comandoSQL.setString(4, obj.getProduto().getNomeProduto());
            comandoSQL.setInt(5, obj.getQuantidade());
            comandoSQL.setString(6, obj.getFormaPagamento());

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
}
