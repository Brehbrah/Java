import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class KontoRun {

	public static void main(String[] args){
		

		// 100 og 3500 blir brukt til method overloading
		KontoObjekt k1 = new KontoObjekt(100, 3000);
		KontoObjekt k2 = new KontoObjekt(200, 4000);
		KontoObjekt k3 = new KontoObjekt(300, 5000);

		String txtUtK1 = "Konto: " + k1.getKontoNummer() + "\n" + "Saldo: " + k1.getSaldo();
		String txtUtK2 = "Konto: " + k2.getKontoNummer() + "\n" + "Saldo: " + k2.getSaldo();
		String txtUtK3 = "Konto: " + k3.getKontoNummer() + "\n" + "Saldo: " + k3.getSaldo();
		int totalSum = k1.getSaldo() + k2.getSaldo() + k3.getSaldo();
		String saldoUt = "Sum Saldo: " + totalSum;

		System.out.println(txtUtK1);
		out.println();
		System.out.println(txtUtK2);
		out.println();
		System.out.println(txtUtK3);
		out.println();
		System.out.println(saldoUt);

	}	
}