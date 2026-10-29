import java.util.Scanner;

import arquivocsv.ArquivoProdutoCSV;
import modelo.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int op = 0;
        ArquivoProdutoCSV csv = new ArquivoProdutoCSV();

        System.out.println("Brincando com arquivos csv");
        System.out.println("Escolha uma opção:");

        do{
            System.out.println("1 - inserir produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto por Id");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Deletar Produto");
            System.out.println("0 - Sair");
            op = leia.nextInt();
            switch (op) {
                case 1:
                   try{
                        Produto produto = new Produto();
                        System.out.println("Cadastrar Produto");
                        System.out.print("ID: ");
                        produto.setId(leia.nextInt());
                        leia.nextLine();//limpar o buffer
                        System.out.print("Nome produto: ");
                        produto.setNome(leia.nextLine());
                        System.out.print("Preço: R$");
                        produto.setPreco(leia.nextDouble());
                        csv.inserir(produto);
                        leia.nextLine();
                        leia.nextLine();
                 } catch (Exception e) {
                       System.out.println(e.getMessage());
                 } 
                        
                break;
                    
                    
                    
                case 2:
                    csv.listar();

                    break;
                case 5:
                     System.out.println("Deletar Produto");
                     System.out.println("Informe o ID do produto a ser deletado");
                     int id = leia.nextInt();
                     csv.deletarProduto(id);
                case 6:
                    csv.carregar();

            
                default:
                    break;
            }

        }while(op != 0);

    }
}
