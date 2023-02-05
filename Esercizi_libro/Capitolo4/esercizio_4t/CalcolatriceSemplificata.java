package esercizio_4t;

public class CalcolatriceSemplificata {
		
		double a, b; 
		
		//costruttore
		public CalcolatriceSemplificata(double num1, double num2) {
			a = num1;
			b = num2;
		}
		
		//somma
		public void somma() {
			double sum = a+b;
			System.out.println("Somma: " + sum );
		}
		
		//sottrazione, secondo con il primo
		public void sottrazione() {
			double sot = b-a;
			System.out.println("Sottrazione: " + sot );
		}
		
		//moltiplicazione
		public void moltiplicazione() {
			double mol = a*b;
			System.out.println("Moltiplicazione: " + mol );
		}
		
		//divisione
		public void divisione() {
			double div = a/b;
			System.out.println("Divisione: " + div );
		}
		
		//resto divisione
		public void restoDiv() {
			double resto = a%b;
			System.out.println("Resto della divisione: " + resto );
		}
		
		//confronto tra maggiore e minore
		public void contfronta() {
			if (a>b) {
				System.out.println(a +" è maggiore di " + b);
			}else {
				System.out.println(b +" è maggiore di " + a);
			}
		}
		
		//ritorno della media
		public void media () {
			double media = (a+b)/2;
			System.out.println("Media: " + media );
		}

}
