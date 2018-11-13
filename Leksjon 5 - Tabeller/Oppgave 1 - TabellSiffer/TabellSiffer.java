import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class TabellSiffer {

	public static void main(String[] args){

		int [] tabell = {6,3,5,6,7,3,8,9};

		int tall = parseInt(showInputDialog("Gi ett nummer for å finne ut om tallet er mindre enn tabellen sin verdi:"));
		int resultat = 0;

		for (int i = 0; i < tabell.length; i++){
			if (tall < tabell[i]) {
				resultat++; // Dette er for å plusse opp resultatet til tabellen
			}
		}

		System.out.println("tallet " + tall + " er mindre enn " + resultat);
    
	}	
}