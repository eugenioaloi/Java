package esercizio_5b;

public class Gara {
	
	private String nome;
	private String risultato;
	private Auto griglia [];
	
	
	
	public Gara(String nome) {
		setNome(nome);
		setRisultato("Non ancora partiti");
		creaGrigliaDiPartenza();
	}

	//creazione griglia di partenza con ogg di tipo Pilota a oggetti di tipo Auto
	//tutti dentro un array griglia
	public void creaGrigliaDiPartenza() {
		
		Pilota uno = new Pilota("Trulli");
		Pilota due = new Pilota("Barrichello");
		Pilota tre = new Pilota("Massa");
		Pilota quattro = new Pilota("Schumacher");
		
		Auto autoUno = new Auto("Renault", uno);
		Auto autoDue = new Auto("Ferrari", due);
		Auto autoTre = new Auto("Renault", tre);
		Auto autoQuattro = new Auto("Ferrari", quattro);
		
		//griglia popolata
		griglia  = new Auto[4];
		griglia[0] = autoUno;
		griglia[1] = autoDue;
		griglia[2] = autoTre;
		griglia[3] = autoQuattro;
	}
	
	//
	public void corriGara() {
		int numeroVincente = (int)(Math.random()*4);
		Auto vincitore = arrivo(numeroVincente);
		String risultato = vincitore.dammiDettagli();
		setRisultato(risultato);
	}
	
	public Auto arrivo(int numero) {
		Auto auto = griglia[numero];
		return auto;	
	}
	

	//nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	//risultato
	public void setRisultato(String vincitore) {
		this.risultato = "il vincitore di " + this.getNome() + ": " + vincitore;
	}
	
	public String getRisultato() {
		return risultato;
	}
	
	
	

}
