package Ex003;

import java.util.Scanner;

public class LeiaNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int count = 0;
        int somar = 0;
        do {

            System.out.println("Digite um numero :");
            numero = scan.nextInt();
            somar = somar + numero ;
            if (numero > maior) maior = numero;
            count = count + 1;

        }while (count < 5);

        System.out.println("maior = " + maior);
        System.out.println("media : "+ (somar/5));
    }
}
