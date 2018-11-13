import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class ToTall {

	public static void main(String[] args){
		String txtA = showInputDialog("Skriv en tall for A:");
		int tallA = parseInt(txtA);

		String txtB = showInputDialog("Skriv en tall for B:");
		int tallB = parseInt(txtB);

		String txtUt = tallA + " / " + tallB; 



		if (tallB != 0)
			txtUt += " = " + tallA/tallB;
		else
			txtUt += " = Går ikke";
	showMessageDialog(null, txtUt);
	System.out.println(txtUt);


		
	}	
}