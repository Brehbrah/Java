import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class Avtagende {

	public static void main(String[] args){

		// Dette er første måten at maskinen skal initiere avstegende seg selv  
		
		int [] tabell = {6,3,5,6,7,3,8,9};
		Arrays.sort(tabell);
		int lengde = tabell.length;

		for (int i = 0; i < lengde; i++){
			System.out.print(tabell[i]);
		}
	}	
}