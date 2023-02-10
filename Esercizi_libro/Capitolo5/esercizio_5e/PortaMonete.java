package esercizio_5e;

import java.util.ArrayList;

public class PortaMonete {
	
	/*La classe PortaMonete prevede un arrayList di istanze di tipo Moneta e prevede i seguenti metodi*/
	
	private ArrayList<Moneta> money = new ArrayList<>();
	private final int CAPIENZA_PORTAMONETE = 10;
	
	/*aggiunge monete al salvadanaio. Una volta raggiunta la capienza massima di 10 elementi
	il programma si blocca e lancia l'eccezione impedendo ulteriori inserimenti a meno di prelievi
	con il metodo preleva() in grado di togliere un'istanza di moneta se presente nel portamonete*/
	public void addMonete(Moneta m) throws Exception {
		if (money.size()<CAPIENZA_PORTAMONETE) {
			money.add(m);
		}
		else {
			throw new Exception("Porta monete pieno");
		}
	}
	
	//preleva monete dal salvadanaio
	public void preleva(Moneta m) {
		money.remove(m);
	}
	
	//stampa il contenuto del salvadanaio
	public void stato() {
		for(Moneta m: money) {
			System.out.println(m);
		}
	}

	//schermata utente
	public void schermataUtente() {
		int spazio = CAPIENZA_PORTAMONETE - money.size();
		String qt = spazio>1 ? " monete." : " moneta.";
		System.out.println("Cosa vuoi fare? Ricorda che puoi inserire solo più " + spazio + qt);
		System.out.println("+ inserire");
		System.out.println("s stampare");
		System.out.println("- prelevare");
	}
	
	
	public int getCAPIENZA_PORTAMONETE() {
		return CAPIENZA_PORTAMONETE;
	}
	

}
