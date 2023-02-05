package esercizio_3g;

import java.util.Scanner;

public class TestArgs {
	
	public static void main(String[] argomenti) {
		
		String[] args = {""};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire il primo elemento dell'array");
		args[0]= sc.next();

		System.out.println("Ecco la stampa: " + args[0]);	
		
		sc.close();
		
	}

}
