package com.mycompany.sistemapadaria.dao;

import com.mycompany.sistemapadaria.models.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {
    public static String url = "jdbc:mysql://localhost:3306/sistemapadaria";
    public static String usuario = "root";
    public static String senha = "";
    
    public static boolean cadastrar(Cliente obj) {
        boolean retorno = false;
        Connection conexao = null;

        try {
            // 1) Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2) Abrir conexão
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            // 3) Preparar o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO clientes (nome, cpf, telefone, email, sexo, civil, nascimento, endereco, numeroCasa, bairro, cidade, complemento, cep, estado) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            // 4) Passar parâmetros para o comando SQL
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getCpf());
            comandoSQL.setString(3, obj.getTelefone());
            comandoSQL.setString(4, obj.getEmail());
            comandoSQL.setString(5, obj.getSexo());
            comandoSQL.setString(6, obj.getCivil());
            comandoSQL.setDate(7, new java.sql.Date(obj.getNascimento().getTime()));
            comandoSQL.setString(8, obj.getEndereco());
            comandoSQL.setInt(9, obj.getNumeroCasa());
            comandoSQL.setString(10, obj.getBairro());
            comandoSQL.setString(11, obj.getCidade());
            comandoSQL.setString(12, obj.getComplemento());
            comandoSQL.setString(13, obj.getCep());
            comandoSQL.setString(14, obj.getEstado());
            
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
        // Fim do método salvar
        
    }
    
    public static ArrayList<Cliente> listar() {
            ArrayList<Cliente> lstClientes = new ArrayList<>();
            Connection conexao = null;
            ResultSet rs = null;
            
            try {
                // 1)Carregar o Driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // 2) Abrir a conexão
                conexao = DriverManager.getConnection(url, usuario, senha);

                // 3) Preparar o comando SQL
                PreparedStatement comandoSQL = conexao.prepareStatement("select * from clientes");

                // 4) Executar o comando SQL
                rs = comandoSQL.executeQuery();

                // Enquanto houver linhas no ResultSet, adiciono um objeto na lista de retorno
                while (rs.next()) {
                    int id = rs.getInt("idCliente");
                    String nome = rs.getString("nome");
                    String cpf = rs.getString("cpf");
                    String telefone = rs.getString("telefone");
                    String email = rs.getString("email");
                    String sexo = rs.getString("sexo");
                    String civil = rs.getString("civil");
                    Date nascimento = new java.util.Date(rs.getDate("nascimento").getTime());
                    String endereco = rs.getString("endereco");
                    int numeroCasa = rs.getInt("numeroCasa");
                    String bairro = rs.getString("bairro");
                    String cidade = rs.getString("cidade");
                    String complemento = rs.getString("complemento");
                    String cep = rs.getString("cep");
                    String estado = rs.getString("estado");

                    Cliente item = new Cliente(id, nome, cpf, telefone, email, sexo, civil, nascimento, endereco, numeroCasa, bairro, cidade, complemento, cep, estado);
                    lstClientes.add(item);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

            return lstClientes; 
        } // Fim do método listar
}
