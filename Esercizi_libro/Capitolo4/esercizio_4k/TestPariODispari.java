package esercizio_4k;

public class TestPariODispari {
	public static void main(String[] args) {
		
		//lancia un numero random e ottieni 0 or 1
		int numero = (int) (Math.random()*2);
		
		//crea un oggetto di tipo pari o dispari e passa il numero lanciato
		PariODispari pod = new PariODispari(numero);
		
		//controlla se pari o dispari e stampa il risultato
		pod.dammiPariODispari();
		
		/*Dietro a questa classe c'è lo stesso ragionamento di testa o croce.Al posto di farci restituire
		pari o dispari potremmo farci restituire dal programma testa o croce per l'appunto*/
		pod.dammiTestaOCroce();
		
	}
}
