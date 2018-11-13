import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.*;

public class Rom {

	private int romNr;
	String typeRom;
	int antallPlasser;
	String utstyr;

	public Rom (int startRomNr, String startTypeRom, int startAntallPlasser, String startUtstyr) {
		this.romNr = startRomNr;
		this.typeRom = startTypeRom;
		this.antallPlasser = startAntallPlasser;
		this.utstyr = startUtstyr;
	}

	public Rom (int overloadRomNr) {
		this.romNr = (overloadRomNr);
	}	

	public int getRomNr() {
		return romNr;
	}

	public void setRomNr(int romNr) {
		romNr = romNr;
	}

	public String getTypeRom() {
		return typeRom;
	}

	public void setTypeRom(String typeRom) {
		typeRom = typeRom;
	}

	public int getAntallPlasser() {
		return antallPlasser;
	}

	public void setAntallPlasser(int antall) {
		antallPlasser = antall;	
	}
	
	public String getUtstyr() {
		return utstyr;
	}

	public void setUtstyr(char utstyr) {
		utstyr = utstyr;
	}

	public String toStringMetode() {
		return romNr + ": " + typeRom  + ", " + antallPlasser + ", " + utstyr;
	}

	public void romTab() {

		int [] romTab = new int[101];		
		for (int i = 0; i < romTab.length; i++) {
			romTab[i] = i;
			if (49 < romTab[i] && romTab[i] <= 100)
				System.out.println(romTab[i]);
		}

	}

	 

}

