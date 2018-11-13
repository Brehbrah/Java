import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class KlokkeSlett {

	public static void main(String[] args){
		
		String timeTxt = showInputDialog("Skriv inn antall time:");
		int time = parseInt(timeTxt);

		String minuttTxt = showInputDialog("Skriv inn antall minutt:");
		int minutt = parseInt(minuttTxt);

		String sekundTxt = showInputDialog("Skriv inn antall sekund");
		int sekund = parseInt(sekundTxt);

		int sumMidnatt = (time*3600) + (minutt*60) + sekund;

		showMessageDialog(null, "Klokken siden midnatt = " + sumMidnatt);

	}	
}