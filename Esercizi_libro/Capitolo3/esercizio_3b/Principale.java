package esercizio_3b;

public class Principale {
	
	public static void main(String[] args) {
		
		//Creazione del primo oggetto di tipo Persona
		Persona persona1 = new Persona();
		
		//assegnazione dei valori tramite l'operatore dot
		persona1.nome="Mario";
		persona1.cognome="Rossi";
		persona1.eta=50;
		
		persona1.dettagli(persona1.nome, persona1.cognome, persona1.eta);
		
		//Creazione del secondo oggetto di tipo Persona
		Persona persona2 = new Persona();
		
		persona2.nome="Marco";
		persona2.cognome="Verdi";
		persona2.eta=30;
		
		persona2.dettagli(persona2.nome, persona2.cognome, persona2.eta);
		
		//Creazione del terzo oggetto di tipo Persona
		Persona persona3=new Persona();
		persona3 = persona1;
		
		//controllo dell'effettivo puntamento di persona3 a persona1
		persona3.dettagli(persona3.nome, persona3.cognome, persona3.eta);
		
	}

}
