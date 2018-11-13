import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class RandomTall {

	public static void main(String[] args){
		
		int t = (int) (Math.random()* 26 + 64);
		System.out.println(t);

		randomTall(26,64);

	}	

	public static int randomTall(int før, int etter) {
		int t = 0;
		t = ((int) (Math.random()*etter + før)-før) + før;
		System.out.println(t);
		return t;
	}
}