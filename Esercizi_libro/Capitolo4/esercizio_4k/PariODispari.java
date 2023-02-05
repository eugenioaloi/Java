package esercizio_4k;

public class PariODispari {
	
	int numero;
	
	public PariODispari(int num) {
		numero=num;
	}
	
	//metodo pari o dispari
	public void dammiPariODispari() {
		if(numero%2==0) {
			System.out.println("Numero pari");
		}else {
			System.out.println("Numero dispari");
		}
	}
	
	//metodo testa o croce
	public void dammiTestaOCroce() {
		if(numero%2==0) {
			System.out.println("Testa");
		}else {
			System.out.println("Croce");
		}
	}
	
}
