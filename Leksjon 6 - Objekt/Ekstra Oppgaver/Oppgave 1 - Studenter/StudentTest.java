import static java.lang.System.*;

public class StudentTest {

  public static void main(String[] args) {

    // Oppretter og initierer et studentobjekt
    Student s1 = new Student(0," "," ",0," ");

    // Vanlig konstruktør for s2
    Student s2 = new Student(8392, "Anne", "Berit", 1987, "K");

    // Overbelastende konstruktør for s3

    Student s3 = new Student(167788);

    // Første stor bokstav av fornavn 

    Student s4 = new Student(12345);

    s1.studNr = 123456;
    s1.fornavn = "Per";
    s1.etternavn = "Karlsen";
    s1.fødselsår = 0;
    s1.kjønn = "";

    // Settes opp ny student for å bruke set-get metode

    StudentSetGet s5 = new StudentSetGet(12345, "Khoi", "Hoang", 1987, "M");

    // Skriver ut utvalgte data om studenten
    out.println(s1.studNr + ": " + "" + s1.fornavn + " " + s1.etternavn);

    // Endrer etternavn på studenten
    s1.etternavn = "Andersen";

    // Skriver ut fødselsår
    s1.fødselsår = 2000;

    // Skriver ut kjønn
    s1.kjønn = "M";

    // Skriver ut studentdata på nytt
    out.println (s1.studNr + ": " + s1.etternavn + ", " + 
                 "Født: " + s1.fødselsår + ", " + "Kjønn: " + s1.kjønn);

    // Skriver ut data for konstruktøren

    out.println (s2.studNr + ": " + s2.fornavn + " " + s2.etternavn + ", " + 
                 "Født: " + s2.fødselsår + ", " + "Kjønn: " + s2.kjønn);

    // Skriver ut data for overbelastende konstruktøren og
    // Skriver ut data med første bokstav som er stor bokstav!

    out.println (s3.studNr + ": " + s3.fornavn + " " + s3.etternavn + ", " + 
                 "Født: " + s3.fødselsår + ", " + "Kjønn: " + s3.kjønn + "\n");

    out.println (s3.studNr + ": " + s3.fornavn + " " + s3.etternavn + ", " + 
                 "Født: " + s3.fødselsår + ", " + "Kjønn: " + s3.kjønn + "\n");

    // Printes ut om personen er kvinne eller ikke
    System.out.println("Student s1 er kvinne?" + s1.kvinne());
    System.out.println("Student s2 er kvinne?" + s2.kvinne());
    System.out.println("Student s3 er kvinne?" + s3.kvinne());
    out.println();
    System.out.println(s5.getStudNr() + " : " + s5.getNyFornavn() + " " + s5.getNyEtternavn() + ", " + 
                       s5.getNyFødselsår() + " " + s5.getNyKjønn());

  }

}