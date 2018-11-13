import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class Unicode {

	public static void main(String[] args){
		
		int kodeNr = 0;

		for (kodeNr = 1; kodeNr < 126; kodeNr++) {
			char resultat = (char) kodeNr;
			System.out.println(kodeNr + " = " + resultat);
		}
	}	
}