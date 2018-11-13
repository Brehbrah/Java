import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.*;


public class DirekteAksess {

	public static void main(String[] args){

		// Oppgave a) Skriv klassen  Rom  der du velger passende datatyper for objektvariablene. Skriv 
		// inn to konstruktører, én som via parametre formidler startverdier til alle 
		// objektvariablene, og én som kun har romnummer som parameter. Skriv også koden 
		// for de nevnte set- og get-metodene, samt  toString -metoden. 

		System.out.println("Oppgave A:" + "\n");
		
		Rom r1 = new Rom(1234, "Naturfag Rom", 40, "Har Utstyr");
		Rom r2 = new Rom(5627);
		Rom r3 = new Rom(0);

		System.out.println(r1.toStringMetode());
		System.out.println("Set-Get Metode: " + r2.getRomNr());

		// Oppgave b - Skriv kun de setningene i et program som bruker Rom -klassen, for å skrive ut 
		// informasjon om alle rom som har plass til mellom 50 og 100 studenter. Skriv til 
		// konsollet, og bruk en linje pr rom. Her kan det forutsettes at alle rommene er 
		// registrert som Rom-objekt i tabellen romTab , og at denne tabellen er full. 

		r1.romTab();
	}	
}