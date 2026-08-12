public class App {
    public static void main(String[] args) throws Exception {
        String nome = new String();
        nome = "Fulano de Tal";
         String nome2 = "fulano de tal";
       
        if(nome=="Fulano"){
            System.out.println("é igual");
        }

        if(nome==nome2){
            System.out.println("igualdade de objeto");
        }

        if(nome.equals(nome2)){
            System.out.println("nome igualdade de conteúdo com nome2");
        }

        if(nome.equalsIgnoreCase(nome2)){
            System.out.println("igualdade ignorando se letras maiusculas ou minusculas");
        }

        String nome3 = nome;
        if(nome3.equals(nome)){
            System.out.println("igualdade de conteúdo");
        }
        if(nome3 == nome){
            System.out.println("igualdade de objeto");
        }

        System.out.println("A String nome tem "+nome.length()+" caracteres");

        nome = nome.toUpperCase();
        System.out.println(nome);
        nome = nome + " " + nome2;
        for(int i=0;i<nome.length();i++){
            System.out.println(nome.charAt(i));
        }

        System.out.println(nome.charAt(nome.length()-1));

        String nomes[] = nome.split(" ");
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);



    }
}
