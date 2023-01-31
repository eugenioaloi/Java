package esercizio_2d;

public class TestQuadrato {
	
	public static void main(String[] args) {
		Quadrato q1 = new Quadrato();
		
		q1.lato = 5;
		
		System.out.println("Il lato del quadrato è: "+ q1.lato);
		System.out.println("Il perimetro è: " + q1.perimetro(q1.lato));
		System.out.println("Il perimetro è: " + q1.area(q1.lato));

	}

}
