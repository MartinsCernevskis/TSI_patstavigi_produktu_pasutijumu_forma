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
			System.out.println("L�dzu izv�laties v�lamo produktu " + "\n1: " + prece1 + "\n2: " + prece2 + "\n3: "
					+ prece3 + "\n4: " + prece4);

			prece = ievade.nextInt();
			if (prece > 0 && prece < 5) {
				System.out.println("Paldies, J�s izv�l�j�ties produktu Nr.: " + prece);
				
			} else {
				System.out.println("L�dzu izvelaties produktu no 1 l�dz 4");
				prece = ievade.nextInt();
			}

		} while (prece > 0 && prece < 5);
		
	}
		public void getTel() {

		System.out.println("\nL�dzu ievadiet savu kontaktt�lruni");
		kontakktalrunis = ievade.nextLine();
		ievade.nextLine();
		System.out.println("Paldies, J�su kontaktt�lrunis ir: " + kontakktalrunis);

	}
}
