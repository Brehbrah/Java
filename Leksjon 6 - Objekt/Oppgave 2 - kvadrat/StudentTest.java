import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.*;

	
public class StudentTest  {

	public static void main(String[] args){
		
	// Oppretter og initierer et studentobjekt
    Student s1 = new Student(0," "," ",0,' ');
    s1.studNr = 123456;
    // Evt. innkapsling krever metodekall, slik:
    // s1.setStudNr(123456);
    s1.fornavn = "Per";
    s1.etternavn = "Karlsen";

    // a) Utvider antall objektvariabler
    s1.fødtÅr = 1980;
    s1.kjønn = 'M';
 
    // Skriver ut utvalgte data om studenten
    out.println(s1.studNr + ": " + s1.etternavn);
    // Evt. innkapsling krever metodekall, slik:
    // out.println(s1.get(studNr) + ": " + s1.etternavn);
    out.println(s1.fødtÅr + ", " + s1.kjønn);
    out.println();
 
    // Endrer etternavn på studenten
    s1.etternavn = "Andersen"; 
    // Skriver ut studentdata på nytt
    out.println(s1.studNr + ": " + s1.etternavn);

    // b) Konstruktør i Student-klassen
    Student s2 = new Student(111222, "Kari", "Li", 1985, 'K');
    // Skriver ut utvalgte data om studenten
    out.println(s2.studNr + ": " + s2.fornavn + " " + s2.etternavn);
    out.println(s2.fødtÅr + ", " + s2.kjønn);
    out.println();

    // c) Overlaster konstruktøren i Student-klassen
    Student s3 = new Student(333222, "kNuT", "bY", 'M');
    // Skriver ut utvalgte data om studenten
    out.println(s3.studNr + ": " + s3.fornavn + " " + s3.etternavn);
    out.println(s3.fødtÅr + ", " + s3.kjønn);
    out.println();
    // NB! Etter pkt d) i oppgaven, er det en selvstendig hjelpemetode
    // i Student-klassen og denne sørger for at alle navn (både for- og
    // etternavn) får samme pene oppsett. Siden metoden er "private" 
    // kan den ikke kalles opp fra denne test-klassen.

    Student s4 = new Student(445566);
    // Skriver ut utvalgte data om studenten
    out.println(s4.studNr + ": " + s4.fornavn + " " + s4.etternavn);
    out.println(s4.fødtÅr + ", " + s4.kjønn);
    out.println(); 

    out.println("Student s2 kvinne? " + s2.erKvinne() );
    out.println("Student s4 kvinne? " + s4.erKvinne() );
  

	}	
}