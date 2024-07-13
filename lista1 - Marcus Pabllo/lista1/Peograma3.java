package lista1;

import java.util.Scanner;

public class Peograma3 {
	
	public static void main(String[] args) {
		
	int anos, m, dia, soma;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite sua idade: ");
	anos = sc.nextInt();
	
	System.out.println("Digite quantos meses: ");
	m = sc.nextInt();
	
	
	System.out.println("Digite quantos dias: ");
	dia = sc.nextInt();
	
	soma = anos * 365 + m * 30 + dia;
	
	System.out.println("Você possui "+soma+" dias");
	
	sc.close();
	} 
}
