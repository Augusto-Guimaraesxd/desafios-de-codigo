package Ex005;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
    int numeroRes;

        Scanner scan = new Scanner(System.in);
        System.out.println("digite um numero de 1 a 10 :");
        int numero = scan.nextInt();
        for (int i = 1 ; i <= 10 ; i++){
            numeroRes = numero * i;

            System.out.println(numero + " x " + i + " = "+ numeroRes);

        }
    }
}
