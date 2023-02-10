package esercizio_5b;

public class Auto {
	
	private String scuderia;
	private Pilota pilota;
	
	
	//constructor
	public Auto(String scuderia, Pilota pilota) {
		setScuderia(scuderia);
		setPilota(pilota);
	}
	
	//scuderia
	public void setScuderia(String scuderia) {
		this.scuderia = scuderia;
	}
	
	public String getScuderia() {
		return scuderia;
	}

	//pilota
	public Pilota getPilota() {
		return pilota;
	}

	public void setPilota(Pilota pilota) {
		this.pilota = pilota;
	}
	
	
	public String dammiDettagli() {
		return "Ha vinto " + pilota.toString() + " che gareggia nella scuderia " +  scuderia;
	}

}
