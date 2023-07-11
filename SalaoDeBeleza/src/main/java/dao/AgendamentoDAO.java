/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import model.Cliente;

/**
 *
 * @author isats
 */
public class AgendamentoDAO {
    public void inserir(Agendamento cliente) throws SQLException{
    
        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;
        
        try {
            

            pstm = conexao.prepareStatement( "insert into agendamento(cliente, serviço ,preço, horario) values (?,?,?,?)");
            
            pstm.setString(1, cliente.getCliente());
            pstm.setString(2, cliente.getServico());
            pstm.setDouble(3, cliente.getPreco());
            pstm.setString(4, cliente.getHorario());
            pstm.execute();
                  
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        finally {
            Conexao.closeConnection(conexao);
        }
    }  
    
    public void update(Agendamento cliente) throws SQLException{
    
        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;
      
        
        try {
            // String sql = "insert into cliente(nome, email ,telefone, endereço, whatsapp, alergia) values ('"+ cliente.getNomeC()+"','"+ cliente.getEmailC()+"','"+ cliente.getTelefoneC()+"','"+ cliente.getEnderecoC() +"','"+ cliente.getWhatsappC() +"','"+ cliente.getAlergiaC() +"')";

           pstm = conexao.prepareStatement( "update agendamento set cliente = ?, serviço = ? , preço = ? , horario = ?  where idagendamento = ? " );
            
             pstm.setString(1, cliente.getCliente());
             pstm.setString(2, cliente.getServico());
             pstm.setDouble(3, cliente.getPreco());
             pstm.setString(4, cliente.getHorario());
             pstm.setInt(5, cliente.getId());
             pstm.execute();
            
          
          
                  
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        finally {
            Conexao.closeConnection(conexao,pstm);
        }
        
      }
      
      
      
        public void delete(Agendamento cliente) throws SQLException{
    
        Connection conexao = Conexao.getConnection();
        PreparedStatement pstm = null;
        
        
        try {
            // String sql = "insert into cliente(nome, email ,telefone, endereço, whatsapp, alergia) values ('"+ cliente.getNomeC()+"','"+ cliente.getEmailC()+"','"+ cliente.getTelefoneC()+"','"+ cliente.getEnderecoC() +"','"+ cliente.getWhatsappC() +"','"+ cliente.getAlergiaC() +"')";

            pstm = conexao.prepareStatement( "delete from agendamento where idagendamento = ? ");
            
            pstm.setInt(1, cliente.getId());
            
            
            pstm.execute();
                  
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        finally {
            Conexao.closeConnection(conexao,pstm);
        }
        
    }   
    
        
         
            
        public List<Agendamento> listarAgendamento() {
            
            
            
            
            Connection conexao = Conexao.getConnection();
            PreparedStatement pstm= null;
            ResultSet rs = null;
            
            List<Agendamento> agendados = new ArrayList<>();
            
        
            try {
            
            pstm = conexao.prepareStatement("select * from agendamento;");
            rs = pstm.executeQuery();
            
            while(rs.next()) {
                
                
                
             
                
                Agendamento agendamento = new  Agendamento(null, null, null, null);
                 
                agendamento.setId(rs.getShort("idagendamento"));
                agendamento.setCliente(rs.getString("cliente"));
                agendamento.setServico(rs.getString("serviço"));
                agendamento.setPreco(rs.getDouble("preço"));
                agendamento.setHorario(rs.getString("horario"));
                
                
                agendados.add(agendamento);
                
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null,ex);
        }
        finally {
            Conexao.closeConnection(conexao,pstm,rs);
            
        }
        return agendados;
      
    }

  



}
