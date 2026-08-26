package polimorfismo;

public class Torre extends Peca{
    private static int qtdTorre = 0;

    public Torre() {
    }

    public Torre(String cor, String posInicial) {
        super(cor, posInicial);
        qtdTorre++;
    }


    @Override
    public void movimento(String proxPosicao) {
        System.out.println("A Torre se movimenta em linhas horizontais ou verticais quantas casas desejar desde que esteja livre");        
    }
    
    public void mostraQtdTorresCriadas(){
        System.out.println("Foram criadas "+qtdTorre + " torres");
    }
   

}
