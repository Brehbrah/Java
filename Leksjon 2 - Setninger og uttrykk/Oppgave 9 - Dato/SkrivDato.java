import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class SkrivDato {

	public static void main(String[] args){
		int dato = parseInt(showInputDialog("Skriv inn en dato:"));
		int måned = parseInt(showInputDialog("Skriv inn en dato:"));
		int år = parseInt(showInputDialog("Skriv inn en dato:"));

		showMessageDialog(null, dato + "." + måned + "." + år);

	}	
}