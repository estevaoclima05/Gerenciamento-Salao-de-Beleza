
package model;

public class Caixa {

    private int idpc;
    private String clientepc;
    private double precopc;
    private String horariopc;
    private String datapc;
    private double resultado;

    public Caixa(int idpc, String clientepc, double precopc, String horariopc) {
        this.idpc = idpc;
        this.clientepc = clientepc;
        this.precopc = precopc;
        this.horariopc = horariopc;
    }

    public Caixa() {
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getDatapc() {
        return datapc;
    }

    public void setDatapc(String datapc) {
        this.datapc = datapc;
    }

    public int getIdpc() {
        return idpc;
    }

    public void setIdpc(int idpc) {
        this.idpc = idpc;
    }

    public String getClientepc() {
        return clientepc;
    }

    public void setClientepc(String clientepc) {
        this.clientepc = clientepc;
    }

    public double getPrecopc() {
        return precopc;
    }

    public void setPrecopc(double precopc) {
        this.precopc = precopc;
    }

    public String getHorariopc() {
        return horariopc;
    }

    public void setHorariopc(String horariopc) {
        this.horariopc = horariopc;
    }

    public String getClientepc(String cliente) {
        this.clientepc = cliente;
        return cliente;
    }

    public double getPrecopc(double preco) {
        this.precopc = preco;
        return preco;
    }

    public String getHorariopc(String horario) {
        this.horariopc = horario;
        return horario;
    }

    public int getIdpc(int idpc) {
        this.idpc = idpc;
        return idpc;
    }

}
