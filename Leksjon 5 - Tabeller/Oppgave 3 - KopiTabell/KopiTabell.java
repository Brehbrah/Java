import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class KopiTabell {

	public static void main(String[] args){

		int [] tabell = {20,5,8,10,27,16,3,18};
		System.out.println("Original: " + Arrays.toString(tabell));

		Arrays.sort(tabell);
		int [] kopi = Arrays.copyOf(tabell, tabell.length);

		// Årsaken til at det skal bli -7 er at du ikke skal lage flere kopier av reversert konsoll 
		// Skriver du f.eks. -6, så får du 2 identidske like 

		for (int i = 0; i < kopi.length-7; i++) {
			System.out.print("Reversert: " + Arrays.toString(kopi) + "\n");

		// Læreren sin løsning:

		int[] tall = {1,2,1,2,9,8,7,1,8,2};
    	Arrays.sort(tall);  // Sortert stigende - feil ordning
 
	    int[] kopi2 = Arrays.copyOf(tall, tall.length);
	    int sistePos = tall.length - 1;
 
 	   for (int y=0; y<=sistePos; y++)
    	  tall[i] = kopi2[sistePos-y];
    	System.out.print ("Læreren sin sortert tallsett: " + Arrays.toString(tall));
		}
	}	
}