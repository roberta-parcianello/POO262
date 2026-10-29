package br.senac.pr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
//driver:sgbd://ip da maquina do servidor do banco:porta do banco/base de dados
    private static final String url = "jdbc:postgresql://localhost:5432/loja";
    private static final String user = "postgres";
    private static final String password = "123456";

    public static Connection conectar() throws SQLException{
        Connection conexao = DriverManager.getConnection(url, user, password);
        return conexao;

    }

}
