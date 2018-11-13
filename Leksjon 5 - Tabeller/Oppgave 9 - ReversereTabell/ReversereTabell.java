import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;

public class ReversereTabell {
	
	public static void main(String[] args) {

		int [] tabell = {2,1,9,9,1,3,1,2,3};

		System.out.print("[");
		reversere(tabell);
		System.out.print("]");
	}

	public static void reversere (int [] tabell) {
		String txtUt = ",";
		Arrays.sort(tabell);
		
		for (int i = tabell.length-1; i > 0; i--) {
			System.out.print(txtUt + tabell[i]);
		}
	}
}