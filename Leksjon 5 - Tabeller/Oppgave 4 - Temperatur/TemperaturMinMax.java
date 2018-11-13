import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class TemperaturMinMax {
	
	public static void main(String[] args){

		String [] tabellDagNavn = {"mandag" , "tirsdag", "onsdag" , "torsdag", "fredag", "lørdag", "søndag"};
		
		// denne variabelen opprettes tabellen verdien for 7 ganger, dvs mandag til søndag 
		double [] tempVerdi = new double[7];
	

		// Her skal det skrives inn for å punche tallene for dagene

		for (int dag = 0; dag < tabellDagNavn.length; dag++) {
			String txtUt = "Skriv temperatur verdien for " + tabellDagNavn[dag] + ":" + "\n";
			String txtMelding = showInputDialog(txtUt);
			// Her er verdien som skal føres for å skrives inn temperaturen, f.eks. mandag er 7
			tempVerdi[dag] = parseInt(txtMelding);
		}

		// Tallene blir registrert og printes ut:

		double tall = 0;
		double minTemp = 100;
		double maxTemp = 0;

		System.out.println("Temperaturen for denne uken");
		System.out.println();

		for (int i = 0; i < tabellDagNavn.length; i++) {
			tall += tempVerdi[i];
			// Her er det for å finne ut minimum:
			if (tempVerdi[i] < minTemp) {
				minTemp = tempVerdi[i];
			}
			// Her er det for å finne ut maksimum:
			if (tempVerdi[i] > maxTemp) {
				maxTemp = tempVerdi[i];
			}
			// Printer ut temperatur verdiene til konsollet
			System.out.println("Temperatur for " + tabellDagNavn[i] + " er: " + tempVerdi[i]);			
		}

		// Fortsettes med å printe ut verdien til konsollet
		double tempSnitt = tall;

		System.out.println();
		System.out.println("Gjennomsnitt temperatur for denne aktuelle uken: " + tempSnitt/7);
		System.out.println("Minimums temperatur for denne uken: " + minTemp);
		System.out.println("Maksimum temperatur for denne uken: " + maxTemp);
	}
}