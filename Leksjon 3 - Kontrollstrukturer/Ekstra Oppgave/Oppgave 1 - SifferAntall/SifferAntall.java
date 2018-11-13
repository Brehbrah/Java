import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class SifferAntall {

	public static void main(String[] args){
		String input = showInputDialog("Skriv inn et heltall (på vanlig form)");
		int tall = parseInt(input);

		String txtUt = "";

		if (tall >= 1000)
			txtUt += "Flere enn tre siffer";
		else 
			txtUt += "Ikke mer enn tre siffer";

		showMessageDialog(null, txtUt);
	}	

}