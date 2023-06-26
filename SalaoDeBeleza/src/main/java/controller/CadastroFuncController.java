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
import view.CadastroFuncView;

/**
 *
 * @author estev
 */
public class CadastroFuncController {
    
    private final CadastroFuncView view;

    public CadastroFuncController(CadastroFuncView view) {
        this.view = view;
    }
    
    /**
     *
     */
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
            Logger.getLogger(CadastroFuncView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
