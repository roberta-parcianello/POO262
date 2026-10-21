import arquivocsv.ArquivoProdutoCSV;
import modelo.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Brincando com arquivos csv");
        
        Produto p1 = new Produto(3, "monitor", 1000);
        Produto p2 = new Produto(4, "ssd", 300);
        ArquivoProdutoCSV csv = new ArquivoProdutoCSV();

      //  csv.inserir(p1);
       // csv.inserir(p2);

       csv.listarComoObjeto();

    }
}
