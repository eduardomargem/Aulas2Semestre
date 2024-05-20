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
    
    public static boolean cadastrar(Produto obj){
        boolean retorno = false;
        Connection conexao = null;

        try {
            // 1) Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2) Abrir conexão
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            // 3) Preparar o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO produto (nome, cpf, telefone, email, sexo, civil, nascimento, endereco, numeroCasa, bairro, cidade, complemento, cep, estado) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
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
