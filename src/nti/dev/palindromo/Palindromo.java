package nti.dev.palindromo;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe uma Palavra para verificação: ");
		String palavra = sc.nextLine();
		
		boolean check = palindromoCheck(palavra);
		System.out.println(check);
		
		sc.close();
	}

	
	static boolean palindromoCheck(String palavra) {
		
		String polindromo ="";
		System.out.println("Palavra = "+palavra);
		
		for(int i = palavra.length() -1; i >=0; i--) {
			polindromo += palavra.charAt(i);
		}
		System.out.println("Políndromo = "+polindromo);
		
		if(palavra.trim().toLowerCase().equals(polindromo.trim().toLowerCase())) {
			System.out.println("\nA palavra "+palavra+" é um Políndromo");
			return true;
		}
		System.out.println("\nA palavra "+palavra+" não é um Políndromo");
		return false;
	}


}
