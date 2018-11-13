import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class FakultetFunksjon {

	public static void main(String[] args){
		
		String input = showInputDialog("Skriv inn en tall for å beregne n-tall:");
		int tall = parseInt(input);

		String txtUt = "Fakultet for " + tall + " er: " + fakultet(tall); 
		System.out.println(txtUt);

	}	

	public static int fakultet (int beregne) {
		int tall = 1; 
		for (int i = 1; i <= beregne; i++) 
			tall = tall * i; 
		return tall;
	}
}