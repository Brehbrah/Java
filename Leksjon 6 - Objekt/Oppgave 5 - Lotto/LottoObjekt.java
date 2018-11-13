import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class LottoObjekt {

	int [] tabellTall = new int [7];

	// klassens konstruktør 

	public LottoObjekt () {
		kalleOppMetode();
	}

	// kaller opp metoden
	public void kalleOppMetode () {
		for (int i = 0; i < tabellTall.length; i++) {
			tabellTall [i] = (int) (Math.random() * 34 + 1);	
		}
		Arrays.sort(tabellTall);
		System.out.println(tabellTall);
	}

	// toString er viktig for å genere tabeller [til 7 taller] pga. tabellTall 
	// hvis ikke, så kommer det noe lignende [I@6d06d69c
	public String toString () {
		return Arrays.toString(tabellTall);
	}

	public boolean sammeLigne (LottoObjekt andreTabell) {
		return Arrays.equals(tabellTall, andreTabell.tabellTall);
	}
}