package polimorfismo;

public class Rainha extends Peca{

    public Rainha() {
    }

    public Rainha(String cor, String posInicial) {
        super(cor, posInicial);
    }

    @Override
    public void movimento(String proxPosicao) {
       System.out.println("Movimenta-se para qualquer direção ou sentido");
    }
    

    

}
