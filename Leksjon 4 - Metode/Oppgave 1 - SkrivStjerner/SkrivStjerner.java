import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class SkrivStjerner {
	
	public static void main(String[] args){

		stjerneTegn(2);
		stjerneTegn(4);
		stjerneTegn(8);	

		sjekke(10);
	}	

	public static void stjerneTegn(int antall) {
	for (int i=1; i<=antall; i++) 
			System.out.print ("*");
		System.out.println();
	}
	
	public static boolean sjekke(int a, boolean sant) {
		boolean sjekk = sant;
		int tall = a;
		if (5 < a) {
			System.out.println("Det er sant!");
		} else {
			System.out.println("Det er falsk!");
		}
		return sjekk;
	}
}

