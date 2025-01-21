package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int[] vetor = new int[20];

	        // Lê os valores do vetor
	        for (int i = 0; i < 20; i++) {
	            System.out.print("Digite o " + (i + 1) + "º valor: ");
	            vetor[i] = sc.nextInt();
	        }

	        System.out.print("Digite a constante multiplicativa: ");
	        int constante = sc.nextInt();

	        // Multiplica os valores pela constante
	        for (int i = 0; i < 20; i++) {
	            vetor[i] *= constante;
	        }

	        // Exibe o vetor modificado
	        System.out.println("Vetor modificado:");
	        for (int valor : vetor) {
	            System.out.println(valor);
	        }

	        sc.close();

	}

}
