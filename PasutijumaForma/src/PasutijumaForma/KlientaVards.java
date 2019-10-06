package PasutijumaForma;

import java.util.Scanner;

public class KlientaVards {

	static private String vards;
	static private String uzvards;

	static Scanner ievade = new Scanner(System.in);

	public void getVards() {
		System.out.println("Lûdzu ievadiet savu vârdu");
		vards = ievade.nextLine();
		
	}

	public void getUzvards() {
		System.out.println("\nLûdzu ievadiet savu Uzvârdu");
		uzvards = ievade.nextLine();
		System.out.println("\nSveicinâti, " + vards + " " + uzvards + ".");
	}
	
	

}
