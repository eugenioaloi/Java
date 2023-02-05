package esercizio_3aa;

import java.util.Scanner;

public class CalcolaAreaTriangolo {
	
	double base = 3.8;
	double altezza = 5.4;
	
	//calcolare l'area del triangolo
	public double areaTriangolo(double a, double b) {
		base = b;
		altezza = a;
		double area = (a*b)/2;
		System.out.println("Area triangolo: " + area);
		return area;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CalcolaAreaTriangolo calcoloArea = new CalcolaAreaTriangolo();

		System.out.println("Inserisci la base del triangolo");
		double base= sc.nextDouble();
		System.out.println("Inserisci l'altezza del triangolo");
		double altezza= sc.nextDouble();
		
		calcoloArea.areaTriangolo(altezza,base);
		
		sc.close();
		
	}

}
