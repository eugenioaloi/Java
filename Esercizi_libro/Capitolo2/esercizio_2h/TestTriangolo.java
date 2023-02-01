package esercizio_2h;

public class TestTriangolo {
	
	public static void main(String[] args) {
		
		//costruzione del primo triangolo
		Triangolo tr1 = new Triangolo();
		tr1.buildTriangolo(10);
		
		//voglio ottenere la base e l'altezza per i sucessivi calcoli
		int base1 = tr1.ottBase();
		double altezza1 = tr1.ottAltezza();
		
		//perimetro
		int perimetro1 = tr1.perimetroTriangolo();
		
		//area
		double area1 = tr1.areaTriangolo(base1, altezza1);
		
		//Secondo triangolo
		Triangolo tr2 = new Triangolo();
		tr2.buildTriangolo(5);
		
		int base2 = tr2.ottBase();
		double altezza2 = tr2.ottAltezza();
		
		int perimetro2 = tr2.perimetroTriangolo();
		
		//area
		double area2 = tr2.areaTriangolo(base2, altezza2);
		
		//stampa dei risultati
		tr1.stampaDettagli(area1, perimetro1);
		tr2.stampaDettagli(area2, perimetro2);
		
	}

}
