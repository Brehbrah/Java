import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class OppgaveA {

	public static void main(String[] args){
		
		
        int [] tabellA = new int [9];
        int [] tabellB = new int [9];


        for(int a = 0; a < tabellA.length; a++) {
            tabellA [a] = (int)(Math.random() * 5);
          
        }

        for (int b = 0; b < tabellB.length; b++) {
        	tabellB [b] = (int) (Math.random() * 5);
        	
        }

         System.out.print(Arrays.toString(tabellA) + " ");
         System.out.println();
         System.out.print(Arrays.toString(tabellB) + " ");

	}	
}