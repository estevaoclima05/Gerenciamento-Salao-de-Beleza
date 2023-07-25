package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Funcionario;

public class FuncionarioDAO {

    public void insert(Funcionario usuario) throws SQLException {

        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;

        try {

            pstm = conexao.prepareStatement("insert into funcionario(nome,telefone, email, senha) values (?,?,?,?)");

            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getTelefone());
            pstm.setString(3, usuario.getEmail());
            pstm.setString(4, usuario.getSenha());
            pstm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean existeNoBancoPorUsuarioESenha(Funcionario usuario) throws SQLException {

        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;
        
        try {

            pstm = conexao.prepareStatement("select * from funcionario where email = ? and senha = ? ");

            pstm.setString(1, usuario.getEmail());
            pstm.setString(2, usuario.getSenha());

            pstm.execute();

            ResultSet resultSet = pstm.getResultSet();
            return resultSet.next();

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

}
