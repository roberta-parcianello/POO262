public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa;
        pessoa = new Pessoa("Fulano de Tal","fulano@gmail.com","9088090" );
        Endereco endereco = new Endereco("rua Tal", "256", "ap1", "Floresta", "Cascavel", "Paraná", "Brasil");
        pessoa.setEndereco(endereco);
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Daniel");
        pessoa1.setCpf("979879879");
        pessoa1.setEmail("nome@gmail.com");

        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Email: "+pessoa.getEmail());
        System.out.println("Cpf: "+pessoa.getCpf());
        System.out.println();
        System.out.println("----------------------");
        System.out.println();
        
        System.out.println("Nome: "+pessoa1.getNome());
        System.out.println("Email: "+pessoa1.getEmail());
        System.out.println("Cpf: "+pessoa1.getCpf());
      

    }
}
