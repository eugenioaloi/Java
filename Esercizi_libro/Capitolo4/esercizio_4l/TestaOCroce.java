package esercizio_4l;

public class TestaOCroce {
	
	int numero;
	String mex;
	
	public TestaOCroce(int n) {
		numero=n;
	}
	
	public String dammiTestaOCroce() {
		if(numero%2==0) {
			mex = "testa";
		}else {
			mex = "croce";
		}
		switch(mex) {
			case "Testa" -> System.out.println("E' uscita testa");
			case "Croce" -> System.out.println("E' uscita croce");
		}
	return mex;
	}
	
}
