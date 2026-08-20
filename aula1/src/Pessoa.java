public class Pessoa {
    //atributos -->características - nome sempre com letras
    //minusculas
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;

    //métodos --> comportamento em minusculo
//construtores que são chamados pelo new
    public Pessoa(){

    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, String email, String cpf){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    //métodos de acesso - para acessar os atributos
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

     public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

     public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
