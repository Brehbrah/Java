import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class VærMelding {

	public static void main(String[] args){
		
		antallMåned();

		// Opprettes antall Dager
		String input = showInputDialog("Oppgi Antall dager mellom 1-30: ");
		int tempVerdi = parseInt(input);
		System.out.print ("Antall Dager: " + tempVerdi + "\n");
		System.out.print ("---------------------------------------------" + "\n");
		System.out.print ("Samtidige temperatur" + "\n");


		// Opprette temperatur tabell

		int [] temperatur = new int [tempVerdi];

		for (int i = 0; i < temperatur.length; i++) {
			input = showInputDialog("Oppgi temperatur for dag : " + (i + 1));
			int tallSkrevet = parseInt(input);
			temperatur [i] = tallSkrevet;
			System.out.print(input + " ");
		}

		System.out.print("\n" + "---------------------------------------------");
					

		// Finne Gjennomsnitt
		int snitt = gjennomsnitt(temperatur);
		for (int x = 0; x < snitt; x++ ){
		}

		String utskrift2 = ("\n" + "Gjennomsnitt: " + snitt + "°C" + "\n");
		System.out.print(utskrift2);

		// Finne ut gjennomsnittet for temperaturen

		int minTemp = 100;
		int maxTemp = 0;

		for (int i = 0; i < temperatur.length; i++) {
			if (temperatur[i] < minTemp) {
				minTemp = temperatur[i];
			}
			if (temperatur[i] > maxTemp) {
				maxTemp = temperatur[i]; 
			}
		}
		System.out.print("Minimums Temperartur: " + minTemp + " °C" + "\n" + "Maximums Temperatur: " + maxTemp + " °C");	

	}	

	public static void antallMåned () {

		boolean error;
		int dagerInput = 0;
		do {
			String input = showInputDialog("Oppgi Mellom 1-12 for å finne måned:");
			dagerInput = parseInt(input);
			String errorTxt = "Prøv igjen!";
			error = (dagerInput < 1 || dagerInput > 12);
			if (error)
				showMessageDialog(null, errorTxt);
		} while (error);
		
		String txtUt = "Temperatursimulering:";
		switch (dagerInput) {
			case 1: txtUt += " Januar"; break;
			case 2: txtUt += " Februar"; break;
			case 3: txtUt += " Mars"; break;
			case 4: txtUt += " April "; break;
			case 5: txtUt += " Mai"; break;
			case 6: txtUt += " Juni"; break;
			case 7: txtUt += " Juli"; break;
			case 8: txtUt += " August"; break;
			case 9: txtUt += " September"; break;
			case 10: txtUt += " Oktober"; break;
			case 11: txtUt += " November"; break;
			case 12: txtUt += " Desember"; break;
			default: txtUt += " Ugyldig!"; 
		}
		System.out.print(txtUt + "\n");
	}  

	public static int gjennomsnitt(int [] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++){
			sum += tabell[i];
		}
		return sum/tabell.length;
	}

	public static int minDato (int [] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

}