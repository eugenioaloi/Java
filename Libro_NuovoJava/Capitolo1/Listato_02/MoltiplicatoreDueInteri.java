package Listato_02;

import java.util.Scanner;

public class MoltiplicatoreDueInteri {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Inserisci il primo numero: ");
		num1 = sc.nextInt();
		System.out.println("Inserisci il secondo numero: ");
		num2 = sc.nextInt();
		int res = num1+ num2;
		sc.close();
		
		System.out.println("Il risultato è:");
		System.out.println(res);
		
		
		
	}

}
