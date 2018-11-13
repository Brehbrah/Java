import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;


public class UtvekslingMynt {

	public static void main(String[] args){
		
		String myntTxt = showInputDialog("Oppgi hvor mange GPB: ");
		int mynt = parseInt(myntTxt);

		double gpb = mynt * 10.91;

		int kroner = (int) (gpb + 0.5);

		int nok20 = kroner/20; 
		int restKr = kroner%20; 

		int nok10 = kroner/10;
		restKr = kroner%10;

		int nok5 = kroner/5;
		restKr = kroner%5;

		int nok1 = kroner/1;
		restKr = kroner%1;

		showMessageDialog(null, "VEKSLING" + "\n"
        + "-------------------------------------" + "\n"
        + "Beløp i GBP: " + mynt + "\n"
        + "Kurs: 1 GBP = " + gpb + " NOK" + "\n"
        + "Beløp i NOK: " + kroner + "\n"
        + "-------------------------------------" + "\n" 
        + "Utbetales ved:" + "\n"
        + nok20 + " stk 20-kr " + "\n"
        + nok10 + " stk 10-kr " + "\n"
        + nok5  + " stk  5-kr " + "\n"
        + nok1  + " stk  1-kr ");


	}	
}