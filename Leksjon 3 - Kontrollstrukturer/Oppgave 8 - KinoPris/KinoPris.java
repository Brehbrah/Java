import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;



public class KinoPris {

	public static void main(String[] args){
		
		String alderInput = showInputDialog("Hva er alderen din mellom 10-80?");
		int alder = parseInt(alderInput);
		
		int minAlder = 10;
		int maxAlder = 80;
		
		if (alder < minAlder || alder > maxAlder)
			showMessageDialog(null, "Ugyldig alder!");
		else { // Dette er for å bekrefte du kan gå videre. Uten {}, så vil spørsmålet bare fortsette
			showMessageDialog(null, "Velkommen!");
		
		String prisInput = showInputDialog("Hvor mye penger har du? Prisen koster mellom 10-100 kr");
		int pris = parseInt(prisInput);

		int minPris = 10;
		int maxPris = 100; 

		String txtUt = "";

		if (pris < minPris ||  pris > maxPris)
			txtUt += "Du har ikke råd";
		else 
			txtUt += "Velkommen til kino";

		showMessageDialog(null, txtUt);
		}	
	}	
}