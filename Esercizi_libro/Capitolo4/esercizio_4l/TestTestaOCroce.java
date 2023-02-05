package esercizio_4l;

public class TestTestaOCroce {
	
	public static void main(String[] args) {
		
		//lancio della moneta
		int num_random = (int)(Math.random()*2);
		
		//costruzione dell'oggetto di tipo TestaOCroce
		TestaOCroce tc = new TestaOCroce(num_random);
		
		//Controllo del risultato
		tc.dammiTestaOCroce();
		
	}

}
