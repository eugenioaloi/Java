package esercizio_4w;

import java.util.Scanner;

import esercizio_4v.StranaCalcolatrice;

public class ScannerStranaCalcolatrice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StranaCalcolatrice stc = new StranaCalcolatrice();
		
		// si costruisce la lunghezza dell'array
		System.out.println("Quanti numeri vuoi inserire?");
		int quantiNumeri = sc.nextInt();
		
		//si costruisce una nuova istanza dell'array con la lungh indica precedentemente
		double[] numeri = new double[quantiNumeri];
		
		//si inseriscono i numeri ciclando l'array
		for (int i=0;i<numeri.length;i++) {
			System.out.println("Inserisci il prossimo numero: ");
			numeri[i] = sc.nextDouble();
		}
		
		System.out.println("Somma: " + stc.somma(numeri) );
		System.out.println("Moltiplicazione: " + stc.moltiplicazione(numeri) );
		System.out.println("Maggiore: " + stc.maggiore(numeri) );
		System.out.println("Minore: " + stc.minore(numeri) );
		
		sc.close();
		
	}

}
