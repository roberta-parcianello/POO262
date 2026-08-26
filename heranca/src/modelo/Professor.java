package modelo;

//Professor é uma pessoa
public class Professor extends Pessoa{
    private String titulacao;
    private int cargaHoraria;
   
    public Professor() {
    }

    public Professor(String cpf, String nome, String rg, String email, String telefone, String titulacao,
            int cargaHoraria) {
        super(cpf, nome, rg, email, telefone);
        this.titulacao = titulacao;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    



}
