import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class MetodeTabell {

	public static void main(String[] args){
		
		int [] tall = {2,1,4,5,3,8,8,10,7,8};
		System.out.print("[");
		utskrift(tall);
		System.out.print("]");
	}	

	public static void utskrift (int [] tabell) {
		String txtUt = ",";
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(txtUt + tabell[i]);		
		}
	}
}