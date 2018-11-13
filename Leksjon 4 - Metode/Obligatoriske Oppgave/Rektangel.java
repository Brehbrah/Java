import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.text.DecimalFormat;


public class Rektangel {

	public static void main(String[] args){

		DecimalFormat twoDec = new DecimalFormat("#.##");

		int a = parseInt(showInputDialog("Skriv inn verdi for bredde:"));
		int b = parseInt(showInputDialog("Skriv inn verdi for høyde:"));

		String txtUt = "Resultatet for rektangel " + "\n" + 
						"Areal: " + twoDec.format(areal(a,b)) + "\n" +
						"Omkretsen: " + twoDec.format(omkrets(a,b)) + "\n" + 
						"Diagonal: " + twoDec.format(diagonal(a,b)) + "\n" +
						"Z-Lengde: " + twoDec.format(z_lengde(a,b)) + "\n" +
						"N-Lengde: " + twoDec.format(n_lengde(a,b)) + "\n";
		if (a == b) 
			txtUt += "Innskrevne Sirkel: " + twoDec.format(innSirkel(a,b)) + "\n" + 
					 "omSkrevet Sirkel: " + twoDec.format(omSirkel(a,b));  
		showMessageDialog(null, txtUt);
		forsettelse();
		}	
	
	public static boolean forsettelse () {
		String input = showInputDialog("Ønsker du å fortsette? " + "\n" + "Ja = 1, Nei = 0");
		int resultat = parseInt(input);
		return (resultat == 1);
	}

	public static int areal (int a, int b) {
		return a*b;
	}

	public static int omkrets (int a, int b) {
		return 2*a + 2*b;
	}

	public static double diagonal (int a, int b) {
		return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
	}

	public static double innSirkel (int a, int b) {
		return Math.PI*Math.pow(a/2,2);
	}

	public static double omSirkel (int a, int b) {
		return Math.pow(diagonal(a,b)/2,2) *Math.PI; 
	}

	public static double z_lengde (int a, int b) {
		return (a*2 + diagonal(a,b));
	}

	public static double n_lengde (int a, int b) {
		return (b*2 + diagonal(a,b));
	}
}