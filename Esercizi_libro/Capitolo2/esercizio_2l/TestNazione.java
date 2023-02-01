package esercizio_2l;

public class TestNazione {
	
	public static void main(String[] args) {
		
		Nazione n1 = new Nazione();
		
		long popol = n1.setPopol( 46044703);
		String geo = n1.setGeog("Argentina");
		String lingua = n1.setLingua("Spagnolo");
		String rel = n1.setRel("cristiana");
		String gov = n1.setGov("Socialdemocrazia");
		
		n1.stampaDettagli(popol, geo, lingua, rel, gov);
	}

}
