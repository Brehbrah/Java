import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class PersonNummer {

	public static void main(String[] args){
		
		String nummerTxt = showInputDialog("Skriv inn 5 nummer: ");
		int nr = parseInt(nummerTxt);

		int midtSiffer = 0;

		String utTxt = "Personnummer " + nr + " til denne kjønnen ";

		if (midtSiffer % 2 == 0) // dette er partall
			utTxt += " er en kvinne";
		else 
			utTxt += " er en mann";

		showMessageDialog(null, utTxt);
	}	
}