/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.AgendamentoDAO;
import dao.ClienteDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Agendamento;
import model.Cliente;
import view.AgendamentoTela;
import view.CadastroClienteTela;
import view.LoginView;

/**
 *
 * @author isats
 */
public class AgendamentoController {
    private final AgendamentoTela view;

    public AgendamentoController(AgendamentoTela view) {
      this.view = view;
    }
    
    
    public void resetarAgendamento() {
        
        view.getjTextFieldIdA().setText("");
        view.getjTextFieldClienteA().setText("");
        view.getjTextFieldServicoA().setText("");
        view.getjTextFieldPrecoA().setText("");
        view.getjTextFieldHorarioA().setText("");
        
        
    }
    
    
    public void agendarCliente() {
        
      
        
        
        
        String cliente = view.getjTextFieldClienteA().getText();
        
        String servico = view.getjTextFieldServicoA().getText();
        
        Double preco = Double.parseDouble( view.getjTextFieldPrecoA().getText());
        
        String horario = view.getjTextFieldHorarioA().getText();
        
       

        Agendamento clienteAgendar = new Agendamento(cliente, servico, preco, horario);
        
        try {
            
            AgendamentoDAO agendamentoDao = new AgendamentoDAO();
            agendamentoDao.inserir(clienteAgendar);
            
            JOptionPane.showMessageDialog(null, "Agendamento feito com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void atualizarAgendamento() {
        
                
        
        int id = Integer.parseInt(view.getjTextFieldIdA().getText());
        
        String cliente = view.getjTextFieldClienteA().getText();
        
        String servico = view.getjTextFieldServicoA().getText();
        
        Double preco = Double.parseDouble( view.getjTextFieldPrecoA().getText());
        
        String horario = view.getjTextFieldHorarioA().getText();
        
        Agendamento agendamentoAtualizar = new Agendamento( id, cliente, servico, preco, horario);
        try {
            
            AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
            agendamentoDAO.update(agendamentoAtualizar);
            
           
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    public void deletarAgendamento() {
        
        int id = Integer.parseInt(view.getjTextFieldIdA().getText());
        
        String cliente = view.getjTextFieldClienteA().getText();
        
        String servico = view.getjTextFieldServicoA().getText();
        
        Double preco = Double.parseDouble( view.getjTextFieldPrecoA().getText());
        
        String horario = view.getjTextFieldHorarioA().getText();

        
        Agendamento agendamentoDeletar = new Agendamento(id, cliente, servico, preco, horario);
        try {
            
            AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
            agendamentoDAO.delete(agendamentoDeletar);
           
           
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
            
        }
        catch (SQLException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
} 

