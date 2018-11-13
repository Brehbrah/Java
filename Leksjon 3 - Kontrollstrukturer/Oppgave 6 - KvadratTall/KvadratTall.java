import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class KvadratTall {

	public static void main(String[] args){
		
		int tall = 0;
		String txtUt = "Kvadrat tallet er: ";

		for(tall = 1; tall <= 10; tall++){
			txtUt += tall * tall + " ";
		System.out.println(txtUt);	
		}
	}	
}