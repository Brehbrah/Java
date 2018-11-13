import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.*;

	
public class StudentSamling  {

	public static void main(String[] args){
		
    // Oppretter og initierer et studentobjekt
    Student s1 = new Student(0," "," ",0,' ');
    s1.studNr = 123456;
    s1.fornavn = "Per";
    s1.etternavn = "Karlsen";
    s1.fødtÅr = 1980;
    s1.kjønn = 'M';

    // Oppgave a - I StudentSamling-klassen skal det legges til to nye studentobjekt. Sørg 
    // for at et av dem får samme etternavn som et av de tidligere objektene 
    // og at et får samme fornavn som et annet objekt.  
    // Opprett en tabell, og «legg inn» alle studentene i tabellen. 
    // Utvid StudentSamling slik at programmet skriver ut en liste over alle 
    // studentene som er opprettet så langt. 

    System.out.println("Oppgave A:");

    Student s2 = new Student(32519, "Samsung", "Tablets", 2016, 'M');
    Student s3 = new Student(1111, "Iphone", "Apple", 2010, 'K');
    Student s4 = new Student(55912, "Furch", "Guitar", 2012, 'K');
    Student s5 = new Student(34912, "Rope", "Battle", 2000, 'K');

    Student [] studentTabell = new Student[5];

    studentTabell[0] = s1;
    studentTabell[1] = s2;
    studentTabell[2] = s3;
    studentTabell[3] = s4;
    studentTabell[4] = s5;

    for (int i=0; i<studentTabell.length; i++) {
        System.out.println(studentTabell[i].toString());
        }

    // oppgave b - Skriv ut alle studentene sortert etter stigende studentnummer via 
    // trikset med String-tabell og sort-metoden i Arrays-klassen.

        System.out.println("\n" + "Oppgave B:");

        // Her opprettes det tabell for å bemerke stud.tabell of definere det til student nummer tabell
        
        String[] studNrTabell = new String[studentTabell.length];
        
        for (int i=0; i<studentTabell.length; i++) {
            studNrTabell[i] = studentTabell[i].toString();    
        }
        Arrays.sort(studNrTabell);
    
        // Her skal det sorteres etter student nummeret.
        for (int i = 0; i < studNrTabell.length; i++) {
            System.out.println(studNrTabell[i]);
        }
        // Oppgave c - Skriv ut alle studentene sortert alfabetisk på etternavn ved samme 
        // teknikk som i forrige punkt.  

        System.out.println("\n" + "Oppgave C:");

        String [] studEtternavn = new String [studentTabell.length];
        for (int i = 0; i < studEtternavn.length; i++) {
            studEtternavn[i] = studentTabell[i].skrivEtternavn(); 
        }
        Arrays.sort(studEtternavn);

        for (int i = 0; i < studEtternavn.length; i++) {
            System.out.println(studEtternavn[i]);
        }

        // Oppgave d - Skriv ut en liste med alle studentene som først viser alle kvinnelige 
        // studenter, deretter alle mannlige studenter.  

        System.out.println("\n" + "Oppgave D:");

        String [] kjønnTabell = new String [studentTabell.length];
        for (int i = 0; i < kjønnTabell.length; i++) {
            kjønnTabell [i] = studentTabell[i].skrivKjønn();
        } 
        Arrays.sort(kjønnTabell);

        for (int i = 0; i < kjønnTabell.length; i++) {
            System.out.println(kjønnTabell[i]);
        }

        // Oppgave e - Les inn et fornavn fra bruker, og skriv ut en liste over alle studenter 
        // som har dette fornavnet (eller som sier at ingen studenter er funnet). 
        // Programmet skal ha en selvstendig hjelpemetode som evt. finner 
        // aktuelle studenter og returnerer dem via en String. 

        String input = showInputDialog("Oppgi ett fornavn:");
        String søkeNavn = søke(studentTabell, input);
        if (søkeNavn.length() == 0)
            System.out.println("Ingen studenter er funnet!");
        else
            System.out.println("\n" + "Studenten er funnet!");
	}	

    public static String søke(Student[] tab, String navn) {
        String resultat = "";
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].fornavn.equals(navn))
                resultat += tab[i].skrivEtternavn();
        }
        return resultat;
    }
}