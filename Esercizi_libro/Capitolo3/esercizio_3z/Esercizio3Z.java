package esercizio_3z;

public class Esercizio3Z {
	
	public static void main(String[] args) {
		
		//creato l'oggetto di tipo Alunno
		Alunno al = new Alunno("Mario", "Rossi", "5a");
		
		//creata la tabella dei voti
		String [][] voti = {
				{"Storia","9","Complimenti"},
				{"Italiano","8","Fantasmagorico"},
				{"Matematica","5","Non si impegna abbastanza"},
				{"Diritto","6","Appena sufficiente"}
		};
		
		//creato l'oggetto di tipo Pagella
		Pagella pagella1 = new Pagella(al,voti);
		
		//stampa risultati
		pagella1.stampaPagella();
	}

}
