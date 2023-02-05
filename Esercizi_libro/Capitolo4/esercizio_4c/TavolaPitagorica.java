package esercizio_4c;

public class TavolaPitagorica {
	
	public static void main(String[] args) {
		
		for (int i=1; i<10;i++) {//righe
		System.out.println("Tabellina del: " + i);
			for(int j=1;j<=10;j++) {//colonne
				System.out.print(i*j+"  ");
			}
		System.out.println();
		}
		
	}

}
