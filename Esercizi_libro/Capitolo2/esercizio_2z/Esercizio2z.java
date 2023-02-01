package esercizio_2z;

public class Esercizio2z {
	
	public static void main(String[] args) {
		Citta capitale = new Citta("Berlino");
		Nazione naz = new Nazione("Germania", capitale);
		
		System.out.println("Fondata " + naz.nomeNazione + " con capitale " + naz.capitale.nomeCittà);
	}
	

}
