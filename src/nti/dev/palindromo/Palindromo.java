package nti.dev.palindromo;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe uma Palavra: ");
		String palavra = sc.nextLine();
		
		boolean check = palindromoCheck(palavra);
		System.out.println(check);
		
		sc.close();
	}

	
	static boolean palindromoCheck(String palavra) {
		
		String palindromo ="";
		System.out.println("\nPalavra = "+palavra);
		
		for(int i = palavra.length() -1; i >=0; i--) {
			palindromo += palavra.charAt(i);
		}
		System.out.println("Palíndromo = "+palindromo);
		
		if(palavra.trim().toLowerCase().equals(palindromo.trim().toLowerCase())) {
			System.out.println("\nA palavra "+palavra+" é um Palíndromo");
			return true;
		}
		System.out.println("\nA palavra "+palavra+" não é um Palíndromo");
		return false;
	}


}
