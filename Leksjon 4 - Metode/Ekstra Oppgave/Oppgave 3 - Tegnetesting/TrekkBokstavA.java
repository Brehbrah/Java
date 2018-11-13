import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class TrekkBokstavA {

	public static void main(String[] args){

	int tall = 0;	
	int antallOrd = ordRandom(65,90);

	for (int i = 1; i <= antallOrd; i++){
		
	} 

	String txtUt = "Tilfeldige Bokstav: " + trekkBokstav(antallOrd);

  }

	// Metode for å trekke et tilfeldig heltall i området (min,max)
	private static int ordRandom(int min, int max) {
	  return min + (int)( random()*(max-min));
	}

	// Metode for å trekke en tilfeldig stor engelsk bokstav (A-Z)
  	private static char trekkBokstav() {
    return (char)ordRandom(65,90);
  }
}

  