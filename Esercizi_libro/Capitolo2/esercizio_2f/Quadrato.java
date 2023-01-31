package esercizio_2f;

public class Quadrato {
	public int lato;
	
	public int setLato (int l) {
		this.lato = l;
		return l;
	}
	
	public int perimetro(int l) {
		this.lato = l;
		int perimetro = lato *4;
		return perimetro;
	}
	
	public int area(int l) {
		this.lato = l;
		int area = lato * lato;
		return area;
		
	}
}
