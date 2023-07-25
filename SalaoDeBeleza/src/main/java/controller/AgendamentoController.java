package controller;



import dao.AgendamentoDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Agendamento;
import view.AgendamentoTela;



public class AgendamentoController {

    public void agendar(String cliente, String servico, Double preco, String data, String horario) throws Exception {

        Agendamento obj = new Agendamento();

        obj.setCliente(cliente);

        obj.setServico(servico);
        obj.setPreco(preco);
        obj.setHorario(horario);
        obj.setData(data);

        AgendamentoDAO dao = new AgendamentoDAO();

        try {
            dao.inserir(obj);
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterar(Object id, String cliente, String servico, Double preco, String data, String horario) throws Exception {

        Agendamento obj = new Agendamento();

        obj.setId((int) id);
        obj.setCliente(cliente);

        obj.setServico(servico);
        obj.setPreco(preco);
        obj.setHorario(horario);
        obj.setData(data);

        AgendamentoDAO dao = new AgendamentoDAO();

        try {
            dao.update(obj);
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void apagar(Object id) throws Exception {

        Agendamento obj = new Agendamento();

        obj.setId((int) id);

        AgendamentoDAO dao = new AgendamentoDAO();

        try {
            dao.delete(obj);
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
