package br.senac.pr.visao;

import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.senac.pr.arquivocsv.ArquivoProdutoCSV;
import br.senac.pr.jdbc.ProdutoDAO;
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
    private JButton btnBuscar;
    private JButton btnDeletar;

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
        btnBuscar = new JButton("Buscar");
        btnDeletar = new JButton("Deletar");

        //adicionar no painel na ordem que quero que apareça
        painel.add(lbId);
        painel.add(txtId);
        painel.add(lbNome);
        painel.add(txtNome);
        painel.add(lbPreco);
        painel.add(txtPreco);
        painel.add(btnSalvar);
        painel.add(btnLimpar);
        painel.add(btnBuscar);
        painel.add(btnDeletar);

        add(painel);

        //evento pro botão salvar
        btnSalvar.addActionListener(e -> salvarProduto());
        btnLimpar.addActionListener(e -> limparCampos());
        btnBuscar.addActionListener(e -> buscarProduto(txtId.getText()));
        btnDeletar.addActionListener(e -> deletarProduto());
        
        setVisible(true);
    }

    private void deletarProduto() {
       ProdutoDAO dao = new ProdutoDAO();
       try {
        buscarProduto(txtId.getText());
        int resp = JOptionPane.showConfirmDialog(this,"Deseja confirmar a exclusão?",
                                          "Confirmar exclusão",
                                           JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION){
            dao.deletar(Integer.parseInt(txtId.getText()));
            limparCampos();
        }else{
            limparCampos();
        }
        
       } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Informe um id valido");
       } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
       

    }

    private void buscarProduto(String id){
        ProdutoDAO dao = new ProdutoDAO();
        Produto produto;
        try {
            produto = dao.buscarProdutoPorId(Integer.parseInt(id));
            txtNome.setText(produto.getNome());
            txtPreco.setText(String.valueOf(produto.getPreco()));
        } catch (NumberFormatException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    private void salvarProduto(){
        try {
            Produto produto = new Produto();
            produto.setId(Integer.parseInt(txtId.getText()));
            produto.setNome(txtNome.getText());
            produto.setPreco(Double.parseDouble(txtPreco.getText()));

           // ArquivoProdutoCSV csv = new ArquivoProdutoCSV();
           // csv.inserir(produto);
           ProdutoDAO dao = new ProdutoDAO();
           dao.inserir(produto);
            JOptionPane.showMessageDialog(this, "Produto Salvo");
            limparCampos();
        }catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(this, e.getMessage());
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }catch(SQLException e){
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
