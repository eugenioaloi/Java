package biblioteca;

public class TestBiblioteca {
	
	public static void main(String[] args) {
		
		//istanza di una biblioteca
		Biblioteca biblioteca = new Biblioteca();
		
		//creazione di oggetti di tipo Libro 
		Libro lb1 = new Libro("I promessi Sposi", "Alessandro Manzoni", false);
		Libro lb2 = new Libro("La divina commedia", "Dante Alighieri", true);
		Libro lb3 = new Libro("Java per tutti", "Il programmatore figo", false);
		Libro lb4 = new Libro("Criptoponzi", "Satoshi Nakamoto", false);
		Libro lb5 = new Libro("Alice nel paese delle meraviglie", "Lewis carrol", false);
		Libro lb6 = new Libro("Le avventure di Geronimo Stilton", "Elisabetta dami", false);
		Libro lb7 = new Libro("Le avventure di Topolino", "Deagostini", false);
		
		//aggiunta dei libri alla bibilioteca
		biblioteca.addlibro(lb1);
		biblioteca.addlibro(lb2);
		biblioteca.addlibro(lb3);
		biblioteca.addlibro(lb4);
		biblioteca.addlibro(lb5);
		biblioteca.addlibro(lb6);
		biblioteca.addlibro(lb7);
		
		//assegnazione degli oggetti di tipo Libro a nuove istanze di LibroPerBambini
		LibroPerBambini lpb1 = new LibroPerBambini(3, lb5);
		LibroPerBambini lpb2 = new LibroPerBambini(6, lb6);
		LibroPerBambini lpb3 = new LibroPerBambini(3, lb7);
		
		// aggiunta sezione libri per bambini con un età consigliata
		biblioteca.addlibroPerBambini(lpb1);
		biblioteca.addlibroPerBambini(lpb2);
		biblioteca.addlibroPerBambini(lpb3);
		
		//check di un libro casuale
		Libro libro = lb1; //I promessi Sposi
		
		//true se il libro è presente in biblioteca - stampa una stringa per comunicare l'avvenuto controllo
		biblioteca.inBiblioteca(libro);
		
		//ritorno di quanti libri sono in prestito
		int libriInPrestito = biblioteca.totInPrestito();
		System.out.println("Libri in prestito: " + libriInPrestito);
		
		//presto il libro
		biblioteca.prestato(libro);
		
		//il libro ritorna in biblioteca
		biblioteca.restituito(libro);
		
		//true se non c'è nessun libro in prestito - stampa una stringa per comunicare l'avvenuto controllo
		// e in caso di libri prestati, quanti sono in prestito
		biblioteca.nessunPrestito();
		
		//Stampa i libri di eta consigliata = numero
		int nLibriConsigliati = biblioteca.perBambini(3);
		System.out.println("I libri con l'età consigliata inserita attulamente presenti sono " + nLibriConsigliati );
		
		
		
		
		
		
		
	}
}

