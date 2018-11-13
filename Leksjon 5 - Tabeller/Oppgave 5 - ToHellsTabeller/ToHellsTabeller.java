import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class ToHellsTabeller {
	
	public static void main(String[] args){
	
		int [] tabell1 = {2,9,7,4,9,1,2};
		int [] tabell2 = {3,2,8,1,2,4,5};

		Arrays.sort(tabell1);
		Arrays.sort(tabell2);

		int [] kopi = Arrays.copyOf(tabell1, tabell1.length);
		int [] kopi2 = Arrays.copyOf(tabell2, tabell2.length);

		int sumLengde = tabell1.length + tabell2.length;
		int [] tabellSum = new int[sumLengde];

		System.out.println(sumLengde);

		for (int x = 0; x < kopi.length-6; x++) {
			String txtUt1 = (Arrays.toString(kopi));
			for (int y = 0; y < kopi2.length-6; y++){
				String txtUt2 =(Arrays.toString(kopi2));
				System.out.println(txtUt1 + txtUt2);

			}

		}
		

	}	
}