import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class Vare {

	double mva = 25.0;
	
	int nr;
	String navn;
	double pris;
	int antall;

	public Vare (int nr, String navn, double pris, int anall) {
		this.nr = nr;
		this.pris = pris;
		this.navn = navn;
		this. antall = antall;
	}

	public Vare (int nr, String navn, double pris) {
		this.nr = nr;
		this.navn = navn;
		this.pris = pris;
		this.antall = 0;
	}

	public Vare (int nr, String navn) {
		this(nr, navn, 0, 0);
	}

	public int prisVare () {
		return pris * navn;
	}
}