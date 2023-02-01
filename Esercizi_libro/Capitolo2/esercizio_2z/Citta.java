package esercizio_2z;

public class Citta {
	
	public String nomeCittà;
	
	public Citta(String città) {
		nomeCittà = città;
		System.out.println(città.substring(0, 1).toUpperCase() + città.substring(1)+ " è stata appena costruita");
	}

}
