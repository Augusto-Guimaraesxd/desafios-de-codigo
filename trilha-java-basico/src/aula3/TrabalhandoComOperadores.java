package aula3;

public class TrabalhandoComOperadores {
    public static void main(String[] args) {
        //testando diferentes resultados concatenados
        String nomeCompleto = "LINGUAGEM  "  + "JAVA";

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1"; //teste debug
        concatenacao = 1 + "1" + 1 + 1; //teste debug
        concatenacao = 1 +"1"+ 1 + 1; //teste debug
        concatenacao ="1"+ 1 + 1 + 1; //teste debug
        concatenacao ="1"+( 1 + 1 + 1);//teste debug
        System.out.println(concatenacao);
        System.out.println(nomeCompleto);
    }
}
