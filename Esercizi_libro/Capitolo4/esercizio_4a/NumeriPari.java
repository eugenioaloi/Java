package esercizio_4a;

public class NumeriPari {
	
	public static void main(String[] args) {
		
		int i = 0; //variabile di incremento
		int j= 0; //variabile di controllo del loop
		
		while (j<5) {
			i++;
			if (i%2==0) {
				System.out.println(i);
				j++;
			}
		}
		
	}

}
