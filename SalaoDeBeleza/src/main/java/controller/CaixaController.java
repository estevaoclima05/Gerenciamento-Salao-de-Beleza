
package controller;

import dao.AgendamentoDAO;
import dao.CaixaDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Agendamento;
import view.AgendamentoTela;
import model.Caixa;


public class CaixaController {
    
    
    public void feito(Object id, String cliente, String data, Double preco) throws Exception {

        Caixa obj = new Caixa();
        Agendamento objA = new Agendamento();
        objA.setId((int) id);
        
        obj.setIdpc((int) id);
        obj.setClientepc(cliente);
        obj.setDatapc(data);
        obj.setPrecopc(preco);
      
        CaixaDAO dao = new CaixaDAO();
        AgendamentoDAO daoAgen = new AgendamentoDAO();

        try {
            dao.inserir(obj);
          try {
            daoAgen.delete(objA);
          
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoTela.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoTela.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void deletarCaixa(Object id) throws Exception {

        Caixa obj = new Caixa();

        obj.setIdpc((int) id);

        CaixaDAO dao = new CaixaDAO();

        try {
            dao.delete(obj);

        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoTela.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
   
   

    
}
