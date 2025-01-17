package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double total = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.print("Digite o valor do produto " + (i + 1)+ ": ");
            total += sc.nextDouble();
        }

        System.out.print("Digite o valor do pagamento: ");
        double pagamento = sc.nextDouble();

        // Calculando o troco
        double troco = pagamento - total;

        System.out.printf("O troco a ser devolvido é: R$ %.2f" , troco);

        sc.close();

	}

}
