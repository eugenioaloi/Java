package esercizio_2l;

public class Nazione {

	public long popolazione;
	public String luogoGeografico;
	public String lingua;
	public String religione;
	public String governo;
	
	//Costruttore
	public Nazione() {
		System.out.println("Hai appena costruito una nazione!");
	}
	
	public long setPopol(long pop) {
		this.popolazione = pop;
		return pop;
	}
	
	public String setGeog(String geo) {
		this.luogoGeografico = geo;
		return geo;
	}
	
	public String setLingua(String idiom) {
		this.lingua = idiom;
		return idiom;
	}
	
	public String setRel(String rel) {
		this.religione = rel;
		return rel;
	}
	
	public String setGov(String gov) {
		this.governo = gov;
		return gov;
	}
	
	//Stampa dettagli della nazione costruita
	public void stampaDettagli(long popolazione, String luogoGeografico, String lingua, String religione, String governo) {
		System.out.println("In "+ luogoGeografico +" si parla principalmente "+ lingua +". Questa nazione è composta da "+ popolazione +" di abitanti, "
				+ "la maggior parte di religione "+ religione +", ed è governata da un governo di " + governo);
	}
		
}
