/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author estev
 */
import dao.Conexao;
import dao.FuncionarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Funcionario;
import view.LoginView;
import view.MenuView;

/**
 *
 * @author estev
 */
public class LoginCadastroFunController {
    
    private final LoginView view;

    public LoginCadastroFunController(LoginView view) {
      this.view = view;
    }

       public void autenticar() throws SQLException {
        
        // Buscar um usuario da view
        
        String email = view.getjTextFieldUserEmail().getText();
        String senha = view.getjPasswordFieldUserSenha().getText();
        Funcionario usuarioAutenticar = new Funcionario(email, senha);
        
        // Verificar se existe um no BD
        
        Connection conexao = new Conexao().getConnection();
        FuncionarioDAO usuarioDao = new FuncionarioDAO(conexao);
        
        boolean existe = usuarioDao.existeNoBancoPorUsuarioESenha(usuarioAutenticar);
        
        
        // Se existir direcionar para menu, se n msg error.
        if(existe) {
            MenuView telamenu = new MenuView();
            this.view.dispose();
            telamenu.setVisible(true);
        } else{
            JOptionPane.showMessageDialog(view, "Usuario ou senha incorretos, tente novamente.");
        }
        
    }
    
    
    public void cadastrarFunc() {
        
        String nome = view.getjTextFieldNome().getText();
        
        String telefone = view.getjTextFieldTelefone().getText();
        
        String email = view.getjTextFieldEmail().getText();

        String senha = view.getjPasswordFieldSenha().getText();
        
       
        Funcionario funcionarioCadastrar = new Funcionario(nome, telefone, email, senha);
        try {
            Connection conexao = new Conexao().getConnection();
            FuncionarioDAO usuarioDao = new FuncionarioDAO(conexao);
            usuarioDao.insert(funcionarioCadastrar);
            
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
