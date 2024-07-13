package lista1;

import java.util.Scanner;

public class Programa1 {
	
	public static void main(String[] args) {
		
		int NumA = 0, NumB = 0, AUX = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um número: ");
		NumA = sc.nextInt();
		
		System.out.println("\nO NumA é: "+NumA);
		System.out.println("Escolha um segundo número: ");
		NumB = sc.nextInt();
		
		System.out.println("\nO NumB é: "+NumB);
		System.out.println("Fazendo a troca de NumA e NumB");
		AUX = NumA;
		NumA = NumB;
		NumB = AUX;
		System.out.println("NumA= "+NumA);
		System.out.println("NumB= "+NumB);
		
		sc.close();
	}

}
