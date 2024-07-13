package lista1;

import java.util.Scanner;

public class Programa8 {

	public static void main(String[] args) {
		
		String nome;
		float altura, peso, IMC;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Digite sua altura: ");
		altura = sc.nextFloat();
		
		System.out.println("Digite seu peso: ");
		peso = sc.nextFloat();
		
		IMC = peso/(altura * altura);
		
		System.out.println("Seu IMC é: "+IMC);
		sc.close();
	}
}
