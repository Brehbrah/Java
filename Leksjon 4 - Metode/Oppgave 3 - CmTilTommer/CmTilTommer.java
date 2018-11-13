import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class CmTilTommer {

	public static void main(String[] args){	

		String inputCm = showInputDialog("Skriv inn tall for centimeter for å regne til tommer:");
		double cm = parseInt(inputCm);

		String inputTommer = showInputDialog("Skriv inn tall for tommer for å regne til centmeter:");
		double tommer = parseInt(inputTommer);

		String txtUt = "Input for cm: " + cm + "\n" +
					   "Fra cm: " + centimeterTommer(cm) + "\n" + 
					   "Fra tommer til cm: " + tommerTilCentimeter(tommer);
		System.out.println(txtUt);

	}	

	public static double centimeterTommer (double kalkulering) {
		return kalkulering * 0.393701;
	}

	public static double tommerTilCentimeter (double kalkulering) {
		return kalkulering /0.393701;
	}
}

