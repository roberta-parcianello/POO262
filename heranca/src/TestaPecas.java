import polimorfismo.*;

public class TestaPecas {
    public static void main(String[] args) {
        Peca peca1 = new Torre("branca", "A1");
        Peca peca2 = new Bispo("branca", "C8");
        Peca peca3 = new Cavalo("preta", "C1");
        Peca peca4 = new Rainha("preta","D8"); 
        
        System.out.println(peca1.getClass());
        peca1.movimento("A5");
        peca1.mostraQtdPecasCriadas();
        Torre.mostraQtdTorresCriadas();

        System.out.println(peca2.getClass());
        peca2.movimento("A5");
        peca2.mostraQtdPecasCriadas();

        System.out.println(peca3.getClass());
        peca3.movimento("A6");
        peca3.mostraQtdPecasCriadas();

        System.out.println(peca4.getClass());
        peca4.movimento("B1");
        peca4.mostraQtdPecasCriadas();

        

    }

}
