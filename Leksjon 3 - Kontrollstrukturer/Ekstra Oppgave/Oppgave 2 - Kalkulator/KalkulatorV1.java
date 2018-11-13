import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class KalkulatorV1 {

	public static void main(String[] args){
	
	String input = showInputDialog("Skriv inn en heltall:");
	int tall1 = parseInt(input);

	String input2 =showInputDialog("Skriv inn en heltall for det neste tallet:");
	int tall2 = parseInt(input2);

	int summen = tall1 + tall2;
	int differanse = tall1 - tall2;
	int produkt = tall1 * tall2;
	double brøkVerdi = tall1/tall2;

	showMessageDialog(null, "Resultat:" + "\n" + 
		tall1 + " + " + tall2 + " = " + summen + "\n" + 
		tall1 + " - " + tall2 + " = " + differanse + "\n" + 
		tall1 + " * " + tall2 + " = " + produkt + "\n" + 
		tall1 + " / " + tall2 + " = " + brøkVerdi + "\n");		
	}	
}