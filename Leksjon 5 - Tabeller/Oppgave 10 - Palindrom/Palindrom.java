import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class Palindrom {

	public static void main(String[] args){
		
		String input = showInputDialog("Skriv inn setning:");
		char [] tekst = new char [input.length()];

		for (int i = 0; i < tekst.length; i++) {
			
		}
	}

	public static void reversere (int [] tabell) {
		String txtUt = ",";
		Arrays.sort(tabell);
		
		for (int i = tabell.length-1; i > 0; i--) {
			System.out.print(txtUt + tabell[i]);
		}
	}	
}