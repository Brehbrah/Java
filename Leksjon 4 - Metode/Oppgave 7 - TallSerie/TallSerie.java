import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class TallSerie {

	public static void main(String[] args){
		String input1 = showInputDialog("Skriv inn en tall for Fra;");
		int tall1 = parseInt(input1);

		String input2 = showInputDialog("Skriv inn en tall for til;");
		int tall2 = parseInt(input2);

		//int svar = sum(3,7);
    // De to tallene bør leses inn!
    showMessageDialog(null, "Sum f.o.m " + tall1 + " t.o.m " + tall2 + " = " + sekvensSum(tall1, tall2));
  }

  private static int sekvensSum (int fra, int til) {  
    int summen = 0;
    for (int beregne = fra; beregne <= til ; beregne++)
    	summen += beregne;
    return summen;
  }
  
  	
}