package com.mycompany.sistemapadaria.dao;

import com.mycompany.sistemapadaria.models.RelatorioAnalitico;
import com.mycompany.sistemapadaria.models.RelatorioSintetico;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class RelatorioAnaliticoDAO {
    public static String url = "jdbc:mysql://localhost:3306/sistemaPadaria";
    public static String usuario = "root";
    public static String senha = "";
    
    public static ArrayList<RelatorioAnalitico>listarPorVenda(int idVenda){
        Connection conexao = null;
        ResultSet rs = null;
        ArrayList<RelatorioAnalitico>listaRetorno = new ArrayList<>();
        
        try{
            
             Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, usuario, senha);
           
            String sql = "SELECT ItemVenda.idProduto, Produto.nomeProduto, ItemVenda.vlrUnitario, ItemVenda.qtdProduto FROM ItemVenda "
                    + "     INNER JOIN Produto ON ItemVenda.idProduto = Produto.idProduto"
                    + "     WHERE idVenda = ?";
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO vendas (produto, quantidade, preco, categoria, pagamento) values (?, ?, ?, ?, ?)");
            comandoSQL.setInt(1, idVenda);
             
            
            rs = comandoSQL.executeQuery();
            
            if(rs !=null){
                
                while(rs.next()){
                
                RelatorioAnalitico item = null;
                
                int idProduto = rs.getInt("idProduto");
                String nomeProduto = rs.getString("nomeProduto");
                double valorUnitario = rs.getFloat("valorUnitario");
                int qtdProduto = rs.getInt("qtdProduto");
               
                item = new RelatorioAnalitico(nomeProduto, qtdProduto, valorUnitario);
                
                listaRetorno.add(item);
                }
            }
        }catch (Exception e){
            listaRetorno = null;
        }
        return listaRetorno;
    }
}
