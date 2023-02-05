package esercizio_3z;

public class Alunno {
	
	String nome;
	String cognome;
	String classe;
	
	public Alunno (String nom, String cog, String cl ) {
		nome = nom;
		cognome = cog;
		classe = cl;
		System.out.println("Creato una nuovo alunno");
	}
	
	@Override
	public String toString() {
		return nome + " " + cognome + " della classe " + classe ;
	}

}
