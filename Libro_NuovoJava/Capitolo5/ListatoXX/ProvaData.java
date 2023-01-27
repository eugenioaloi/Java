package ListatoXX;

import java.util.Scanner;

public class ProvaData {
	
	public static void main(String[] args) {
		
		Data dt = new Data();
		System.out.println("Inserire la data di nascita dell'utente:");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Prima il giorno");
		int giorno = sc.nextInt();
		dt.setGiorno(giorno);
		
		System.out.println("poi il mese");
		int mese = sc.nextInt();
		dt.setMese(mese);
		
		System.out.println("Alla fine l'anno di nascita");
		int anno = sc.nextInt();
		dt.setAnno(anno);
		
		sc.close();
		
		System.out.println("Ecco la stampa completa della data di nascita dell'utente");
		
		//Stampa di tutti i dati inseriti
		System.out.println("L'utente è nato il "+ dt.getGiorno()+ "/"+ dt.getMese() +"/"+ dt.getAnno());
		
		
	}

}
