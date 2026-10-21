package arquivocsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import modelo.Produto;

public class ArquivoProdutoCSV {
    private String nomeArquivo = "produtos.csv";

    public void inserir(Produto produto) {
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo, true);
            PrintWriter escritor = new PrintWriter(arquivo);

            escritor.println(produto.getId() + "," + produto.getNome() + "," + produto.getPreco());

            escritor.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void listar() {
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader leitor = new BufferedReader(arquivo);
            String linha = leitor.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = leitor.readLine();
            }

            leitor.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void listarComoObjeto() {
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader leitor = new BufferedReader(arquivo);
            String linha = leitor.readLine();

            while (linha != null) {
                String[] dados = linha.split(",");
                Produto produto = new Produto();
                produto.setId(Integer.parseInt(dados[0]));
                produto.setNome(dados[1]);
                produto.setPreco(Double.parseDouble(dados[2]));

                System.out.println(produto);

                
                linha = leitor.readLine();
            }

            leitor.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
