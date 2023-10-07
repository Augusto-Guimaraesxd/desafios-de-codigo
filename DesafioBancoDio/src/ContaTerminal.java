import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String nomeCompleto, agencia;
        int numero;
        double saldo;

        System.out.println("Por favor , digite sua Agencia com dígito");
        agencia = scan.next();

        System.out.println("Por favor , digite o número da conta ");
        numero = scan.nextInt();

        System.out.println("Por favor , digite o saldo");
        saldo = scan.nextDouble();

        System.out.println("Por favor , digite seu nome completo");
        nomeCompleto = scan.next();

        System.out.println("Olá " +nomeCompleto+ ",obrigado por abrir uma conta em nosso banco, sua agência é: " +agencia+ ", sua conta é: "+numero+ " e o seu saldo: " +(String.format("%.2f", saldo)+ " já está disponivel para saque"));


    }
}