import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class Fibonacci {
	
	public static void main(String[] args){
		
		String tallTxt = showInputDialog("Antall Fibonaccitall: ");
    	int n = parseInt(tallTxt);
 
    	int a=1, b=1; // De to første Fibonacci-tallene.
    	String ut = "Fibonacci Tall: " + a + "  " + b + "  ";

 	    for (int tall = 3; tall <= n; tall++) {
 	    	int fibonacci = a + b;
      		ut += fibonacci + "  ";
      		b = a;
      		a = fibonacci;
    	}
		showMessageDialog(null, ut);
	}	
}

