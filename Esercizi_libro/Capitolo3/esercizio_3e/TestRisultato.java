package esercizio_3e;

public class TestRisultato {
	
	public static void main(String[] args) {
		Risultato res1 = new Risultato(45);
		System.out.println("prima del cambio -> " + res1.risultato);
		
		CambiaRisultato cambiaRes = new CambiaRisultato();
		float resCambiato = cambiaRes.cambiaRisultato(res1, res1.risultato, 15);
		
		System.out.println("dopo il cambio -> " +resCambiato);
	}

}
