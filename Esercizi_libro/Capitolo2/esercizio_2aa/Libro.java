package esercizio_2aa;

public class Libro {
	
	int pagine;
	String titolo;
	String autore;
	
	public Libro (int pag,String tit, String aut) {
		pagine = pag;
		titolo= tit;
		autore= aut;
		System.out.println("Costruito un nuovo libro");
	}
		
	public void stampaDett() {
		System.out.println("Il libro "+ titolo +" dell'autore "+ autore +" ha "+ pagine + " pagine");
	}
	

}
