package esercizio_5e;

public class TestMoneta {
	
	public static void main(String[] args) {
		
		//viene creata un'istanza di tipo Portamonete
		PortaMonete pm = new PortaMonete();
		
		//vengono creati degli oggetti di tipo moneta
		Moneta m1 = new Moneta("Euro",10, true);
		Moneta m2 = new Moneta("Euro",10, false);
		Moneta m3 = new Moneta("Euro",10, true);
		Moneta m4 = new Moneta("Euro",10, false);
		Moneta m5 = new Moneta("Euro",10, true);
		Moneta m6 = new Moneta("Euro",10, false);
		Moneta m7 = new Moneta("Euro",10, true);
		Moneta m8 = new Moneta("Euro",10, false);
		Moneta m9 = new Moneta("Euro",10, true);
		Moneta m10 = new Moneta("Euro",10, false);
		Moneta m11 = new Moneta("Euro",10, false);
		
		
		//Al portamonete si aggiungo le monete. 
		try {
			pm.addMonete(m1);
			pm.addMonete(m2);
			pm.addMonete(m3);
			pm.addMonete(m4);
			pm.addMonete(m5);
			pm.addMonete(m6);
			pm.addMonete(m7);
			pm.addMonete(m8);
			pm.addMonete(m9);
			pm.addMonete(m10);
			pm.preleva(m10);//la moneta 10 viene prelevata per inserie la moneta 11 e non bloccare il programma
			pm.addMonete(m11);
			pm.stato();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	

}
