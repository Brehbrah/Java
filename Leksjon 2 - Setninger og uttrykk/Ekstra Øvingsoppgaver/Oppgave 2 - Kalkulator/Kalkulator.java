import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class Kalkulator {
	
	public static void main(String[] args){
		
		String tallTxt = showInputDialog("Skriv inn ett heltall:");
		int tall = parseInt(tallTxt);

		int sumTxtAddere = tall + tall;
		int sumTxtMultiplikasjon = tall * tall;

		showMessageDialog(null, "Sum: " + tall + " + " + tall + " = " + sumTxtAddere + "\n" + 
								"Sum: " + tall + " * " + tall + " = " + sumTxtMultiplikasjon);	

	}	
}