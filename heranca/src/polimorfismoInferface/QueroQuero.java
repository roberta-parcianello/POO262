package polimorfismoInferface;

public class QueroQuero extends Animal implements Voador, Nadador{

    public QueroQuero(String nome) {
        super(nome);
    }

    @Override
    public void nadar() {
        System.out.println("O quero-quero nada como um peixe");
    }

    @Override
    public void voar() {
        System.out.println("O quero-quero voa lindamente");
    }

    @Override
    public void emitirSom() {
       System.out.println("O som de um quero-quero é incrível");
    }

}
