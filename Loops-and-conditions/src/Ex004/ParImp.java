package Ex004;

import java.util.Scanner;

public class ParImp {
    public static void main(String[] args) {
        int numero = 0;  //ESTA VARIÁVEL RECEBE OS NUMEROS
        int quantNumeros; //ESTA RECEBE A QUANTIDADE DE NUMEROS
        int count = 0; // ESTE É O CONTADOR PARA USARMOS DE REFERENCIA NO LAÇO
        int quantPares = 0 , quantImpar = 0; // DUAS VARIÁVEIS PARA GUARDAR A QUANTIDADE DE PARES E IMPARES


        Scanner scan = new Scanner(System.in); // SCANNER PARA ENTRADA DE DADOS
        System.out.println("quantos numeros? "); // PARA O SISTEMA PERGUNTAR A QUANTIDADE DE NUMEROS QUE SERÃO DIGITADOS
        quantNumeros = scan.nextInt(); // RECEBE O VALOR DIGITADO E ATRIBUI A VARIAVEL
        do {
            System.out.println("Numero : ");
            numero = scan.nextInt(); //RECEBE UM NUMERO

            if(numero % 2 == 0)quantPares++; //FAZ O RESTO DA DIVISÃO E ATRIBUI +1 AOS CONTADORES DE PARES OU IMPARES
            else quantImpar++;

            count++; // ADICIONA MAIS 1 AO VALOR DE COUNT PARA QUE O LAÇO SE REPITA
        }while(count < quantNumeros); //LAÇO DE REPETIÇÃO , ENQUANTO COUNT FOR MENOR QUE A QUANTIDADE DE NUMEROS
        System.out.println("Quantidade pares : " + quantPares); // AO FIM IMPRIME A QUANTIDADE DE PARES E IMPARES
        System.out.println("Quantidade Impares : " + quantImpar);







    }
}