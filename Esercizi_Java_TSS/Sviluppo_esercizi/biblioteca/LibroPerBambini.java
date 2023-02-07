package biblioteca;

public class LibroPerBambini extends Libro {
	
	private int etaConsigliata;
	private Libro libro;
	
	//constructor
	public LibroPerBambini(int etaConsigliata, Libro libro) {
		setEtaConsigliata(etaConsigliata);
		setLibro(libro);
	}
	
	public String getDescrizione() {
		String mex;
		if(libro.getInPrestito()!=true){
			mex = "disponibile";
		}else {
			mex = "in prestito";
		}
		
		return libro.getTitolo() + ". Autore: " + libro.getAutore() + ", è consigliato dai " + etaConsigliata
				+ " anni in su. Il libro è " + mex ;
	}
	
	// ----------- GETTERE AND SETTER --------------
	
	//etaconsigliata
	
	public void setEtaConsigliata(int etaConsigliata) {
		this.etaConsigliata = etaConsigliata;
	}
	
	public int getEtaConsigliata() {
		return etaConsigliata;
	}
	
	//Libro

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	

}
