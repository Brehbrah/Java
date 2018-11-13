import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class TrapperTrinnA {
	
	public static void main(String[] args){
		
		input();

	}
		
	public static void input() {
		boolean error;
		int trapp = 0;

		do {
			trapp = parseInt(showInputDialog("Skriv inn tall mellom 2-9"));
			String txtError = "Ugyldig, prøv igjen!";
			error = (trapp < 2 || trapp >9);
			if (error)
				showMessageDialog(null, txtError);
		} while (error);

		antallGanger(trapp);
	}
	

	public static void antallGanger (int antall) {
		for (int i = 2; i <= antall; i++) {
			trapper(i);
		}
	}

	public static void trapper(int antall) {
		for (int i = 2; i <= antall; i++)
			System.out.print("T");
		System.out.println();
	}
}