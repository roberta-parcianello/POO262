import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=10;i++){
            try {
                System.out.print("Digite um numero "+i +": " );
                int numero = sc.nextInt();
                System.out.println(100 / numero);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } finally{
                System.out.println("Tchau ...");
            }
           
        }

    }
}
