package Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Digite o primeiro valor: ");
	        double valor1 = sc.nextDouble();
	        
	        System.out.print("Digite o segundo valor: ");
	        double valor2 = sc.nextDouble();
	        
	        System.out.print("Digite o terceiro valor: ");
	        double valor3 = sc.nextDouble();
	        
	        System.out.print("Digite o quarto valor: ");
	        double valor4 = sc.nextDouble();
	        
	        double media = (valor1 + valor2 + valor3 + valor4) / 4;
	        
	        System.out.println("A média aritmética é: " + media);
	        
	        sc.close();

	}

}
