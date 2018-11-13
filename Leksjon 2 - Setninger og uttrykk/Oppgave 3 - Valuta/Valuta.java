import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class Valuta  {
	public static void main(String[] args){

		double kurs = 8.43; 

		String valutaTxt = showInputDialog("Skriv inn en beløp for USD: "); 
		double beløp = parseInt(valutaTxt);

		double norskeKroner = beløp * kurs; 

		showMessageDialog(null, "Beløpet: " + beløp + "\n" + "fra USD: " + beløp + "\n" + "Til NOK: " + norskeKroner);
	}	
}