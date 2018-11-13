import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;

public class NavnObjekt {

	String fornavn;
	String etternavn;

	// Klassens Constructor 
	public NavnObjekt (String nyFornavn, String nyEtternavn) {
		fornavn = nyFornavn;
		etternavn = nyEtternavn;
	}

	public String getFornavn () {
		return fornavn;
	}

	public void setFornavn(String startFornavn) {
		fornavn = startFornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String startEtternavn ) {
		etternavn = startEtternavn;
	}

	public String toStringMetode() {
		return fornavn + " " + etternavn;
	}
}