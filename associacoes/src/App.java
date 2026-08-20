import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        Endereco endereco = new Endereco();
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Cadastro de Pessoa");
        System.out.println("==================");
        System.out.print("Nome: ");
        pessoa.setNome(leia.nextLine());
        System.out.print("Email: ");
        pessoa.setEmail(leia.nextLine());
        System.out.println("Endereço: ");
        System.out.print("Rua: ");
        endereco.setRua(leia.nextLine());
        System.out.print("Número: ");
        endereco.setNumero(leia.nextLine());
        System.out.print("Cidade: ");
        endereco.setCidade(leia.nextLine());
        System.out.print("Estado: ");
        endereco.setEstado(leia.nextLine());

        pessoa.setEndereco(endereco);
    }
}
