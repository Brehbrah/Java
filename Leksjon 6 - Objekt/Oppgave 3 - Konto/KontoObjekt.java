import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;

public class KontoObjekt {

	private int kontoNummer;
	private int saldo;

	// Klassens konstruktør - skal brukes til method overloading
	public KontoObjekt(int startKontoNr, int startSaldo) {
	    kontoNummer = startKontoNr;
	    saldo = startSaldo;
  	}

  	// Her brukes det set og get metode

	public int getKontoNummer() {
		return kontoNummer;
	}

	public void setKontoNummer(int nyKonto) {
		kontoNummer = nyKonto;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int nySaldo) {
		saldo = nySaldo;
	}

}