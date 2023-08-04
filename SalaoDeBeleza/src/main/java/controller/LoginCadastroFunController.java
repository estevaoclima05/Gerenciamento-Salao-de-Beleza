package controller;

import dao.FuncionarioDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Funcionario;
import view.LoginView;

public class LoginCadastroFunController {

    public void cadastrarFunc(String nome, String telefone, String email, String senha) throws Exception {

        Funcionario obj = new Funcionario();
        obj.setNome(nome);
        obj.setTelefone(telefone);
        obj.setEmail(email);
        obj.setSenha(senha);

        try {
            FuncionarioDAO dao = new FuncionarioDAO();

            dao.insert(obj);

        } catch (SQLException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean autenticar(String email, String senha) throws Exception {

        Funcionario obj = new Funcionario();

        obj.setEmail(email);
        obj.setSenha(senha);

        FuncionarioDAO dao = new FuncionarioDAO();

        if (dao.existeNoBancoPorUsuarioESenha(obj)) {
            return true;
        } else {
            return false;
        }

    }

}
