package esercizio_4v;

public class TestStranaCalcolatrice {
	
	public static void main(String[] args) {
		
		StranaCalcolatrice stc = new StranaCalcolatrice();
		
		//inserimento dei numeri
		double [] numeri = {25.0,10.0,11.0,1.0};
		
		//chiamata al metodo somma
		double somma = stc.somma(numeri);
		System.out.println("Somma: " + somma);
		
		//chiamata al metodo moltiplicazione
		double mol = stc.moltiplicazione(numeri);
		System.out.println("Moltiplicazione: " +mol);
		
		//chiamata al metdo maggiore
		double mag = stc.maggiore(numeri);
		System.out.println("Maggiore: " + mag);
		
		//chiamata al metodo minore
		double min = stc.minore(numeri);
		System.out.println("Minore: " + min);
	
	
	}
}
