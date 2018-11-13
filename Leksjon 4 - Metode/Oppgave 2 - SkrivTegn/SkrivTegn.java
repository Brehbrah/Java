import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class SkrivTegn {

	public static void main(String[] args){
		
		int nivå = 3;
	    // Lag innlesing fra brukeren selv!
    skrivPil(100);
  }
 
  public static void skrivPil(int nivåLinje) {
    // Først lengre og lengre linjer...
    for (int linje=1; linje<=nivåLinje; linje++)
      skrivTegn('>', 2*linje-1);
 
    // Deretter kortere og kortere linjer igjen...
    for (int linje=nivåLinje-1; linje>=1; linje--)
      skrivTegn('>', 2*linje-1);
  }
 
  public static void skrivTegn(char t, int antall) {
    for (int i=1; i<=antall; i++)
      out.print(t);
    out.println();
	}
}