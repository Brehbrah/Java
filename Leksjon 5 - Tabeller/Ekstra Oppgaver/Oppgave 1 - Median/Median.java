import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class Median {

	public static void main(String[] args){
		
		String input = showInputDialog("Skriv tall mellom 1-25: ");
		int antall = parseInt(input);

		// Her lages det ny array objekt, og variabelen heter tall
		// verdien er antall, pga. primitiv data type er int.
		// new lager en ny objekt og kan brukes til referanse, i dette tilfelle [antall]
		// Primitive data type har ikke metoder/egenskap, men har Array som egenskap
		// som .length of metode spesifikt for å klone metoden.
		int [] tall = new int [antall];

		for (int i = 0; i < tall.length; i++) {
			input = showInputDialog("Oppgi heltall for: " + i);
			int tallSkrevet = parseInt(input);
      		tall[i] = tallSkrevet; // Her leses det fra høyre side tallSkrevet som symbol
      							   // Viktig for å printe ut tallene til konsollene, eks. 213
      							   // Hvis ikke blir det bare vist f.eks. 000
		}

		// Printes ut antall Heltall for oddetall
      	int oddeTall = 0;
      	int antOdde = 2*antall - 1; // For å regne oddetall er 2n-1, ergo 2*n-1
      	System.out.println("Antall Helltall = " + antOdde + "(Oddetall)");

		// Printes ut Innleste tallsett
		System.out.print("Innlest tallsett: ");
		for (int nr=0; nr<antall; nr++) {  
      		out.print(tall[nr] + " "); 
      	}

      	// Printes ut Medianen
      	System.out.println();
      	int median = 0;
      	int miderstTall = antall/2;
      	System.out.println("Median: " + miderstTall);
    }
}