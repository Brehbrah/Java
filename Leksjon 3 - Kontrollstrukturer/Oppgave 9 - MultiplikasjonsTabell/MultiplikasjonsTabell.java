import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class MultiplikasjonsTabell {

	public static void main(String[] args){
		
	int x = 0;
	int y = 0;
		
	for(x=1; x <=10; x++) {
      for (y=1; y <=10; y++) {
        out.print(x*y + " ");
      }
      out.println();
    }
  }
}


