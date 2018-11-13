import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class Dagnavn {

	public static void main(String[] args){

	int tall;
	
	do{
	String input = showInputDialog("Skriv inn tall ett tall som leser inn ett dagnummer (1-7):");
	tall = parseInt(input);
	} while (tall < 1 || tall > 7);

	String txtUt = "Dagnummer" + tall + " er "; 
	
	switch (tall) {
		case 1: txtUt += "Mandag"; break;
		case 2: txtUt += "Tirsdag"; break;
		case 3: txtUt += "Onsdag"; break;
		case 4: txtUt += "Torsdag"; break;
		case 5: txtUt += "Fredag"; break;
		case 6: txtUt += "Lørdag"; break;
		case 7: txtUt += "Søndag"; break;
		default: txtUt += "ugyldig";
	}
	showMessageDialog(null, txtUt);	
	}	
}