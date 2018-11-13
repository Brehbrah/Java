import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class TrapperTrinnB {

	public static void main(String[] args) {


		boolean error;
		int trapp = 0;

		do {
			trapp = parseInt(showInputDialog("Skriv inn tall mellom 2-9"));
			String txtError = "Ugyldig, prøv igjen!";
			error = (trapp < 2 || trapp > 9);
			if (error)
				showMessageDialog(null, txtError);
		} while (error);

		linjer(trapp);
	}


	// Denne metoden her gjelder for antall linjer som skal skrives ut mot konsollen
	public static void linjer (int antall) {
		for (int i = 2; i <= antall; i++) {
			for (int x = antall; x > i; x-- ) { //teler nedover mot i
				out.print(" ");
			}
			trapper(i);
		}
	}

	// Her skal det printes ut " T " på konsollen
	public static void trapper(int antall) {
		for (int i = 2; i <= antall; i++)
			System.out.print("T");
		System.out.println();
	}
}