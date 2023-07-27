package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Caixa;

public class CaixaDAO {

    public void inserir(Caixa fechamento) throws SQLException {

        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;

        try {

            pstm = conexao.prepareStatement("insert into caixa(idcaixa, cliente, data, preço) values (?,?,?,?)");

            pstm.setInt(1, fechamento.getIdpc());
            pstm.setString(2, fechamento.getClientepc());
            pstm.setString(3, fechamento.getDatapc());
            pstm.setDouble(4, fechamento.getPrecopc());

            pstm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(conexao);
        }
    }
    
    public void delete(Caixa fechamento) throws SQLException {

        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;

        try {

            pstm = conexao.prepareStatement("delete from caixa where idcaixa = ? ");

            pstm.setInt(1, fechamento.getIdpc());
          
            pstm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(conexao);
        }
    }
    
    
    

    public List<Caixa> listarCaixa() {

        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        List<Caixa> agendados = new ArrayList<>();

        try {

            pstm = conexao.prepareStatement("select idcaixa, cliente, data, preço from caixa ;");
            rs = pstm.executeQuery();

            while (rs.next()) {

                Caixa agendamento = new Caixa();

                agendamento.setIdpc(rs.getInt("idcaixa"));
                agendamento.setClientepc(rs.getString("cliente"));
                agendamento.setDatapc(rs.getString("data"));
                agendamento.setPrecopc(rs.getDouble("preço"));

                agendados.add(agendamento);

            }

        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(conexao, pstm, rs);

        }
        return agendados;

    }

}
