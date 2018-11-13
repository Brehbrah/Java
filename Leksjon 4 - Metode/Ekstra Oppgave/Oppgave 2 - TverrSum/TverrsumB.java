import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class TverrsumB {

public static void main(String[] args) {


  int totalsum = 0;    
  int tall = trekkTall(10,99); 

  for (int tallNr=1; tallNr<=tall; tallNr++) {
    totalsum += tverrsum(tall);
  }

  // Snitt beregnet, og avrundet til nærmeste heltall vha Math.round
  int snitt = (int)( round(totalsum/tall)); 
  
  // Beregner og skriver ut gjennomsnitt av alle tverrsummene
  showMessageDialog(null, "Snitt tverrsum: " + snitt); 
  }

  private static int tverrsum(int heltall) {
    int s1 = heltall/10;
    int s2 = heltall%10;
    int sum = s1 + s2;
    return sum;
  }

  // Metode for å trekke et tilfeldig heltall i området min - max    
  private static int trekkTall(int min, int max) {
    return min + (int)(random()*(max+min) + 1);
  }
}