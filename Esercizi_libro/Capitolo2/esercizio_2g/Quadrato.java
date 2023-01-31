package esercizio_2g;

public class Quadrato {
	public int lato;
	public final int NUMERO_LATI=4;
	
	
	
	public int setLato (int l) {
		this.lato = l;
		return l;
	}
	
	public int perimetro(int l) {
		this.lato = l;
		int perimetro = lato * NUMERO_LATI;
		return perimetro;
	}
	
	public int area(int l) {
		this.lato = l;
		int area = lato * lato;
		return area;
		
	}
}
