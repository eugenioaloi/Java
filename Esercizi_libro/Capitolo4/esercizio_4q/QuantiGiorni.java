package esercizio_4q;

import java.util.Scanner;

public class QuantiGiorni {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti giorni sono passati dalla tua ultima vacanza? ");
		int giorni = sc.nextInt();
		
		//quanti minuti sono passati? -> ogni giorno ha 1440 minuti
		int quantiMinuti = giorni*1440;
		System.out.println("Dalla tua ultima vacanza sono passati " + quantiMinuti + " minuti.");
		
		sc.close();
		
	}

}
