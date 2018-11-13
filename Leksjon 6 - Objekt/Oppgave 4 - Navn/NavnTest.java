import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class NavnTest {

	public static void main(String[] args){
		
		String [] fornavnLister = {"Khoi", "Aiko", "Breh", "Brah"};
		String [] etternavnLister = {"Hoang", "Pomeranian", "Brah", "Tang"};

		NavnObjekt [] navnLister = new NavnObjekt[4];

		for (int i = 0; i < 4; i++) {
			navnLister[i] = new NavnObjekt(fornavnLister[i], etternavnLister[i]);
		}
		
		// Alternativ en for å vise frem tabellen for fornavn og etternavn

		for (int i = 0; i < 4; i++){
		} 
		System.out.println("Navn liste alternativ 1: " + " \n" + Arrays.toString(fornavnLister) + "\n" + 
													Arrays.toString(etternavnLister) + "\n");

		// Alterativ to for å vise frem tabellen i kombinasjon med fornavn og etternavn

		String txtUt = "Navne liste alternativ 2:" + "\n";
		for (int ii = 0; ii < 4; ii++) {
			txtUt += navnLister[ii].toStringMetode() + ", " + "\n";
		}
		System.out.println(txtUt);
	}	
}