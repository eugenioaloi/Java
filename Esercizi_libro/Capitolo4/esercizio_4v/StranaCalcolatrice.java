package esercizio_4v;

public class StranaCalcolatrice {
	
	//metodo somma
	public double somma(double [] numeri) {
		double sum=0;
		for(double numero:numeri) {
			sum += numero;
		}
		return sum;
	}
	
	//metodo moltiplicazione
	public double moltiplicazione(double [] numeri) {
		double mol = 1;
		for(double numero:numeri) {
			mol *= numero;
		}
		return mol;
	}
	
	//metodo >
	public double maggiore (double [] numeri) {
		double maggiore=numeri[0];
		for (int i=0; i<numeri.length; i++) {
			if (maggiore<numeri[i]) {
				maggiore = numeri[i];
			}
		}
		return maggiore;
	}

	//metodo <
	public double minore (double [] numeri) {
		double minore=numeri[0];
		for (int i=0; i<numeri.length; i++) {
			if (minore>numeri[i]) {
				minore = numeri[i];;
			}
		}
		return minore;
	}

	

}
