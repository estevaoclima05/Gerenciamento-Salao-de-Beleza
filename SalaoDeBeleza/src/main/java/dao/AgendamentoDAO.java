package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Agendamento;





public class AgendamentoDAO {

    public void inserir(Agendamento cliente) throws SQLException {

        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;

        try {

            pstm = conexao.prepareStatement("insert into agendamento(cliente, serviço ,preço, data, horario) values (?,?,?,?,?)");

            pstm.setString(1, cliente.getCliente());
            pstm.setString(2, cliente.getServico());
            pstm.setDouble(3, cliente.getPreco());
            pstm.setString(5, cliente.getHorario());
            pstm.setString(4, cliente.getData());

            pstm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(conexao);
        }
    }

    public void update(Agendamento cliente) throws SQLException {

        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;

        try {

            pstm = conexao.prepareStatement("update agendamento set cliente = ?, serviço = ? , preço = ? , data = ?, horario = ?  where  idagendamento = ? ");

            pstm.setString(1, cliente.getCliente());
            pstm.setString(2, cliente.getServico());
            pstm.setDouble(3, cliente.getPreco());
            pstm.setString(4, cliente.getData());
            pstm.setString(5, cliente.getHorario());
            pstm.setInt(6, cliente.getId());
            pstm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(conexao, pstm);
        }

    }

    public void delete(Agendamento cliente) throws SQLException {

        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;

        try {

            pstm = conexao.prepareStatement("delete from agendamento where idagendamento = ? ");

            pstm.setInt(1, cliente.getId());

            pstm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(conexao, pstm);
        }

    }

    public List<Agendamento> listarAgendamento() {

        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        List<Agendamento> agendados = new ArrayList<>();

        try {

            pstm = conexao.prepareStatement("select * from agendamento;");
            rs = pstm.executeQuery();

            while (rs.next()) {

                Agendamento agendamento = new Agendamento();

                agendamento.setId(rs.getShort("idagendamento"));
                agendamento.setCliente(rs.getString("cliente"));
                agendamento.setServico(rs.getString("serviço"));
                agendamento.setPreco(rs.getDouble("preço"));
                agendamento.setHorario(rs.getString("horario"));
                agendamento.setData(rs.getString("data"));

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
