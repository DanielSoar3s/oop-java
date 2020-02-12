package exercicioTempo;

import java.util.Scanner;

public class Principaç {
	
	public static void main(String[] args) {
		double area, raio, n = 3.14159;

		Scanner input = new Scanner(System.in);

		raio = input.nextDouble();
		area = n * (raio * raio);

		System.out.printf("\nA=%.4f %n\n",area);

		input.close();
	    
		}
}
