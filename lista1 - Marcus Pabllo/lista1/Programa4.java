package lista1;

import java.util.Scanner;

public class Programa4 {
	
	public static void main(String[] args) {
		
		float n1, n2, n3, n4, n5, n6, media1, media2, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha o primeiro número: ");
		n1 = sc.nextInt();

		System.out.println("Escolha o segundo número: ");
		n2 = sc.nextInt();
		
		System.out.println("Escolha o terceiro número: ");
		n3 = sc.nextInt();
		
		System.out.println("Escolha o quarto número: ");
		n4 = sc.nextInt();
		
		System.out.println("Escolha o quinto número: ");
		n5 = sc.nextInt();
		
		System.out.println("Escolha o sexto número: ");
		n6 = sc.nextInt();
		
		media1 = (n1 +n2 + n3)/3;
		media2 = (n4 +n5 + n6)/3;
		soma = media1 + media2;
		
		System.out.println("A Média dos 3 primeiros números é: "+media1);
		System.out.println("A Média dos 3 últimos números é: "+media2);
		System.out.println("A Soma das médias é: "+soma);
		
		sc.close();
	}
}
