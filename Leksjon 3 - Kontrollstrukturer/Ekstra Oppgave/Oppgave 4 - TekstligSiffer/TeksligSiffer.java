import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class TeksligSiffer {

	public static void main(String[] args){
		
		String input = showInputDialog("Skriv inn et heltall:");
		int tall = parseInt(input);

		int sisteSiffer = tall % 10;

		String txtUt = "Siste i sifferet i " + tall + " er " + sisteSiffer + " -> ";

		switch(sisteSiffer) {
			case 1: txtUt += "EN"; break;
			case 2: txtUt += "TO"; break;
			case 3: txtUt += "TRE"; break;
			case 4: txtUt += "FIRE"; break;
			case 5: txtUt += "FEM"; break;
			case 6: txtUt += "SEKS"; break;
			case 7: txtUt += "SYV"; break;
			case 8: txtUt += "ÅTTE"; break;
			case 9: txtUt += "NI"; break;
		}
		showMessageDialog(null,txtUt);



	}	
}