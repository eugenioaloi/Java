package esercizio_3u;

import java.util.Arrays;

public class Lettere {
	
	public static void main(String[] args) {
		
		char[] caratteri = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 
			 'i', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'z'};
		
		System.out.println("Puntamento: " + caratteri.toString());//<- stampa solo il puntamento all'oggetto
		
		/*Per la soluzione dell'esercizio si fa riferimento alla classe Arrays che contiene dei metodi
		statici di sort e search per stampare l'array caratteri come una Stringa*/
		
		String stringa = Arrays.toString(caratteri);
		
		System.out.println(stringa);
	}

}
