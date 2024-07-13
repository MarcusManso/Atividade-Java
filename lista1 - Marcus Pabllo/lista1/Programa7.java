package lista1;

import java.util.Scanner;

public class Programa7 {

	public static void main(String[] args) {
		
		int n1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		n1 = sc.nextInt();
		
		if (n1 % 2 == 0) {
			System.out.println("Sucessor: "+(n1+2)+" E o Antecessor "+(n1-2));	
		} else {
			System.out.println("Sucessor: "+(n1+1)+" E o Antecessor "+(n1-1));
		}	
	sc.close();
	}
}
