public class Pessoa {
    //atributos - características
    private String nome;
    private String email;
    private Endereco endereco;

    //métodos - comportamento
    //construtores
    public Pessoa(){ }

    public Pessoa(String nome, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public Pessoa(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    //métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    

}
