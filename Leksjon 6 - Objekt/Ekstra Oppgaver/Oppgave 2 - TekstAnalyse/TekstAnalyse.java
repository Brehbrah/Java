import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class TekstAnalyse {

	public static void main(String[] args){
		

		// Oppgave a - Slå om teksten i  tekst  til kun små bokstaver. 
		String tekst = showInputDialog("Skriv en tekst: ");
		String txtUt =  "Resultatet: " + tekst;
		System.out.println(txtUt);

		// oppgave b - Avgjør om bokstaven  e  er representert i teksten  tekst.

		if (tekst.contains ("e"))
			System.out.println("Bokstaven 'e' er presentert");
		else
			System.out.println("Bokstaven 'e' er ikke presentert");

		// oppgave c - Skriv en metode som teller antall forekomster av en gitt bokstav i 
		// en tekst. Test metoden ved å telle antall  t-er i teksten tekst.

		int antall = antallTeller(tekst, 't'); // kobler inn med tekst og 't' for å finne pga. metoden
		System.out.println("Antall av t'er: " + antall);

		// Oppgave d - Tell antall forekomster av alle de engelske bokstavene.

		antall = antallTeller(tekst, 'z');
		System.out.println("Antall av z'er er: " + antall);

		// oppgave e - Splitt teksten  tekst  i ord, og legg dem ett for ett i en tabell (se 
		// listing 6.4 i læreboka). Skriv ut teksten med ett ord pr linje ,der 
		// hvert ord er etterfulgt av antall bokstaver som er i dette ordet, 
		// gjerne noe slik:  Java - 4  

		String regex = "(\\.|,| |\n)+";

    	String[] ordTab = tekst.split(regex);
    
    	txtUt = "Antall bokstaver split av ord:" + "\n";
    	for (int i=0; i<ordTab.length; i++) {
    		txtUt += ordTab[i] + " - " + ordTab[i].length() + "\n";
    	}	
    	System.out.println(txtUt);

    	// Oppgave f - Slå om alle ordene slik at de starter med stor forbokstav, mens 
		// resten av ordet er i små.  

    	String søkeord = tekst;
    	søkeord = søkeord.toUpperCase();
    	for (int i = 0; i < ordTab.length; i++) {
    		String ord = ordTab[i].toUpperCase();
    		antall++;
    	}
    	System.out.println(søkeord);   
	}	

	// Hjelpe metode for å finne antall t'er

	private static int antallTeller(String tekster, char tegn) {
			int antall = 0;
			for (int i = 0; i < tekster.length(); i++) {
				if ( tegn == tekster.charAt(i))
				antall++; // antall++ er for å telle oppover antall bokstav
			}
		return antall;
	}
}