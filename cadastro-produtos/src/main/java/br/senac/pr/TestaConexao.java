package br.senac.pr;

import java.sql.Connection;
import java.sql.SQLException;

import br.senac.pr.jdbc.Conexao;

public class TestaConexao {
    public static void main(String[] args) {
        try{
            Connection conexao = Conexao.conectar();
        System.out.println("Conexao realizada com sucesso");
        }catch(SQLException e){
            System.out.println("erro ao conectar no banco");
            System.out.println(e.getMessage());
        }
        
    }
}
