package br.senac.pr;

import br.senac.pr.arquivocsv.ArquivoProdutoCSV;
import br.senac.pr.modelo.Produto;

public class Main {
    public static void main(String[] args) {
       Produto produto = new Produto();
       produto.setId(1);
       produto.setNome("Nome produto");
       produto.setPreco(60);

       ArquivoProdutoCSV csv = new ArquivoProdutoCSV();
       csv.inserir(produto);
       
    }
}