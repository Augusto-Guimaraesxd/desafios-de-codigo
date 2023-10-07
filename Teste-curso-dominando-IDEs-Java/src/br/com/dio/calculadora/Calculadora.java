package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b; /* variaveis vazias */
		
		/*entrada de dados*/
		System.out.println("digite o primeiro valor: ");
		a = scan.nextInt();
		
		System.out.println("digite o primeiro valor: ");
		b = scan.nextInt();
		
		/*variaveis que recebem os valores inseridos acima + as funções*/
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		float divisao = divisao(a,b); /*float é utilizado para possíveis casas decimais*/
		int multiplicacao = multiplicacao(a,b);
		/*sistema mostra o resultado das operações*/
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(divisao);
		System.out.println(multiplicacao);
		
	/*funções para calcular os valores inseridos*/	
	}
	public static int soma(int a , int b) {
		return a + b;
	}
	public static int subtracao(int a , int b) {
		return a - b;
	}
	public static int divisao(int a , int b) {
		return a / b;
	}
	public static int multiplicacao (int a , int b) {
		return a * b;
	}
}
