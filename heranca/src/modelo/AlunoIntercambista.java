package modelo;

public class AlunoIntercambista extends Aluno{
    private String tempo;

    public AlunoIntercambista() {
    }

    public AlunoIntercambista(String cpf, String nome, String rg, String email, String telefone, String anoIngresso,
            String curso, String tempo) {
        super(cpf, nome, rg, email, telefone, anoIngresso, curso);
        this.tempo = tempo;
    }

    


}
