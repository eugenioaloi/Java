package esercizio_2bb;

import java.util.Scanner;

public class CalcolaPerimetroQuadrato {
	
	int lunghLato;
	int perimetro;
	final int N_LATI= 4;
	
	public int CalcolaPerim(int lung) {
		lunghLato = lung;
		int perimetro = lunghLato*N_LATI;
		return perimetro;
	}
	
	public void stampaRisultato(int p) {
		perimetro = p;
		System.out.println("Il perimetro del quadrato equivale a: " + p + " cm");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CalcolaPerimetroQuadrato calcolo = new CalcolaPerimetroQuadrato();
		System.out.println("Inserisci la lunghezza di un lato del quadrato");
		int lunghezza = sc.nextInt();
		int perimetro = calcolo.CalcolaPerim(lunghezza);
		calcolo.stampaRisultato(perimetro);
		
		sc.close();
		
	}

}
