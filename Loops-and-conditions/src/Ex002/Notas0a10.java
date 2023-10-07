package Ex002;

import java.util.Scanner;

public class Notas0a10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("digite a nota :");
        nota = scan.nextInt();

        while (nota <= 0 | nota > 10){
            System.out.println("Nota invalida,nota deve ser um valor entre 1 e 10");
            nota = scan.nextInt();
        }
    }
}
