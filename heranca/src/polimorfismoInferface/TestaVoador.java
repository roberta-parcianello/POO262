package polimorfismoInferface;

import java.util.ArrayList;

public class TestaVoador {
    public static void main(String[] args) {
        Voador v1 = new Passaro();
        Voador v2 = new Aviao();
        Voador v3 = new Drone();
        Voador v4 = new SuperHomem();

        v1.voar();
        v2.voar();
        v3.voar();
        v4.voar();

        ArrayList<Voador> voadores = new ArrayList<>();
        voadores.add(new Passaro());
        voadores.add(new Aviao());
        voadores.add(new Drone());
        voadores.add(new SuperHomem());
        
        for (Voador voador : voadores) {
            voador.voar();
        }
    }
}
