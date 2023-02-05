package esercizio_4b;

public class Alfabeto {
	
	public static void main(String[] args) {
		
		//si possono creare diverse soluzioni per questo esercizio
		
		System.out.println("***** PRIMA SOLUZIONE *****");
		
		//creare un array di tutte le lettere e poi ciclarlo
		char [] lettere = {'a','b','c', 'd','e','f','g','h','i','j','k','l','m','n','o','p','q',
				'r','s','t','u','v','w','x','y','z'};
		
		for (char lettera:lettere) {System.out.println(lettera);}
		
		System.out.print("***** SECONDA SOLUZIONE ***** \n");
		
		//Far creare al sistema tutte le lettere grazie ad un ciclo che aumenta una variabile d'incremento
		//ad ogni suo giro e sommarla alla lettere precedente partendo dalla prima 'a'
		for (int i=0; i<26;i++) {
			char carattere = (char) ('a'+i);
			System.out.print(carattere);
		}
		
		//le somma tra char e int
		
		int somma = 'a' + 1; // OUTPUT: 98
		System.out.println("\n"+somma);
		
		char sum = 'a' + 1 ; // OUTPUT: 'b'	
		System.out.println(sum);

	}

}
