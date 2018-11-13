import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class TallBokstav {

	public static void main(String[] args){

		int tallMax = 10;

		int [] heltall = lageTabell(tallMax);
		
		int [] tabell1 = new int [4];
		int [] tabell2 = new int [4];
		int [] tabell3 = new int [4];
		int [] tabell4 = new int [4];

		// Her skal det genereres tilfeldige tall fra ulike tabell

		for (int i = 0; i < tabell1.length; i++) {
			tabell1 [i] = (int) (Math.random()* 10);
		}

		for (int i = 0; i < tabell2.length; i++) {
			tabell2 [i] = (int) (Math.random()* 10);
		}

		for (int i = 0; i < tabell3.length; i++) {
			tabell3 [i] = (int) (Math.random()* 10);
		}

		for (int i = 0; i < tabell4.length; i++) {
			tabell4 [i] = (int) (Math.random()* 10);
		}

		// Her printes det ut resultatet for tabell 1-4:
		for (int i = 0; i < 4; i++) {
		}

		System.out.println("Tabell 1: " + (tabell1));
		System.out.println("Tabell 2: " + Arrays.toString(tabell2));
		System.out.println("Tabell 3: " + Arrays.toString(tabell3));
		System.out.println("Tabell 4: " + Arrays.toString(tabell4));


		// Oppgave C - Beregne gjennomsnittsverdiene til 
		// alle sifferne for tabell 1-4


		int summen = 0;
		for (int i = 0; i < tabell1.length; i++) {	

			summen +=  tabell1[i] + tabell2[i] + tabell3[i] + tabell4[i];
			System.out.print((tabell1[i] + tabell2[i] + tabell3[i] + tabell4[i] + " "));
		}
		System.out.print("\n" + "Summen er over gjennomsnittet: " + summen/4 + "\n");

		// Oppgave D - Opprette og fyller en tabell kalt Bokstaver 
		// av lengde 15 og tilfeldige bokstaver

		int antallBokstaver = 0; // Det må gis noe tall for å kalle opp bokstavene
		String bokstavKarakter = bokstaver(antallBokstaver);

		/*int antallBokstaver = 10; // Det må gis noe tall for å kalle opp bokstavene
		char [] bokstavKarakter = bokstaver(antallBokstaver);
		System.out.print(Arrays.toString(bokstavKarakter));*/

		// Oppgave E - Snu bokstavene i rekkefølgen

		int bokstaverTotalSnu = 5; //antall tabeller
		System.out.println();
		System.out.print(Arrays.toString(snuBokstav(bokstaverTotalSnu)));

	}	

	public static int [] lageTabell (int tall) {
		
		int nummer = 0;

		int [] tabell = new int [tall];
		for (int i = 0; i < 4; i++) {
			tabell [i] = nummer;
		}
		return tabell;
	}

	/*public static char [] bokstaver (int bokstav ) {
		char [] tekst = new char [bokstav];

		for (char i = 64; i < 90; i++) {
			bokstav = (char) (Math.random()* 26);
			
		}
		System.out.print("Bokstav: " + bokstav);
		return tekst;
	}*/

	
	public static String bokstaver (int bokstav) {

	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int nummer = alphabet.length();

    Random r = new Random();

    System.out.print("Random Bokstav: ");
    for (int i = 0; i < 15; i++) {
        System.out.print(alphabet.charAt(r.nextInt(nummer)));
    	}
	return alphabet;		
	}

	public static char [] snuBokstav (int lengdeBokstav) {
		char [] snuTabell = new char [lengdeBokstav];
		char [] bokstaver = {'A','E','I','O','U','Y'};

		for (int i = 70 ; snuTabell.length > i; i--) {
			int a = 0;			
			snuTabell[i] = bokstaver[a];
		}

		return snuTabell;
	}
	
}