package br.senac.pr.visao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.senac.pr.arquivocsv.ArquivoProdutoCSV;
import br.senac.pr.modelo.Produto;

public class TelaProduto  extends JFrame{
    private JTextField txtId;
    private JTextField txtNome;
    private JTextField txtPreco;
   
    private JLabel lbId;
    private JLabel lbNome;
    private JLabel lbPreco;

    private JButton btnSalvar;
    private JButton btnLimpar;

    public TelaProduto(){
        setTitle("Cadastro de Produtos");
        setSize(450,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        //painel
        JPanel painel = new JPanel();
        lbId = new JLabel("Id");
        lbNome = new JLabel("Nome");
        lbPreco = new JLabel("Preço");

        txtId = new JTextField(10);
        txtNome = new JTextField(20);
        txtPreco = new JTextField(10);

        btnLimpar = new JButton("Limpar");
        btnSalvar = new JButton("Salvar");

        //adicionar no painel na ordem que quero que apareça
        painel.add(lbId);
        painel.add(txtId);
        painel.add(lbNome);
        painel.add(txtNome);
        painel.add(lbPreco);
        painel.add(txtPreco);
        painel.add(btnSalvar);
        painel.add(btnLimpar);

        add(painel);

        //evento pro botão salvar
        btnSalvar.addActionListener(e -> salvarProduto());
        btnLimpar.addActionListener(e -> limparCampos());
        
        setVisible(true);
    }

    private void salvarProduto() {
        try {
            Produto produto = new Produto();
            produto.setId(Integer.parseInt(txtId.getText()));
            produto.setNome(txtNome.getText());
            produto.setPreco(Double.parseDouble(txtPreco.getText()));

            ArquivoProdutoCSV csv = new ArquivoProdutoCSV();
            csv.inserir(produto);
            JOptionPane.showMessageDialog(this, "Produto Salvo");
            limparCampos();
        } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(this, e.getMessage());
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtPreco.setText("");
        txtId.requestFocus();//manda o foco pra esta caixa de texto
    }


}
