import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class FirekantA {
	
	public static void main(String[] args){

		int bredde = 8;
		int høyde = 3;
   
    	rektangel(bredde, høyde);
	}	

	public static void rektangel (int linjelengde, int antallLinjer) {
		for(int i = 1; i<=antallLinjer; i++) 
			antallRunder(linjelengde);
	}

	public static void antallRunder(int antall) {
	for (int i=1; i<=antall; i++) 
			System.out.print ("*");
		System.out.println();
	}
}

