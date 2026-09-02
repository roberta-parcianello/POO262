package polimorfismoInferface;

public class Aviao implements Voador{

    @Override
    public void voar() {
        System.out.println("Avião voa com seus motores");
    }

}
