package modelo;

public abstract class Pessoa {
    private String cpf;
    private String nome;
    private String rg;
    private String email;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, String rg, String email, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.email = email;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public void estudar(String disciplina){
        System.out.println("classe mae está estudando");
    }
    
}
