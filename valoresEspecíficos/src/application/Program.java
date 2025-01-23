package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
          Locale.setDefault(Locale.US);
	  Scanner sc = new Scanner(System.in);
	  int n;
		
	  do {
            System.out.print("Digite a quantidade de números (positivo e menor que 20): ");
            n = sc.nextInt();
          } while (n <= 0 || n >= 20);
		
		
	   int[] valores = new int[n];
	   int soma = 0;
	   int maior = Integer.MIN_VALUE;
	   int menor = Integer.MAX_VALUE;
           int positivos = 0;
	   int negativos = 0;
		
           for (int i = 0; i < n; i++) {
               System.out.print("Digite o " + (i + 1) + "º valor: ");
               valores[i] = sc.nextInt();
               soma += valores[i];
               if (valores[i] > maior) {
            	   maior = valores[i];
               }
               else if (valores[i] < menor) {
            	   menor = valores[i];
               }
               else if (valores[i] > 0) {
            	   positivos++;
               }
               else if (valores[i] < 0) {
            	   negativos++;
               }
           }
        
           double media = (double) soma / n;
           double porcentagemPositivos = (double) positivos / n * 100;
           double porcentagemNegativos = (double) negativos / n * 100;
        
           System.out.println("Maior valor: " + maior);
           System.out.println("Menor valor: " + menor);
           System.out.println("Soma dos valores: " + soma);
           System.out.printf("Media: %.2f", media);
           System.out.println("Porcentagem de numeros positivos: " + porcentagemPositivos + "%");
           System.out.println("Porcentagem de numeros negativos: " + porcentagemNegativos + "%");	
		
	   sc.close();
	}

}
