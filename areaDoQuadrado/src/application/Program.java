package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        
	     System.out.print("Digite o valor da aresta do quadrado: ");
	     double lado = sc.nextDouble();
	        
	     double area = Math.pow(lado, 2);
	        
	     System.out.println("A área do quadrado é: " + area);
	        
	    sc.close();

	}

}
