package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	public ArrayList<Libro> al = new ArrayList<>();
	public ArrayList<LibroPerBambini> alpb = new ArrayList<>();
	
	//aggiunge un libro all'ArrayList Biblioteca
	public void addlibro(Libro l) {
		al.add(l);
	}

	//aggiunge un libro all'ArrayList Biblioteca
	public void addlibroPerBambini(LibroPerBambini l) {
		alpb.add(l);
	}
	
	//restituisce true se il libro è presente in biblioteca
	public boolean inBiblioteca (Libro t) {
		boolean inBibilioteca = false;
		for (Libro l : al) {
			if (l.getTitolo().contains(t.getTitolo())) {
				inBibilioteca = true;
			}
		}
		if (inBibilioteca) {
			System.out.println("Il libro " + t.getTitolo() +" si trova in biblioteca");
		}else {
			System.out.println("Il libro " + t.getTitolo() +" non si trova in biblioteca");
		}
	return inBibilioteca;
	}
	
	// conta il numero di libri in prestito;
	public int totInPrestito() {
		int libriPrestati = 0;
		for (Libro l:al) {
			if(l.getInPrestito() == true) {
				libriPrestati++;
			}
		}
	return libriPrestati;
	}
	
	// consente di dare in prestito un libro se è disponibile;
	public void prestato(Libro l) {
		if (inBiblioteca(l) && l.getInPrestito() !=true) {
			l.setInPrestito(true);
			System.out.println("Libro disponibile al prestito");
		}else {
			System.out.println("Il libro non è presente in biblioteca oppure è già in prestito");
		}
	}
	
	// consente di restituire un libro dato in prestito;
	public void restituito(Libro l) {
		l.setInPrestito(false);
	}
	
	// restituisce true se nella biblioteca non vi sono libri in prestito
	public boolean nessunPrestito() {
		boolean libriInPrestito=true;
		int prestati = totInPrestito();
		for (Libro lb: al) {
			if (lb.getInPrestito()) {
				libriInPrestito = false;
			}
		}
		if (libriInPrestito) {
			System.out.println("Non ci sono libri in prestito");
		}else {
			System.out.println("Ci sono già " + prestati + " libri in prestito");
		}
	return libriInPrestito;
	}
	
	// conta quanti libri per bambini di età minore o uguale a n sono presenti in biblioteca.
	public int perBambini(int n) {
		int contaLibri = 0;
		for (LibroPerBambini libriBambini: alpb) {
			if (libriBambini.getEtaConsigliata()==n) {
				contaLibri++;
			}
		}
	return contaLibri;
	}
	
	
	
}
