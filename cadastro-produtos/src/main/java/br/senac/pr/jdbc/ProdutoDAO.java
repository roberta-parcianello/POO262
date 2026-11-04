package br.senac.pr.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

import br.senac.pr.modelo.Produto;

public class ProdutoDAO {
    public void inserir(Produto produto) throws SQLException {
        String sql = "INSERT INTO produtos (id,nome, preco) VALUES (?,?,?)";
        PreparedStatement stmt=null;
        Connection conexao=null;
        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, produto.getId());
            stmt.setString(2, produto.getNome());
            stmt.setDouble(3, produto.getPreco());
            stmt.executeUpdate();
            System.out.println("Produto inserido com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir produto "+e.getMessage());
        }finally{
          stmt.close();
          conexao.close();
        }
    }

    public Produto buscarProdutoPorId(int id) throws SQLException{
        String sql = "SELECT * FROM produtos WHERE id=?";
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if(rs.next()){
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                return produto;
            }

        } catch (SQLException e) {
           System.out.println(e.getMessage());
        }
        finally{
            stmt.close();
            conexao.close();
        }
        return null;

    }

    public boolean deletar(int id) throws SQLException{
        String sql = "DELETE FROM produtos WHERE id=?";
        Connection conexao = null;
        PreparedStatement stmt = null;
        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            int resp = stmt.executeUpdate();
            return resp > 0; 
        } catch (SQLException e) {
                System.out.println("Erro ao deletar "+e.getMessage());
        }finally{
            stmt.close();
            conexao.close();
        }
        return false;
    }

}
