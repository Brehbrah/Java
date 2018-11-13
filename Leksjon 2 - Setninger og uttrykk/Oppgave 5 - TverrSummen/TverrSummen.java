import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class TverrSummen {
	public static void main(String[] args){

		String tallTxt = showInputDialog("Skriv en tall mellom 0 og 1000: ");
		int tallNummer = parseInt(tallTxt);

		int tallA = tallNummer % 10; 
		tallNummer = tallNummer/10;

		int tallB = tallNummer % 10;
		tallNummer = tallNummer/10;

		int tallC = tallNummer % 10;
		tallNummer = tallNummer/10;

		int summen = tallA + tallB + tallC ;

	showMessageDialog(null, "Tverrsummen = " + tallA + " + " + tallB + " + " + tallC + " + " + " = " + summen); 

		
	}	
}
