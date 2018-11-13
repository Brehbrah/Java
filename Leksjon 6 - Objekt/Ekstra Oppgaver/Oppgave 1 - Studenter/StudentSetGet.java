import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;


public class StudentSetGet {

	    //  Oppgave e - Sett aksessmodifikatoren private på objektvariabelen studNr (gjerne 
		//	på alle objektvariablene). Skriv inn nødvendige set- og get-metoder i 
		//	Student-klassen, og gjør tilhørende endringer i StudentTest-klassen for 
		//	å kunne kjøre dette programmet nå. 

		private int nyStudNr;
  		private String nyFornavn;
  		private String nyEtternavn;
		private int nyFødselsår;
  		private String nyKjønn;

  		public StudentSetGet (int studNr, String fornavn, String etternavn, int fødselsår, String kjønn) {
  			nyStudNr = studNr;
  			nyFornavn = fornavn;
  			nyEtternavn = etternavn;
  			nyFødselsår = fødselsår;
  			nyKjønn = kjønn;
  		}

		public int getStudNr() {
			return nyStudNr;
		}

		public void setStudNr(int studNr) {
			nyStudNr = studNr;
		}

		public String getNyFornavn() {
			return nyFornavn;
		}

		public void setNyFornavn (String fornavn) {
			nyFornavn = fornavn;
		}

		public String getNyEtternavn() {
			return nyEtternavn;
		}

		public void setNyEtternavn(String etternavn) {
			nyEtternavn = etternavn;
		}

		public int getNyFødselsår() {
			return nyFødselsår;
		}

		public void setNyFødselsår(int født) {
			nyFødselsår = født;
		}

		public String getNyKjønn() {
			return nyKjønn;
		}

		public void setNyKjønn(String kjønn) {
			nyKjønn = kjønn;
		}
}