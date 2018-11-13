import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class Student {
	  
    int    studNr;
  	String fornavn;
  	String etternavn;

  // Oppgave a - i Student-klassen som setter inn startverdi i 
	// alle objektvariablene. Utvid StudentTest ved å føye til en ny student i 
	// programmet som opprettes vha konstruktøren.   
  	
  	int fødselsår;
  	String kjønn;



  // Oppgave b - Skriv inn en konstruktør i Student-klassen som setter inn startverdi i 
	// alle objektvariablene. Utvid StudentTest ved å føye til en ny student i 
	// programmet som opprettes vha konstruktøren.

  	public Student (int nyStudNr, String nyFornavn, String nyEtternavn, 
  					int nyFødselsår, String nyKjønn) {
  		studNr = nyStudNr;
  		fornavn = nyFornavn;
  		etternavn = nyEtternavn;
  		fødselsår = nyFødselsår;
  		kjønn = nyKjønn;
  	}
  // Oppgave c - Overlast konstruktøren med én som kun setter inn studentnr (resten 
	// skal være dummy-verdier), og en som setter inn alt unntatt fødselsår. 
	// Gjør bruk av this i minst en av konstruktørene. 

  	public Student (int overlastStudNr) {
  		this.studNr = overlastStudNr;

  		// Settes inn dummy verdier:

  		this.fornavn = pentMetode("cranberries");
  		this.etternavn = pentMetode("soup le voule!");
  		this.fødselsår = 1950;
  		this.kjønn = "I";
  	}

  // Oppgave d - Utvid Student-klassen med en toString-metode, en pent-metode som 
	// sikrer at navn har formen: "Stor første bokstav, resten små", og en 
	// metode som avgjør om studenten er kvinne eller ikke. 

  		public String toStringMetode() {
  			return fornavn + etternavn;
  		}

  	public String pentMetode (String navn) {
  		// Grunnen til at charAt(0) er fordi den starter med den første bokstaven
  		// i dette tilfelle er det 'C'
  		char storBokstav = navn.toUpperCase().charAt(0);
  		// substring(1) betyr at det starter med første bokstav etter 'C'
  		// I dette tilfelle er det 'r', så det er Cr 
  		return storBokstav + navn.toLowerCase().substring(1);
  	}

  // Metode for å finne ut om personen er kvinne eller ikke

	public boolean kvinne () {
		if (kjønn == "") 
			System.out.print("");
			else 
				System.out.print("");
			return kjønn == "K";
	}
}

