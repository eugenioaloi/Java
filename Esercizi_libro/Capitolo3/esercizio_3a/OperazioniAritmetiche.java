package esercizio_3a;

public class OperazioniAritmetiche {
	
	public static void main(String[] args) {
		
		//Prima operazione
		int a = 5;
		int b = 3;
		
		double r1 = (double)a/b;
		System.out.println("Il risultato della divisione tra "+ a +" e "+ b +" è: "+r1);

		//Seconda operazione
		char c = 'a';
		short s = 5000;
		
		int r2= c*s;
		System.out.println("Il risultato della moltiplicazione tra "+ c +" e "+ s +" è: "+r2);
		
		//Terza operazione
		int i = 6;
		float f = 3.14f;
		
		float r3= i+f;
		System.out.println("Il risultato della moltiplicazione tra "+ i +" e "+ f +" è: "+r3);
		
		//Quarta operazione
		double r4 = r1-r2-r3;
		System.out.println("Il risultato della moltiplicazione tra "+ r1 +", "+ r2 +", "+ r3 +" è: "+r4);
		
	}

}
