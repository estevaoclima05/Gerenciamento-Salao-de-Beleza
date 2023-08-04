package controller;

import dao.ClienteDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import view.LoginView;

public class ClienteController {

    public void cadastrarCliente(String nome, String email, String telefone, String endereco, String whatsapp, String alergia) {

        Cliente obj = new Cliente();

        obj.setNomeC(nome);
        obj.setEmailC(email);
        obj.setTelefoneC(telefone);
        obj.setEnderecoC(endereco);
        obj.setWhatsappC(whatsapp);
        obj.setAlergiaC(alergia);

        try {

            ClienteDAO clienteDao = new ClienteDAO();
            clienteDao.insert(obj);

            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void atualizarCliente(Object id, String nome, String email, String telefone, String endereco, String whatsapp, String alergia) {

        Cliente obj = new Cliente();

        obj.setIdC((int) id);
        obj.setNomeC(nome);
        obj.setEmailC(email);
        obj.setTelefoneC(telefone);
        obj.setEnderecoC(endereco);
        obj.setWhatsappC(whatsapp);
        obj.setAlergiaC(alergia);

        try {

            ClienteDAO clienteDao = new ClienteDAO();
            clienteDao.update(obj);
            JOptionPane.showMessageDialog(null, "Alteração com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deletarCliente(Object id) {

        Cliente obj = new Cliente();

        obj.setIdC((int) id);

        try {

            ClienteDAO clienteDao = new ClienteDAO();
            clienteDao.delete(obj);

            JOptionPane.showMessageDialog(null, "Deletado com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
