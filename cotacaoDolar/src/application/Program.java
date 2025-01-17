package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

	        System.out.print("Digite a cotação do dólar: ");
	        double cotacao = sc.nextDouble();

	        System.out.print("Digite a quantidade de dólares: ");
	        double dolares = sc.nextDouble();

	        // Calculando o valor em reais
	        double reais = cotacao * dolares;

	        System.out.println("O valor em reais é: R$ " + reais);

	        sc.close();
	}

}
