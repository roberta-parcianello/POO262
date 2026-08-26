package polimorfismo;

public class Peao extends Peca{

    public Peao() {
    }

    public Peao(String cor, String posInicial) {
        super(cor, posInicial);
    }

    @Override
    public void movimento(String proxPosicao) {
        System.out.println("Sempre pra frente 1 casa, na primeira jogada pode andar 2. Captura na diagonal");
    }

    


}
