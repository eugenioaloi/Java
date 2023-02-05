package esercizio_4x;

import java.util.Scanner;

import esercizio_4l.TestaOCroce;

public class GiocoTestaOCroce {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vinto = 0;//<- conteggio vittorie
		int perso = 0;//<- conteggio sconfitte
		
		System.out.println("Quanti lanci vuoi fare?");
		int lanci = sc.nextInt();
		
		int i = 0; //<- serve solo a controllare il ciclo while
		while (i<lanci) {
			int num_random = (int)(Math.random()*2);
			
			TestaOCroce tc = new TestaOCroce(num_random);
			
			//l'utente fa la sua scelta
			System.out.println("Scegli testa o croce");
			String scelta = sc.next();
			
			//metodo che ritorno il mess (testa o croce) in base al numero lanciato
			String mess = tc.dammiTestaOCroce();
			System.out.println("E' uscito " + mess);
			
			//controllo della scelta e incremento della var in caso di vittoria o sconfitta
			if (mess.equals(scelta)) {
				vinto++;
			}else {
				perso++;
			}
			i++;
		}
		
		//controllo vittorie
		if (vinto>perso) {
			System.out.println("Complimenti hai vinto. Sei riuscito ad indovinare " + vinto + "/" + lanci + " lanci");
		} 
		else if (vinto<perso){
			System.out.println("Mi dispiace hai perso. Puoi ritentare! Sei riuscito ad indovinare " + vinto + "/" + lanci + " lanci");
		}else {
			System.out.println("Hai pareggiato la partita. Hai indovinato " + vinto +"/" + lanci + " lanci");
		}
		
		sc.close();
		
	}
}
