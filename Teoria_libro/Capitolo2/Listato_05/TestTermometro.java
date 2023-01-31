package Listato_05;

public class TestTermometro {
	
	public static void main(String[] args) {
		Termometro termCucina = new Termometro();
		termCucina.cambiaTemperatura(20);
		System.out.println("In cucina ci sono "+ termCucina.temp + "°C");
		System.out.println("Ho aperto la finestra: ");
		termCucina.cambiaTemperatura(-2.5);
		System.out.println("Ora in cucina ci sono "+ termCucina.temp + "°C");
		

		
	}

}
