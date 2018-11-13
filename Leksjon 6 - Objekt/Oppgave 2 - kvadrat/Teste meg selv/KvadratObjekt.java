import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;

public class KvadratObjekt {

	// Objektvariabel

	int sideLengde1 = 3;
	int sideLengde2 = 4;
	int sideLengde3 = 5;

	

	public int areal1 () {
		return sideLengde1 * sideLengde1;
	}

	public int areal2 () {
		return sideLengde2 * sideLengde2;
	}

	public int areal3 () {
		return sideLengde3 * sideLengde3;
	}

	public void utskrift1() {
		for (int i = 0; i < sideLengde1; i++) {
			for (int ii = 0; ii < sideLengde1; ii++) 
				System.out.print("* ");
			System.out.println();
		}
	}
	public void utskrift2 () {
		for (int i = 0; i < sideLengde2; i++) {
			for (int ii = 0; ii < sideLengde2; ii++)
				System.out.print("* ");
			System.out.println();
		}
	}

	public void utskrift3 () {
		for (int i = 0; i < sideLengde2; i++) {
			for (int ii = 0; ii < sideLengde2; ii++)
				System.out.print("* ");
			System.out.println();
		}
	}
}