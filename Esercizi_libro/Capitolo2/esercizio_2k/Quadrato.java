package esercizio_2k;

public class Quadrato {
	public int lato;
	public final int NUMERO_LATI=4;
		
	public int setLato (int l) {
		this.lato = l;
		System.out.println("Costruito quadrato con lato " + l + " cm");
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
			
	public String dammiDettagli(int area, int perimetro) {
		String dettagli = "L'area del quadrato è di " + area + "cm, mentre il perimetro equivale a " + perimetro + "cm" ;
		return dettagli;
	}
	
	public void stampaDettagli(String mex) {System.out.println(mex);}
	
}
