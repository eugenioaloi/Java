package esercizio_2k;

public class TestQuadrilateri {
	
	public static void main(String[] args) {
		
		//Costruzione ed elaborazione quadrato
		Quadrato q1 = new Quadrato();
		
		int latoQ = q1.setLato(10);
		int perQ= q1.perimetro(latoQ);
		int areaQ=q1.area(latoQ);
		
		String mexQ =q1.dammiDettagli(areaQ, perQ);
		q1.stampaDettagli(mexQ);
		
		//Costruzione ed elaborazione triangolo
		Triangolo tr1 = new Triangolo();
		
		tr1.buildTriangolo(10);
		
		// base e altezza utili per le formule sucessive
		int b= tr1.ottBase(); 
		double h= tr1.ottAltezza();
		
		int perT= tr1.perimetroTriangolo();
		double areaT=tr1.areaTriangolo(b, h);
		
		String mexT =tr1.dammiDettagli(areaT, perT);
		q1.stampaDettagli(mexT);
	}

}
