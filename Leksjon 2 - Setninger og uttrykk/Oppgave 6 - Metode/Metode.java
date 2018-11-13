import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;

public class Metode {
	
	public static void main(String[] args){
		
		int tall1 = parseInt(showInputDialog("Skriv inn heltall nr. 1:"));
		int tall2 = parseInt(showInputDialog("Skriv inn heltall nr. 2:"));
		int tall3 = parseInt(showInputDialog("Skriv inn heltall nr. 3:"));
		int tall4 = parseInt(showInputDialog("Skriv inn heltall nr. 4:"));

		Math.min(Math.min(tall1, tall2), Math.min(tall3, tall4));

		showMessageDialog(null, tall1 + tall2 + tall3 + tall4);



	}	
}