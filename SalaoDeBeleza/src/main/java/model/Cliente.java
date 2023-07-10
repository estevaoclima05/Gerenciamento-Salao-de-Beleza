
package model;

/**
 *
 * @author estev
 */
public class Cliente {
    
    
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String whatsapp;
    private String alergia;

    public Cliente(int id ,String nome, String email, String telefone, String endereco, String whatsapp, String alergia) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.whatsapp = whatsapp;
        this.alergia = alergia;
    }
    
    public Cliente(String nome, String email, String telefone, String endereco, String whatsapp, String alergia) {
        
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.whatsapp = whatsapp;
        this.alergia = alergia;
    }

    public int getIdC() {
        return id;
    }

    public void setIdC(int id) {
        this.id = id;
    }

    

    public String getNomeC() {
        return nome;
    }

    public void setNomeC(String nome) {
        this.nome = nome;
    }

    public String getEmailC() {
        return email;
    }

    public void setEmailC(String email) {
        this.email = email;
    }

    public String getTelefoneC() {
        return telefone;
    }

    public void setTelefoneC(String telefone) {
        this.telefone = telefone;
    }

    public String getEnderecoC() {
        return endereco;
    }

    public void setEnderecoC(String endereco) {
        this.endereco = endereco;
    }

    public String getWhatsappC() {
        return whatsapp;
    }

    public void setWhatsappC(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getAlergiaC() {
        return alergia;
    }

    public void setAlergiaC(String alergia) {
        this.alergia = alergia;
    }
    
    
    
}