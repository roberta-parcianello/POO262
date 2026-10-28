import java.io.IOException;

import arquivocsv.ArquivoProdutoCSV;

public class Teste {
public static void main(String[] args) {
    ArquivoProdutoCSV csv = new ArquivoProdutoCSV();
    try {
        csv.carregar();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
