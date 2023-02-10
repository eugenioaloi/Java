package esercizio_5b;

public class TestGara {
	
	public static void main(String[] args) {
		
		Gara imola = new Gara("Gp di Imola");
		
		imola.corriGara();
		String res = imola.getRisultato();
		System.out.println(res);
		
	}
	

}
