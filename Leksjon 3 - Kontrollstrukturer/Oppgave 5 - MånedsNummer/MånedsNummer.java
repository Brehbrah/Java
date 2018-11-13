import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class MånedsNummer {

	public static void main(String[] args){
		
		String tallTxt = showInputDialog("Gi månedsnummer (1-12):");
    int mndNr = parseInt(tallTxt);
 
    String ut = "Månedsnummer er ";
 
    switch (mndNr) {
      case 1 : ut += "januar";    break;
      case 2 : ut += "februar";   break;
      case 3 : ut += "mars";      break;
      case 4 : ut += "april";     break;
      case 5 : ut += "mai";       break;
      case 6 : ut += "juni";      break;
      case 7 : ut += "juli";      break;
      case 8 : ut += "august";    break;
      case 9 : ut += "september"; break;
      case 10: ut += "oktober";   break;
      case 11: ut += "november";  break;
      case 12: ut += "desember";  break;
      default: ut += "er ugyldig!";
    }
 
    showMessageDialog(null, ut);
  
	}	
}