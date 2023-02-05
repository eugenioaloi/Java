package esercizio_3b;

public class Persona {
	
	String nome;
	String cognome;
	int eta;
	
	public void dettagli(String n, String c, int e) {
		nome= n;
		cognome = c;
		eta = e;
		System.out.println(n + " " + c + " ha " + e + " anni." );
	}

}
