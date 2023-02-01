package esercizio_2z;

public class Nazione {
	
	String nomeNazione;
	Citta capitale;
	
	public Nazione(String naz, Citta cap) {
		nomeNazione = naz;
		capitale = cap;
		System.out.println(naz.substring(0, 1).toUpperCase() + naz.substring(1)+ " è stata appena costruita");
	}
	
}
