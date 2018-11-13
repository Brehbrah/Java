import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Areal {
	public static void main (String[] args) {

	String lengde = showInputDialog("Skriv en heltall for lengden areal: ");
	int lengdeTall = parseInt(lengde);

	String bredde = showInputDialog("Skriv en heltall for bredden for en areal");
	int breddeTall = parseInt(bredde);

		int sum = breddeTall * lengdeTall;

	System.out.println(lengdeTall +  " * " + breddeTall + " = " + sum);

	}
}