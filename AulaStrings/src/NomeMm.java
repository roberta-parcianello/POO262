import java.util.Scanner;

public class NomeMm {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Nome Completo ");
        String nomeCompleto = ler.nextLine();
        String partes[] = nomeCompleto.split(" ");
    
        for(int i=0;i<partes.length;i++){
            String primeiraLetra = partes[i].substring(0,1).toUpperCase();
            String restante = partes[i].substring(1).toLowerCase();
            System.out.print(primeiraLetra+restante+" ");
        }
        
    }

}
