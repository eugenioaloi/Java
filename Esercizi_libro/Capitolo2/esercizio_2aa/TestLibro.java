package esercizio_2aa;

public class TestLibro {
	
	public static void main(String[] args) {
		
		//costruito un nuovo libro
		Libro l1 = new Libro(190, "Il libro delle cripto", "Satoshi Nakamoto");
		l1.stampaDett();
		
		//costruito un nuovo libro
		Libro l2 = new Libro(245, "Libro dI fantasia", "Autore vero");
		l2.stampaDett();
	}

}
