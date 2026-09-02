package polimorfismoInferface;

public class Teste {
    public static void main(String[] args) {
        Animal a1 = new Cachorro("Luke");
        Animal a2 = new Gato("Miah");

        System.out.println(a1.getNome()+ "é um " + a1.getClass());
        System.out.println(a2.getNome()+ "é um " + a2.getClass());


    }
}
