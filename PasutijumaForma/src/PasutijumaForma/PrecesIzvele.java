package PasutijumaForma;

import java.util.Scanner;

public class PrecesIzvele {

	static Scanner ievade = new Scanner(System.in);

	String prece1 = "BURGER";
	String prece2 = "PIZZA";
	String prece3 = "AISA MIX";
	String prece4 = "KEBAB";
	int prece;
	String kontakktalrunis;

	public void precesIzvele() {
		
		do {
			System.out.println("Lûdzu izvçlaties vçlamo produktu " + "\n1: " + prece1 + "\n2: " + prece2 + "\n3: "
					+ prece3 + "\n4: " + prece4);

			prece = ievade.nextInt();
			if (prece > 0 && prece < 5) {
				System.out.println("Paldies, Jûs izvçlçjâties produktu Nr.: " + prece);
				
			} else {
				System.out.println("Lûdzu izvelaties produktu no 1 lîdz 4");
				prece = ievade.nextInt();
			}

		} while (prece > 0 && prece < 5);
		
	}
		public void getTel() {

		System.out.println("\nLûdzu ievadiet savu kontakttâlruni");
		kontakktalrunis = ievade.nextLine();
		ievade.nextLine();
		System.out.println("Paldies, Jûsu kontakttâlrunis ir: " + kontakktalrunis);

	}
}
