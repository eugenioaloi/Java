package esercizio_4ii;

public class CharAlfabeto {
	
	public static void main(String[] args) {
		
		char [] alfabeto = new char[26];
		for (int i=0; i<alfabeto.length; i++) {
			alfabeto [i] = (char) ('a'+i);
		}
		
		System.out.println(alfabeto);
		
	}

}
