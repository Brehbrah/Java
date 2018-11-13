import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class MønsterA {

	public static void main(String[] args){

		String errorTxt = "Det er ugyldig";
		String input = showInputDialog("Skriv inn tall mellom 1-10:");
		int tall = 0;
		boolean ugyldig;

		do {
			tall = parseInt(input);
			ugyldig = (tall < 1 || tall > 10);
			if (ugyldig)
				showMessageDialog(null, errorTxt);
		} while (ugyldig);

		
		String txtUt = " ";
		for (int x = 0; x <= tall; x++) {
			txtUt += "+ ";
			System.out.println(txtUt);
		}
		System.out.println();	
	}	
}