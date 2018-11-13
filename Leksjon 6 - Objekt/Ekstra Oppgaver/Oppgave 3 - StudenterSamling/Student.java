import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.*;

public class Student {

    int    studNr;
    String fornavn;
    String etternavn;
    int    fødtÅr;
    char   kjønn;

  /* Konstruktør
   **********************/
  public Student(int studNr, String fornavn, String etternavn,
                 int fødtÅr, char kjønn) {
    this.studNr = studNr;
    this.fornavn = pent(fornavn);
    this.etternavn = pent(etternavn);
    this.fødtÅr = fødtÅr;
    this.kjønn = kjønn;   
  }
  // Overlaster konstruktøren med en som kun har studentnr
  public Student(int studNr) {
    this.studNr = studNr;
    // Setter dummy-verdier på resten (ikke nullstilling)
    this.fornavn = "Ola";
    this.etternavn = "Nordmann";
    this.fødtÅr = 1970;
    this.kjønn = 'M';
  }
  // Overlaster konstruktøren med en som har alt unntatt fødtår
  public Student(int studNr, String fornavn, String etternavn, char kjønn) {
    this(studNr,fornavn,etternavn,0,kjønn);
  }


  /* Objektmetoder
   **********************/

  // Først set- og get-metoder ved evt. innkapsling
  public int getStudNr() {
    return studNr;
  }
  public void setStudNr(int nyttStudentNr) {
    studNr = nyttStudentNr;
  }  
  public String toString() {
    // Dumper alle objektvariablenes verdier via en String
    return studNr+", "+fornavn+", "+etternavn+", "+fødtÅr+", "+kjønn;
  }  
  public String skrivEtternavn() {
    // Dumper alle objektvariablenes verdier via en String
    return etternavn+", "+fornavn+", "+studNr+", "+fødtÅr+", "+kjønn;
  } 

  public String skrivKjønn () {
    return kjønn+", "+studNr+", "+fornavn+", "+etternavn+", "+fødtÅr+", ";
  }

  public boolean erKvinne() {
    return kjønn=='K' || kjønn=='k';
  }
 
  // Hjelpemetode for å sikre fast oppsett av navn
  private String pent(String navn) { 
    char forbokstav = navn.toUpperCase().charAt(0);
    return forbokstav + navn.toLowerCase().substring(1);
  }  

}