package polimorfismo;

public class Bispo extends Peca{

    public Bispo() {
    }

    public Bispo(String cor, String posInicial) {
        super(cor, posInicial);
    }

    @Override
    public void movimento(String proxPosicao) {
        System.out.println("Movimenta-se na diagonal quantas casas desejar desde que estejam livres");
    }
    

}
