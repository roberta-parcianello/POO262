package polimorfismo;

public class Cavalo extends Peca{

    public Cavalo() {
    }

    public Cavalo(String cor, String posInicial) {
        super(cor, posInicial);
    }

    @Override
    public void movimento(String proxPosicao) {
        System.out.println("Movimento em L, 2 casas na horizontal ou vertical e depois uma casa para o lado");
    }


}
