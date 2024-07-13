package lista1;

import java.util.Scanner;

public class Programa5 {

	public static void main(String[] args) {
		
		float n1, r;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu saldo: ");
		n1 = sc.nextFloat();
	
		r = (n1/100) * 5;
		
		System.out.println("Seu saldo com reajuste: "+(r+n1));
		sc.close();
	}

}
