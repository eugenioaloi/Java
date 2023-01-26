package Listato_03;

public class TestOggettiPunto {
	
	public static void main(String[] args) {
		//Istanza di un oggetto dalla classe Punto
		Punto pt1 = new Punto();
		pt1.x = 20;
		pt1.y = 50;
		
		Punto pt2 = new Punto();
		pt2.x = 15;
		pt2.y= 40;
		
		System.out.println(pt1.x);
		System.out.println(pt1.y);

		System.out.println(pt2.x);
		System.out.println(pt2.y);

		
	}

}
