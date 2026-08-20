import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in); //decora isso
        String nome; 
        int idade;
        double salario;
        char sexo;
        boolean ativo = true;

        System.out.println("Hello, World!");
        System.out.print("Qual o seu nome? ");
        
        nome = leia.nextLine();//next() ler uma palavra até o espaço
                             //nextLine() ler linha inteira até o enter
        System.out.println("Boa Noite "+ nome + " qual a sua idade?");
        idade = leia.nextInt();
        //desvio condicional
        if (idade >= 18){
            System.out.println("Sua idade é: "+ idade + " por isso pode dirigir");
        }else{
            System.out.println("você é menor, ainda não pode dirigir");
        }
        
    }
}
