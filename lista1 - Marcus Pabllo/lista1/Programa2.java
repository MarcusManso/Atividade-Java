package lista1;

import java.util.Scanner;

public class Programa2 {
	
	public static void main(String[] args) {
		
		int NumA = 0, NumB =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos determinar se um número é igual ou diferente");
		
		System.out.println("Escolha um número");
		NumA = sc.nextInt();
		System.out.println("\nO NumA é: "+NumA);
		
		System.out.println("Escolha outro número");
		NumB = sc.nextInt();
		System.out.println("\nO NumA é: "+NumA);
		
		if (NumA == NumB) {
			System.out.println("Os Números são iguais");
		} 
		else {
			if(NumA % 2 == 0 && NumB % 2 ==0) {
				System.out.println("Os Números são pares");
			}
			else if (NumA % 2 == 0 && NumB % 2 != 0) {
				System.out.println("O primeiro número é par e o segundo é impar");	
			}
			else if (NumA % 2 != 0 && NumB % 2 != 0) {
				System.out.println("O primeiro número é impar e o segundo é par");
			} else {
				System.out.println("O Números são impares");
			}
		}
		sc.close();	
	}
	
}
