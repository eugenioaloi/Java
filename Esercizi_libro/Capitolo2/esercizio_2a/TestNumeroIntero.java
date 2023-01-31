package esercizio_2a;

public class TestNumeroIntero {
	
	public static void main(String[] args) {
		
		// parte 1 - Istanza di due oggetti dalla classe NumeroIntero
		
		NumeroIntero num1 = new NumeroIntero();
		NumeroIntero num2 = new NumeroIntero();
		
		System.out.println("L'oggetto 1 si trova a questo indirizzo" + num1);
		System.out.println("L'oggetto 2 si trova a questo indirizzo" + num2);
		
		// parte 2 - inizializzazione e test
		
		num1.numeroIntero = 20;
		num2.numeroIntero = 50;
		
		num1.stampaNumero();
		num2.stampaNumero();
		
		// parte 3 - chiamata al costruttore
		
		num1.setNumero(15);
		num2.setNumero(27);
		
		num1.stampaNumero();
		num2.stampaNumero();
		
	}
	
	
	
	

}
