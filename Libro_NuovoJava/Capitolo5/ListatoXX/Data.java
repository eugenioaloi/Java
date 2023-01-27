package ListatoXX;

public class Data {
	
	private int giorno;
	private int mese;
	private int anno;
	
	//setter per il giorno
	public void setGiorno(int g) {
		if (g > 0 && g < 32) {
			giorno = g;
		}else {
			System.out.println("Il giorno inserito è errato");
		}
	}
	
	public int getGiorno() {
		return giorno;
	}
	
	//setter per il mese
	public void setMese(int m) {
		if (m > 0 && m < 13){
			mese = m;
		}else {
			System.out.println("Il mese inserito è errato");
		}
	}
	
	public int getMese() {
		return mese;
	}
	
	//setter per l'anno
	public void setAnno(int a) {
		if (a > 1900 && a < 2011){
			anno = a;
		}else {
			System.out.println("Il giorno inserito è errato");
		}
	}
	
	public int getAnno() {
		return anno;
	}
	
	
}
