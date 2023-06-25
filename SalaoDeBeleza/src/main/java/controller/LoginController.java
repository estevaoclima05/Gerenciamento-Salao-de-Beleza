/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.LoginView;

/**
 *
 * @author estev
 */
public class LoginController {
    
    private final LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }
    
    public void FizTarefa(){
        System.out.println("Busquei no banco de dados.");
        
        this.view.exibeMensagem("Executei o fiz tarefa.");
    }
    
    
}
