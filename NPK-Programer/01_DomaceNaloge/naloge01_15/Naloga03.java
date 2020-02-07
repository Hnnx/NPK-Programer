package naloge01_15;
import java.text.DecimalFormat;

public class Naloga03 {
	static final double PI = 3.141592653589;
	
	public static void main(String[] args) {
		
		DecimalFormat dveDecimalke = new DecimalFormat("0.##");

		double premerKroga = Double.parseDouble(args[0]);
		
		double polmerKroga = premerKroga / 2;
		double obsegKroga = premerKroga * PI;


		double kvadratPolmera = Math.pow(polmerKroga, 2);
		double ploscinaKroga = kvadratPolmera * PI;
		
		

		System.out.println("Premer kroga "+ premerKroga+" ima obseg "+dveDecimalke.format(obsegKroga)+
				"\nNjegova ploscina znasa "+ dveDecimalke.format(ploscinaKroga));

		
		
	}


}

