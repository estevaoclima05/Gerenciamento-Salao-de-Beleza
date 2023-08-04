package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;


public class ClienteDAO {

    public void insert(Cliente cliente) throws SQLException {

        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;

        try {

            pstm = conexao.prepareStatement("insert into cliente(nome, email ,telefone, endereço, whatsapp, alergia) values (?,?,?,?,?,?)");

            pstm.setString(1, cliente.getNomeC());
            pstm.setString(2, cliente.getEmailC());
            pstm.setString(3, cliente.getTelefoneC());
            pstm.setString(4, cliente.getEnderecoC());
            pstm.setString(5, cliente.getWhatsappC());
            pstm.setString(6, cliente.getAlergiaC());
            pstm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(conexao);
        }
    }

    public void update(Cliente cliente) throws SQLException {

        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;

        try {

            pstm = conexao.prepareStatement("update cliente set nome = ?, email = ? , telefone = ? , endereço = ? , whatsapp = ? , alergia = ? where idcliente = ? ");

            pstm.setString(1, cliente.getNomeC());
            pstm.setString(2, cliente.getEmailC());
            pstm.setString(3, cliente.getTelefoneC());
            pstm.setString(4, cliente.getEnderecoC());
            pstm.setString(5, cliente.getWhatsappC());
            pstm.setString(6, cliente.getAlergiaC());
            pstm.setInt(7, cliente.getIdC());

            pstm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(conexao, pstm);
        }

    }

    public void delete(Cliente cliente) throws SQLException {

        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;

        try {

            pstm = conexao.prepareStatement("delete from cliente where idcliente = ? ");
            pstm.setInt(1, cliente.getIdC());
            pstm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(conexao, pstm);
        }

    }

    public List<Cliente> listar() {

        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {

            pstm = conexao.prepareStatement("select * from cliente;");
            rs = pstm.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();

                cliente.setIdC(rs.getShort("idcliente"));
                cliente.setNomeC(rs.getString("nome"));
                cliente.setTelefoneC(rs.getString("telefone"));
                cliente.setEmailC(rs.getString("email"));
                cliente.setWhatsappC(rs.getString("whatsapp"));
                cliente.setEnderecoC(rs.getString("endereço"));
                cliente.setAlergiaC(rs.getString("alergia"));

                clientes.add(cliente);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(conexao, pstm, rs);

        }
        return clientes;

    }

}
