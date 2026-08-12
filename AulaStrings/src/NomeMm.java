import java.util.Scanner;

public class NomeMm {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Nome Completo ");
        String nomeCompleto = ler.nextLine();
        String partes[] = nomeCompleto.split(" ");
        nomeCompleto="";
        for(int i=0;i<partes.length;i++){
            String primeiraLetra = partes[i].substring(0,1).toUpperCase();
            String restante = partes[i].substring(1).toLowerCase();
            nomeCompleto += primeiraLetra+restante;
            if (i<partes.length-1){
                nomeCompleto+=" ";
            }
        }
        System.out.println(nomeCompleto);
        
    }

}
