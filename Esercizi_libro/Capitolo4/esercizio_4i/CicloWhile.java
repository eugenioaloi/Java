package esercizio_4i;

public class CicloWhile {
	
	public static void main(String[] args) {
		
		int i=3;
		
		while(i<=30) {
			if(i%3==0) {
				System.out.println("Numero multiplo di 3 = " + i);
			}
		i++;
		}
	}
}
