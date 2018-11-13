import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class TemperaturDag {
	
	public static void main(String[] args){

		String [] tabellDagNavn = {"mandag" , "tirsdag", "onsdag" , "torsdag", "fredag", "lørdag", "søndag"};
		// denne variabelen opprettes tabellen verdien for 7 ganger, dvs mandag til søndag 
		double [] tempVerdi = new double[7];

		// Her skal det skrives inn for å punche tallene
		for (int dag = 0; dag < 7; dag++) {
			String txtUt = "Skriv temperatur verdien for " + tabellDagNavn[dag] + ":" + "\n";
			String txtMelding = showInputDialog(txtUt);
			// Her er verdien som skal føres for å skrives inn temperaturen, f.eks. mandag er 7
			tempVerdi[dag] = parseInt(txtMelding);
		}

		// Her kommer utskriften for temperaturen
		for (int i = 0; i < 7; i++) {
			double tall = tempVerdi[i];
			String utskrift = ("Temperatur for " + tabellDagNavn[i] + " er: " + tempVerdi[i]);
			showMessageDialog(null, utskrift);

		}
	}
}