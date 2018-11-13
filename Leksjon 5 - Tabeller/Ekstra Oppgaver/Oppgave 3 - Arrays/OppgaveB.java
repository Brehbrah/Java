import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class OppgaveB {

	public static void main(String[] args){
		
		
        int [] tabellA = new int [9];
        int [] tabellB = new int [9];


        for(int a = 0; a < tabellA.length; a++) {
            tabellA [a] = (int)(Math.random() * 25);
          
        }

        for (int b = 0; b < tabellB.length; b++) {
        	tabellB [b] = (int) (Math.random() * 25);
        	
        }

        // Oppgave A - lage 2 tabeller A og B

         System.out.print(Arrays.toString(tabellA) + " ");
         System.out.println();
         System.out.print(Arrays.toString(tabellB) + " ");
         System.out.println();

        // Oppgave B - if-else setning for å finne om verdien er like eller ikke
        if (Arrays.equals(tabellA, tabellB))
            System.out.print("Tabellene er like");
        else
            System.out.print("Tabellen er ikke like");

        // Oppgave C - sortere tabellen i Arrays-klasse 
        // Skriver ut de største sifferne i tabellen

        Arrays.sort(tabellA);
        Arrays.sort(tabellB);
        System.out.println();
        System.out.println("Tabellene er sortert under:");
        System.out.print(Arrays.toString(tabellA) + "\n");
        System.out.print(Arrays.toString(tabellB));
        
        // Det største siffer som printes ut
        System.out.println();
        int størteSiffer = 0;
        if (tabellA[8] < tabellB[8])
            størteSiffer = tabellB[8];
        else
            størteSiffer = tabellA[8];
        System.out.println("Det største sifferen: " + størteSiffer);

        // Leser inn fra brukerne og avgjør om det finnes tall i en eller begge tabellen

        String input = showInputDialog("Skriv inn tall mellom 0-25:");
        int tallAvBruker = parseInt(input);
        
        int posA = Arrays.binarySearch(tabellA, tallAvBruker);
        int posB = Arrays.binarySearch(tabellB, tallAvBruker);

        if (posA < 25 || 25 > posA)
            System.out.print("Tallet " + tallAvBruker + " finnes i tabellen");
        System.out.println();
        if (posB < 25 || 25> posB)
            System.out.print ("Tallet " + tallAvBruker + " Finnes ikke i tabellen");
          
	}	
}