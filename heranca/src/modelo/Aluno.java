package modelo;

public class Aluno extends Pessoa{
    private String anoIngresso;
    private String curso;
    
    public Aluno() {
    
    }

    public Aluno(String cpf, String nome, String rg, String email, String telefone, String anoIngresso, String curso) {
        super(cpf, nome, rg, email, telefone);//chama construtor da classe mãe
        this.anoIngresso = anoIngresso;
        this.curso = curso;
    }

    public String getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void estudar(String disciplina){
        System.out.println( "classe filha está estudando");
    }
    
}
