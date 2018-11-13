import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class OmkretsBeregning {
	
	public static void main(String[] args){
		
		String breddeTxt = showInputDialog("+----------------+" + "\n" +
								" |                      |" + " høyde" + "\n" +
								"+----------------+" + "\n" + "       bredde" + "\n" +
								"Angi bredden til rektangelen:");
		int bredde = parseInt(breddeTxt);

		String lengdeTxt = showInputDialog("+----------------+" + "\n" +
								" |                      |" + "\n" +
								"+----------------+" + "\n" +
								"Angi bredden til lengden:");
		int lengde = parseInt(lengdeTxt);

		int omkrets = lengde + lengde + bredde + bredde;

		showMessageDialog(null, "Omrektsen: " + omkrets + "\n" + "Bredde: " + bredde + "\n" +
								"Lengden: " + lengde);
	}	
}