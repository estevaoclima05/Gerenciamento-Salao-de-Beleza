package controller;

import dao.ClienteDAO;
import dao.Conexao;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import view.CadastroClienteTela;
import view.LoginView;



public class ClienteController {
    private final CadastroClienteTela view;

    public ClienteController(CadastroClienteTela view) {
      this.view = view;
    }
    
    
    public void resetarCliente() {
        
        view.getjTextFieldNomeC().setText("");
        view.getjTextFieldEmailC().setText("");
        view.getjTextFieldTelefoneC().setText("");
        view.getjTextFieldEnderecoC().setText("");
        view.getjTextFieldWhatsappC().setText("");
        view.getjTextFieldAlergiaC().setText("");
        
        
    }
    
    
    public void cadastrarCliente() {
        
      
        
        String nome = view.getjTextFieldNomeC().getText();
        
        String telefone = view.getjTextFieldTelefoneC().getText();
        
        String email = view.getjTextFieldEmailC().getText();
        
        String endereco = view.getjTextFieldEnderecoC().getText();
        
        String whatsapp = view.getjTextFieldWhatsappC().getText();
        
        String alergia = view.getjTextFieldAlergiaC().getText();

        
        Cliente clienteCadastrar = new Cliente( nome, email ,telefone, endereco, whatsapp, alergia);
        try {
            
            ClienteDAO clienteDao = new ClienteDAO();
            clienteDao.insert(clienteCadastrar);
            
            
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso");
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void atualizarCliente() {
        
                
        
        int id = Integer.parseInt(view.getjTextFieldIdC().getText());
        
        
        String nome = view.getjTextFieldNomeC().getText();
        
        String telefone = view.getjTextFieldTelefoneC().getText();
        
        String email = view.getjTextFieldEmailC().getText();
        
        String endereco = view.getjTextFieldEnderecoC().getText();
        
        String whatsapp = view.getjTextFieldWhatsappC().getText();
        
        String alergia = view.getjTextFieldAlergiaC().getText();

        
        Cliente clienteAtualizar = new Cliente( id, nome, email ,telefone, endereco, whatsapp, alergia);
        try {
            
            ClienteDAO clienteDao = new ClienteDAO();
            clienteDao.update(clienteAtualizar);
            
           
            
            JOptionPane.showMessageDialog(null, "Alteração com sucesso");
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    public void deletarCliente() {
        
        int id = Integer.parseInt(view.getjTextFieldIdC().getText()) ;
        
        String nome = view.getjTextFieldNomeC().getText();
        
        String telefone = view.getjTextFieldTelefoneC().getText();
        
        String email = view.getjTextFieldEmailC().getText();
        
        String endereco = view.getjTextFieldEnderecoC().getText();
        
        String whatsapp = view.getjTextFieldWhatsappC().getText();
        
        String alergia = view.getjTextFieldAlergiaC().getText();

        
        Cliente clienteDeletar = new Cliente(id, nome, email ,telefone, endereco, whatsapp, alergia);
        try {
            
            ClienteDAO clienteDao = new ClienteDAO();
            clienteDao.delete(clienteDeletar);
           
           
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
            
        }
        catch (SQLException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}