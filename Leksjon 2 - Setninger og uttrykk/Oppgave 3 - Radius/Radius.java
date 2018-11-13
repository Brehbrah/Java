import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class Radius {
	
	public static void main(String[] args){

		String radiusTxt = showInputDialog("Skriv inn en heltall for radius: ");
		double radius = parseInt(radiusTxt);
		double areal = 3.14 * radius * radius;

		showMessageDialog(null, "r = " + areal);
	
	}	
}