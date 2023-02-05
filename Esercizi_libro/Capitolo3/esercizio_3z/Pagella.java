package esercizio_3z;

import java.util.Arrays;

public class Pagella {
	
	//tabella associativi voti pagella
	String [][] tabella = {};
	
	//ogni volta che c'è una pagella cè anche un alunno, perciò si crea all'occorrenza
	public Alunno alunno;
	
	//una pagella si costruisce con l'alunno e la tabella - 
	public Pagella(Alunno al, String [][] tab) {
		alunno = al;
		tabella = tab;
	}
	
	public void stampaPagella() {
		System.out.println(alunno.toString());
		
		//Alla tabella viene applicato il metodo statico di Arrays per sfruttare il metodo toString
		System.out.println(Arrays.toString(tabella[0]));
		System.out.println(Arrays.toString(tabella[1]));
		System.out.println(Arrays.toString(tabella[2]));
		System.out.println(Arrays.toString(tabella[3]));
	}

}
