/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author estev
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Funcionario;


/**
 *
 * @author estev
 */
public class FuncionarioDAO {
    
    private final Connection connection;

    public FuncionarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Funcionario usuario) throws SQLException{
    
            String sql = "insert into funcionario(nome,telefone, email, senha) values ('"+ usuario.getNome()+"','"+ usuario.getTelefone()+"','"+ usuario.getEmail()+"','"+ usuario.getSenha() +"')";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            connection.close();
            
            
       
    }   

    public boolean existeNoBancoPorUsuarioESenha(Funcionario usuario) throws SQLException {
        String sql = "select * from funcionario where email = '"+ usuario.getEmail() +"' and senha = '"+usuario.getSenha()+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        return resultSet.next();
}

   
}