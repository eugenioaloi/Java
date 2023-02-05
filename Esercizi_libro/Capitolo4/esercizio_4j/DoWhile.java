package esercizio_4j;

public class DoWhile {
	
	public static void main(String[] args) {
		
		int j = 3;
		
		do {
			if(j%3==0) {
				System.out.println("Numero multiplo di 3 = " + j);
			}
		j++;
		}while(j<=30);
	}

}
