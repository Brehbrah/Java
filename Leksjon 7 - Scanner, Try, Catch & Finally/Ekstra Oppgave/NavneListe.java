import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.*;
import java.io.*;


public class NavneListe {

	public static void main(String[] args) throws Exception{

		/* Skriv et program som ber brukeren oppgi ett og ett navn på formen 
		 * "Etternavn, Fornavn" og legger dem i en tabell. Avslutt innlesingen 
		 * når "stopp" kommer, eller når det er lest inn 10 navn (maks antall).  
		*/

		// Oppgave a - Slå om alle navn til store bokstaver og sorter dem alfabetisk. Vis 
		// navnelista i et dialogvindu.  
		

		String [] navnTab = new String[10];

		int i = 0; // Det er for å indeksere av navn i listen
		
		String input;

		do {
			input = showInputDialog("Oppgi navn, eller skriv 'stopp'");
			if (input.equals("stopp")); {
				navnTab[i] = input;
				i++; // Dette her fortsette med å genere nye liste av navn
			} 
		} while (!input.equals("stopp"));
		int antallNavn = i;
		Arrays.sort(navnTab, 0, antallNavn); // 0 tallet er for å starte tabellen fra fresh start

		String txtUt = "Navnliste: ";

		for (i = 0; i < antallNavn; i++) {
			txtUt += navnTab[i];
			System.out.println(txtUt);
		}

		// Oppgave b - Programmet skal deretter åpne en tekstfil kalt "navn.txt" og skrive 
		// alle navnene i lista over på denne fila. 

		
		PrintWriter åpne = new PrintWriter("navn.txt");

		for (i = 0;  i < antallNavn; i++) {
			åpne.println(navnTab[i]);
		}

		åpne.close(); // Må ha close for å avslutte data informasjonen
					  // som skal strømmes inn med navn
	
		// Oppgave c - Skriv et nytt program som leser alle navnene fra fila, og lager en ny 
		// navneliste (tabell) der hvert navn nå er på formen: "Fornavn  E." 
		// Sorter denne lista alfabetisk og skriv den på fila: "fornavn.txt" 

	}	
}