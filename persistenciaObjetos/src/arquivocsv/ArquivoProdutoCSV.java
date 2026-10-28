package arquivocsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import modelo.Produto;

public class ArquivoProdutoCSV {
    private String nomeArquivo = "produtos_novo.csv";

    public void inserir(Produto produto) {
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo, true);//verifica se existe o arquivo, se o arquivo não existe, ele cria em disco
                                                                    // se existe, abre para edição
            PrintWriter escritor = new PrintWriter(arquivo);

            escritor.println(produto.getId() + "," + produto.getNome() + "," + produto.getPreco());

            escritor.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void carregar()throws IOException{
        FileReader arquivo =  new FileReader(nomeArquivo); 
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

    public void listar2() {//try with resources
        try(BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
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

    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();
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
                produtos.add(produto);
                linha = leitor.readLine();
            }

            leitor.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return produtos;
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

    public Produto buscarObjeto(int id) {
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader leitor = new BufferedReader(arquivo);

            String linha = leitor.readLine();

            while (linha != null) {
                String[] dados = linha.split(",");
                int idArquivo = Integer.parseInt(dados[0]);
                if (idArquivo == id) {
                    Produto p = new Produto();
                    p.setId(idArquivo);
                    p.setNome(dados[1]);
                    p.setPreco(Double.parseDouble(dados[2]));
                    return p;
                }
                linha = leitor.readLine();
            }
            leitor.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public boolean deletarProduto(int id){
        List<Produto> produtos = listarProdutos();
        boolean removido = false;
        for (Produto produto : produtos) { //varre uma lista
            if(produto.getId()==id){
                produtos.remove(produto);
                removido = true;
                break;
            }
        }
        if(removido){
            salvar(produtos);
        }  
        return removido;
    }

    public void salvar(List<Produto> produtos){
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo);//recria o arquivo
            PrintWriter escritor = new PrintWriter(arquivo);

           for (Produto produto : produtos) {
                escritor.println(produto.getId() + "," + produto.getNome() + "," + produto.getPreco());
           }

            escritor.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
