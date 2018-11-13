import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class VariabelTest {

	public static void main(String[] args){
		
		String fornavn = showInputDialog("Skriv inn ditt navn: ");
		String etternavn = showInputDialog("Skriv inn ditt etternavn");
		String årsTallTekst = showInputDialog("Skriv inn ditt årsTall");
		int årsTall = parseInt(årsTallTekst);

		showMessageDialog(null, "Hei " + fornavn + " "+ etternavn +"!" + "\n" + "Du er født i " + årsTall + "\n" + "Lykke til med Java");
		
	}	
}