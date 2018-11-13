import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class MønsterB {

	public static void main(String[] args){
		
		String errorTxt = "Det er ugyldig";
		String input = showInputDialog("Skriv inn tall mellom 1-10:");
		int tall = 0;
		
		boolean ugyldig;
		
		do{
			tall = parseInt(input);
			ugyldig = (tall < 1 || tall > 10);
			if (ugyldig)
				showMessageDialog(null, errorTxt);
		} while (ugyldig);

		  for (int linjeNr = 1; linjeNr <= tall; linjeNr++) {
     		 System.out.println("+");
		  }
 
		    for (int tegnNr = 1; tegnNr <= tall; tegnNr++) {
        		System.out.print("+ ");
		    }
		

	}	
}


		