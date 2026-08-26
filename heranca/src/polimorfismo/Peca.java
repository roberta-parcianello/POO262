package polimorfismo;

public abstract class Peca {
    private String cor;
    private String posInicial;
    private String posAtual;

    private static int qtdPecas = 0; //atributo da classe 

    public Peca() {
    }

    public Peca(String cor, String posInicial) {
        this.cor = cor;
        this.posInicial = posInicial;
        this.posAtual = posInicial; //this se refere ao objeto atual
        qtdPecas++; //atributo da classe, não usa o this
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPosInicial() {
        return posInicial;
    }

    public void setPosInicial(String posInicial) {
        this.posInicial = posInicial;
    }

    public String getPosAtual() {
        return posAtual;
    }

    public void setPosAtual(String posAtual) {
        this.posAtual = posAtual;
    }


    //exige que seja implementado nas classes filhas
    public abstract void movimento(String proxPosicao);

    public void mostraQtdPecasCriadas(){
        System.out.println("foram criadas "+qtdPecas+ " peças");
    }

}
