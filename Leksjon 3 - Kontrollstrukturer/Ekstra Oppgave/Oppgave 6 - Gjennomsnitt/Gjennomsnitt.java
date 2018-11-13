import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class Gjennomsnitt {

	public static void main(String[] args){

		String input1 = showInputDialog("Skriv inn en positivt heltall:");
		int tall1 = parseInt(input1);

		String input2 = showInputDialog("Skriv inn en neste positivt heltall:");
		int tall2 = parseInt(input2);

		int total = tall1 + tall2;
		int gjennomsnitt = total/2;

		showMessageDialog(null, tall1 + " + " + tall2 + " = " + total + "\n" + 
			"Gjennomsnittet er: " + tall1 + " / " + tall2 + " = " + gjennomsnitt);

	}	
}