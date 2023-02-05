package esercizio_4t;

public class TestCalcolatrice {
	
	public static void main(String[] args) {
		
		int a = 7;
		int b = 2;
		
		CalcolatriceSemplificata calcolatrice = new CalcolatriceSemplificata(a, b);
		
		calcolatrice.somma();
		calcolatrice.sottrazione();
		calcolatrice.moltiplicazione();
		calcolatrice.divisione();
		calcolatrice.restoDiv();
		calcolatrice.contfronta();
		calcolatrice.media();
		
	}

}
