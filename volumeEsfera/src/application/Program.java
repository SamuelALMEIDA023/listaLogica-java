package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do diâmetro da esfera: ");
        double diametro = sc.nextDouble();
        
        double raio = diametro / 2;
        double volume = (4/3.0) * Math.PI * Math.pow(raio, 3);
        
        System.out.println("O volume da esfera é: " + volume);
        
        sc.close();

	}

}
