package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     String sexo;

	     do {
	        System.out.print("Digite o sexo (M/F): ");
	        sexo = sc.next().trim().toUpperCase();
	     } while (!sexo.equals("M") && !sexo.equals("F"));

	     System.out.println("Sexo válido digitado: " + sexo);
	     sc.close();
	}

}
