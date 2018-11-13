import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class LottoTest {

	public static void main(String[] args){

		LottoObjekt randomTabell1 = new LottoObjekt();
		LottoObjekt randomTabell2 = new LottoObjekt();

		if (randomTabell2.sammeLigne(randomTabell1));

		String txtUt = randomTabell1 + "\n" + randomTabell2;

		System.out.println(txtUt);
	}	
}