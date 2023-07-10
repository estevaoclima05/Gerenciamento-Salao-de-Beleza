package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Conexao {
    
    private static final String DRIVE = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "lima12345";
    
    
    public static Connection getConnection() {
        
        try {
            Class.forName(DRIVE);
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        }  catch (ClassNotFoundException | SQLException ErroSql) {
            throw new RuntimeException("ERRO AO CONECTAR. " + ErroSql);
    }
   
}

    public static void closeConnection(Connection conexao) {
        try {
            if(conexao != null)conexao.close();
        } catch (SQLException ErroSql) {
            throw new RuntimeException("ERRO AO FECHAR CONEXAO " + ErroSql);
        }
    } 
    
     public static void closeConnection(Connection conexao, PreparedStatement pstm) {
         closeConnection(conexao);
         
         try {
            if(pstm != null)pstm.close();
        } catch (SQLException ErroSql) {
            throw new RuntimeException("ERRO AO FECHAr PREPAREDS " + ErroSql);
        }
    }
     
     public static void closeConnection(Connection conexao, PreparedStatement pstm, ResultSet rs) {
         closeConnection(conexao, pstm);
         
         try {
            if(rs != null)rs.close();
        } catch (SQLException ErroSql) {
            throw new RuntimeException("ERRO AO FECHAr PREPAREDS " + ErroSql);
        }
     }}
    