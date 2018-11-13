import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class KvadratRun {

	public static void main(String[] args){

		KvadratObjekt k1 = new KvadratObjekt();
		KvadratObjekt k2 = new KvadratObjekt();
		KvadratObjekt k3 = new KvadratObjekt();

		String txtUt = "Areal 1: " + k1.areal1() + "\n" +
					   "Areal 2: " + k2.areal2() + "\n" +
					   "Areal 3: " + k3.areal3();

		System.out.print(txtUt);
		
		System.out.println();
		k1.utskrift1();
		System.out.println();
		k2.utskrift2();
		System.out.println();
		k3.utskrift3();



			
	}	


}