import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class LengdeOmregning {
	
	public static void main(String[] args){
	
		String tommerTxt = showInputDialog("Skriv inn en tommer: ");
		double tommer = parseInt(tommerTxt);

		double konvertere = tommer * 2.54;

		showMessageDialog(null, "Tommer " + tommer + " = " + konvertere + " cm");



	}	
}