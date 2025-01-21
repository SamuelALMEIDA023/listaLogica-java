package application;

public class Program {

	public static void main(String[] args) {
	  int a = 1, b = 1, c;
	  
	  System.out.print("Os 30 primeiros números da série de Fibonacci:");
	  System.out.print(a + ", " + b);
	  
	  for(int i = 3; i <= 30; i++) {
		  c = a + b;
		  System.out.print(", "+ c);
		  a = b;
		  b = c;
	  }

   }
}
