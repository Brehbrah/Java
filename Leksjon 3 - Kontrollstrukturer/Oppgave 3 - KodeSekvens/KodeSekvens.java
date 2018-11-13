import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class KodeSekvens {

	public static void main(String[] args){
		
		String tall1 = showInputDialog("Tall a:");
		int a = parseInt(tall1);

		String tall2 = showInputDialog("Tall b");
		int b = parseInt(tall2);

		int total = 0;

		if (a > b)
			total = a - b;
		else
			total = b - a;
		System.out.println(total);
	}	
}