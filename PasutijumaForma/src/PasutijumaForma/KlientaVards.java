package PasutijumaForma;

import java.util.Scanner;

public class KlientaVards {

	static private String vards;
	static private String uzvards;

	static Scanner ievade = new Scanner(System.in);

	public void getVards() {
		System.out.println("L�dzu ievadiet savu v�rdu");
		vards = ievade.nextLine();
		
	}

	public void getUzvards() {
		System.out.println("\nL�dzu ievadiet savu Uzv�rdu");
		uzvards = ievade.nextLine();
		System.out.println("\nSveicin�ti, " + vards + " " + uzvards + ".");
	}
	
	

}
