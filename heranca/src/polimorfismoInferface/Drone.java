package polimorfismoInferface;

public class Drone implements Voador{

    @Override
    public void voar() {
        System.out.println("O Drone voa com suas hélices");
    }

}
