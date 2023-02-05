package esercizio_4u;

import java.util.Scanner;

import esercizio_4t.CalcolatriceSemplificata;

public class ScannerCalcolatriceSemplificata {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//inserimento dei numeri
		System.out.println("Inserisci il primo numero");
		int a= sc.nextInt();
		System.out.println("Inserisci il secondo numero");
		int b= sc.nextInt();
		
		//creazione oggetto di tipo CalcolatriceSemplificata per eriditarne i metodi e le proprietà
		CalcolatriceSemplificata calcolatrice = new CalcolatriceSemplificata(a, b);
		
		//variabile di controllo del ciclo per la scelta dell'operazione
		boolean prosegui=true;
		
		//attivazione metodo in base alla scelta fatta
		while(prosegui) {
			System.out.println("Scegli l'operazione che vuoi eseguire tra quelle disponibili \n"
					+ " + (sommma) - (sottrazione) * (moltiplicazione) / (divisione)"
					+ " % (resto) > (confronto) & (media)");
			String operazione = sc.next();
				switch(operazione) {
					case "+": 
						calcolatrice.somma(); 
						prosegui = false; 
						break;
					case "-": 
						calcolatrice.sottrazione(); 
						prosegui = false; 
						break;
					case "*" : 
						calcolatrice.moltiplicazione(); 
						prosegui = false; 
						break;
					case "/" : 
						calcolatrice.divisione(); 
						prosegui = false; 
						break;
					case "%" : 
						calcolatrice.restoDiv(); 
						prosegui = false;
						break;
					case ">" : 
						calcolatrice.contfronta(); 
						prosegui = false; 
						break;
					case "&" : 
						calcolatrice.media(); 
						prosegui = false; 
						break;
					default : 
						System.out.println("Non ho capito l'operazione che vuoi fare");
						prosegui = true;
				}
		}
			
		sc.close();
	}
}

