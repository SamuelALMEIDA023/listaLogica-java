package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] valores = new int[20];
		int quantidade;
		
		do {
			System.out.println("Digite a quantidade de valores (1 a 20): ");
			quantidade = sc.nextInt();
			if (quantidade < 1 || quantidade > 20) {
	            System.out.println("Quantidade inválida. Digite novamente.");
	        }	
		} while(quantidade < 1 || quantidade > 20);
		
		
		for(int i = 0; i < quantidade; i++) {
			System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
		}
		
		
		char continuar;
		do {
			System.out.print("Digite um número para pesquisar: ");
            int numero = sc.nextInt();
            boolean encontrado = false;
            
            for (int i = 0; i < quantidade; i++) {
            	if(valores[i] == numero) {
            		System.out.println("Número encontrado na posição: " + i);
            		encontrado = true;
            		break;
            	}
            }
            
            
            if(!encontrado) {
            	System.out.println("Valor não encontrado");
            }
            
            
            System.out.print("Deseja fazer uma nova consulta? (S/N): ");
            continuar = sc.next().toUpperCase().charAt(0);
		} while(continuar == 'S');
		
		
		
		
		sc.close();
	}

}
