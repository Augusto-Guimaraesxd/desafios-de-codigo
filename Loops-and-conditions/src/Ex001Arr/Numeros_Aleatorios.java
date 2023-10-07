package Ex001Arr;

import java.util.Random;

public class Numeros_Aleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int [] numerosAleatorios = new int[20];
        for (int i = 0 ; i < numerosAleatorios.length ; i++ ){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.println("Numeros aleatorios");
        for (int numero : numerosAleatorios
              ) {
            System.out.println((numero+1) + " ");

        }

    }
}
