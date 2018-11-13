import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class TrehelTall {

	public static void main(String[] args){
		
		String tallA = showInputDialog("Skriv inn en tall for A:");
		int a = parseInt(tallA);

		String tallB = showInputDialog("Skriv inn en tall for B:");
		int b = parseInt(tallB);

		String tallC = showInputDialog("Skriv inn en tall for C:");
		int c = parseInt(tallC);

		String txtUt = "Tallet er Sortert: ";

		if (a < b && b < c);
			txtUt += a + " " + b + " " + c;
			if (a < c && c < b)
				txtUt += a + " " + c + " " + b;
			if (b < a && a < c)
				txtUt += b + " " + a + " " + c;
			if (b < c && c < a)
				txtUt += b + " " + c + " " + a;
			if (c < a && a < b) 
				txtUt += c + " " + a + " " + b;
			if (c < b && b < a) 
				txtUt += c + " " + b + " " + a;
		System.out.println(txtUt);
	}	
}