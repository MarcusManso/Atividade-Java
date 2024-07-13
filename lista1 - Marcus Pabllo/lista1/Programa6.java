package lista1;

import java.util.Scanner;

public class Programa6 {

	public static void main(String[] args) {
		
		double sm = 954.00, s, s2;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
		s = sc.nextDouble();
		
		s2 = s/sm;
		
		System.out.println("Você ganha "+s2+ " Salários minimos.");
		sc.close();
	}

}
