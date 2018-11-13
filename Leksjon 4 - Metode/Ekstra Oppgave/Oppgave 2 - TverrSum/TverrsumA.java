import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class TverrsumA {

	public static void main(String[] args){
		
		String input = showInputDialog("Skriv inn en positivt heltall" + "\n" + "(Eksempel 23)");

		int helTall = parseInt(input); // eks. tallet er 23
		
		/* Alternativ å skrive sånn istedenfor hvis det er ønskelig
		int tallA = parseInt(input) / 10;

		int tallB = parseInt(input) % 10;
		int c = helTall%tallB;
		int d = helTall - (helTall/tallB)*tallB;
		*/ 

		showMessageDialog(null, "Tverrsum for " + helTall + " -> " + førsteTall(helTall) + " + " + andreTall(helTall) + " = " + summen(helTall)); 
	
	}

	public static int førsteTall (int tall) {
		int tall1 = tall/10;
		return tall1;
	}

	public static int andreTall (int tall) {
		int tall2 = tall%10;
		return tall2;
	}

	public static int summen (int heltall) { 
		// og her er nr. 23
		int s1 = heltall/10; // 23/10 = 2,3 runde det av blir 2 som heltall
    	int s2 = heltall%10; // remainder blir 3
    	int sum = s1 + s2; // 2 + 3 = 5
    return sum; //returnere summen som opprinnelig er 23
	}
}