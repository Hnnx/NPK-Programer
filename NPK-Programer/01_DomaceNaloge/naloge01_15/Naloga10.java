package naloge01_15;
import java.text.DecimalFormat;

public class Naloga10 {

	public static void main(String[] args) {

		DecimalFormat brezNule = new DecimalFormat("#");

		String vnos = args[0];

		double steviloA = 0;
		double steviloT = 0;

		char[] xToArray = vnos.toCharArray();

		for (char c : xToArray) {
			if(c == 'a') steviloA++;		
			if(c == 't') steviloT++;
		}

		double procentiA = (steviloA * 100) / vnos.length();
		double procentiT = (steviloT * 100) / vnos.length();

		System.out.println("Crka a se pojavi " + steviloA+" krat ("+brezNule.format(procentiA)+" %)\nCrka t se pojavi " + steviloT+" krat ("+brezNule.format(procentiT)+" %)");

	}

}
