import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.*;
import java.io.*;


public class HelTall {

	public static void main(String[] args) throws Exception {
		
		String input = "HelTall.java";
		File filNavn = new File (input);
		Scanner reading = new Scanner(filNavn);
		
		int teller = 0;
		int leserLinje = 0;
		
		while (reading.hasNextLine()) {
			String leserLinje = reading.nextLine();
			teller++;
			System.out.println(teller + ": " + leserLinje);

			String [] dataTab = 

				
			
			}
		}
		reading.close();
	}	
}