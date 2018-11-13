import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class MyntTeller {

	public static void main(String[] args){
		
		String mynt20Txt = showInputDialog("Skriv antall mynt ganger for mynt 20 kr: ");
		int mynt20 = parseInt(mynt20Txt);

		String mynt10Txt = showInputDialog("Skriv antall mynt ganger for mynt 10 kr: ");
		int mynt10 = parseInt(mynt10Txt);

		String mynt5Txt = showInputDialog("Skriv antall mynt ganger for mynt 5 kr: ");
		int mynt5 = parseInt(mynt5Txt);

		String mynt1Txt = showInputDialog("Skriv antall mynt ganger for mynt 1 kr: ");
		int mynt1 = parseInt(mynt1Txt);

		int sum = mynt20 + mynt10 + mynt5 + mynt1;

		showMessageDialog(null, "Myntveksling " + "\n" + 
								"--------------------------" + "\n" +
								"Antall 20 kr = " + mynt20 + "\n" + 
								"Antall 10 kr = " + mynt10 + "\n" + 
								"Antall 5 kr = " + mynt5 + "\n" + 
								"Antall 1 kr = " + mynt1 + "\n" +
								"--------------------------" + "\n" + 
								"Samlet beløp: " + sum + "\n" + 
								"--------------------------");		
	}	
}