import modelo.Aluno;
import modelo.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Brincanco com Herança");
        Pessoa p = new Pessoa("cpf", "nome", "rg", "email", "telefone");
        Aluno a = new Aluno("546546", "aluno", "245365", "aluno@gmail.com", "8932847", "2026", "TADS");

        System.out.println(a.getNome());

        a.estudar("POO");

        System.out.println(a.getClass());


    }
}
