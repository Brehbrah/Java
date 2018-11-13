import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class HelTall {
	public static void main (String[] args) {
		
		String tallA = showInputDialog("Skriv inn en første heltall:");
		int tallX = parseInt(tallA);

		String tallB = showInputDialog("Skriv inn en andre heltall: ");
		int tallY = parseInt(tallB);

		int sum = tallX + tallY;
		
		System.out.println(sum);
	}
}