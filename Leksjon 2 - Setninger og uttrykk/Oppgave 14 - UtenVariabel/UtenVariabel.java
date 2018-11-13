import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class UtenVariabel {

	public static void main(String[] args){
		  // Gir variablene "tilfeldige" startverdier
    // (kan evt. endres til å lese inn fra bruker)
    int x = 25;
    int y = 7;
    int z = 12;
 
    String ut = "Før: x = " + x + ", y = " + y + ", z = " + z + "\n";
 
    // x=25, y=7, z=12
 
    z = z + y;   // x=25, y= 7, z=19
    y = z - y;   // x=25, y=12, z=19
    z = z - y;   // x=25, y=12, z= 7
 
    // Nå har y og z byttet verdier
 
    x = x + y;   // x=37, y=12, z= 7
    y = x - y;   // x=37, y=25, z= 7
    x = x - y;   // x=12, y=25, z= 7
 
    ut += "Etter: x = " + x + ", y = " + y + ", z = " + z;
    showMessageDialog(null, ut);
	}	
}