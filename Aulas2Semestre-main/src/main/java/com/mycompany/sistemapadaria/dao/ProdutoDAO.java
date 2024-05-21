/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapadaria.dao;

import com.mycompany.sistemapadaria.models.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            comandoSQL.setInt(1,obj.getIdProduto());
            comandoSQL.setString(2,obj.getNomeProduto());
            comandoSQL.setString(3,obj.getDescricaoProduto());
            comandoSQL.setFloat(4,obj.getPrecoProduto());
            comandoSQL.setString(5,obj.getCategoriaProduto());
            comandoSQL.setDate(6,new java.sql.Date( obj.getValidadeProduto().getTime()));
            comandoSQL.setString(7,obj.getVolumeProduto());
            comandoSQL.setString(8,obj.getObservacaoProduto());
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
    
}
