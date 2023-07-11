/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author isats
 */
public class Agendamento {
    private int id;
    private String cliente;
    private String servico;
    private Double preco;
    private String horario;
    
    

    public Agendamento(int id, String cliente, String servico, Double preco, String horario) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.preco = preco;
        this.horario = horario;
    }
    
    

    public Agendamento( String cliente, String servico, Double preco, String horario) {
        
        this.cliente = cliente;
        this.servico = servico;
        this.preco = preco;
        this.horario = horario;
    }

    public Agendamento(int id, String servico, Double preco, String horario) {
        this.id = id;
        this.servico = servico;
        this.preco = preco;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    
    
}
