import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.*;
import java.io.*;


public class Navn {

	public static void main(String[] args) throws Exception{
		
		String input = showInputDialog("Skriv navnet til en tekstfil");
		File fil = new File (input);
		Scanner leser = new Scanner(fil);

		int linjeNr = 1;
		String linje;
		while (leser.hasNextLine()) {
			linje = leser.nextLine();
			System.out.println(linjeNr + ": " + linje);
			linjeNr++;
		}

		leser.close();
	}	
}