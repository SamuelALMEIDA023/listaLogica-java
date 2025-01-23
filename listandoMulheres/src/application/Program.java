package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String[] nomes = new String[20];
        char[] sexos = new char[20];
        int[] idades = new int[20];

        // Armazena os dados das pessoas
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = sc.next();
            
            do {
                System.out.print("Digite o sexo (M/F): ");
                sexos[i] = sc.next().toUpperCase().charAt(0);
                if (sexos[i] != 'M' && sexos[i] != 'F') {
                    System.out.println("Sexo inválido. Digite novamente.");
                }
            } while (sexos[i] != 'M' && sexos[i] != 'F');

            do {
                System.out.print("Digite a idade: ");
                idades[i] = sc.nextInt();
                if (idades[i] <= 0) {
                    System.out.println("Idade inválida. Digite novamente.");
                }
            } while (idades[i] <= 0);
        }

        // Exibe as mulheres
        System.out.println("Lista de mulheres:");
        for (int i = 0; i < 20; i++) {
            if (sexos[i] == 'F') {
                System.out.println("Nome: " + nomes[i] + ", Idade: " + idades[i]);
            }
        }

        sc.close();

	}

}
