package polimorfismo;

public class Rei extends Peca{

    public Rei() {
    }

    public Rei(String cor, String posInicial) {
        super(cor, posInicial);
    }

    @Override
    public void movimento(String proxPosicao) {
        System.out.println("Movimenta para qualquer direção ou sentido, uma casa por vez");
    }


}
