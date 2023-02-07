package biblioteca;

public class Libro {
	
	private String titolo;
	private String autore;
	private boolean inPrestito;
	
	public Libro() {}
	
	// costruttore
	public Libro(String titolo, String autore, boolean inPrestito) {
		setAutore(autore);
		setTitolo(titolo);
		setInPrestito(inPrestito);
	}
	
	public String getDescrizione() {
		String mexStato;
		if (inPrestito == true) {
			mexStato = "in prestito";
		}else {
			mexStato = "disponibile";
		}
		return titolo + ". Autore: " + autore + " - Il libro è " + mexStato;
	}
	
	public boolean getInPrestito() {
		return inPrestito;
	}
	
	public void setInPrestito(boolean stato) {
		this.inPrestito = stato;
	}

	//---- GETTER AND SETTER ------
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	
	
}
