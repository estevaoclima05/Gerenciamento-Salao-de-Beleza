/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author isats
 */
public class Cliente extends Pessoa {
    
    protected String alergia;
    protected String endereco;

    public Cliente(String alergia, String endereco, int id, String nome, String telefone, String email) {
        super(id, nome, telefone, email);
        this.alergia = alergia;
        this.endereco = endereco;
    }

   

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    
    
}
