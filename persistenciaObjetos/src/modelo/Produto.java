package modelo;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    
    public Produto() {
    }

    public Produto(int id, String nome, double preco) {
        if(preco<0){
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco<0){
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        this.preco = preco;
    }
   
    
    

    

}
