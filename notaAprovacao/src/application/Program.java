package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota da P1: ");
        double p1 = sc.nextDouble();

        System.out.print("Digite a nota da P2: ");
        double p2 = sc.nextDouble();

        // Calculando a média ponderada
        double media = (p1 + 2 * p2) / 3;

        // Verificando aprovação
        if (media >= 5.0) {
            System.out.printf("Aprovado! Média: %.2f" , media);
        } else {
            System.out.printf("Reprovado. Média: %.2f" , media);
        }

        sc.close();

	}

}
