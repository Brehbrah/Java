import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class Trekant {
	
	public static void main(String[] args){

		int antallTrekant = 4;
   
    	trekant(antallTrekant);

	}	

	public static void trekant (int antallLinjer) {
		for(int i = 1; i<=antallLinjer; i++) 
			antallRunder(i);
	}

	public static void antallRunder(int antall) {
	for (int i=1; i<=antall; i++) 
			System.out.print ("*");
		System.out.println();
	}
}

