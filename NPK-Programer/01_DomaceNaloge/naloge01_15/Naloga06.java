package naloge01_15;
public class Naloga06 {
	public static void main(String[] args) {

		String vneseniNiz = args[0];

		char nakljucnaCrka = vrniNakljucno(vneseniNiz);
		char drugaCrka = ' ';
		char predZadnjaCrka = ' ';

		if(vneseniNiz.length() > 2) 
			predZadnjaCrka = vrniPredzadnjo(vneseniNiz);
		else {
			System.out.println("Niz ima manj kot 2 crke");
			System.exit(0);
		}

		if(vneseniNiz.length() > 2) 
			drugaCrka = vrniDrugo(vneseniNiz);

		else 
			System.out.println("Niz ima manj kot 2 crke");

		System.out.println("Vneseni niz: "+vneseniNiz);
		System.out.println("Nakljucna crka: " + nakljucnaCrka);
		System.out.println("Druga crka: " + drugaCrka);
		System.out.println("Predzadnja crka: " + predZadnjaCrka);
	}	


	public static char vrniDrugo(String x) {		
		return x.charAt(1);					
	}

	public static char vrniNakljucno(String x) {
		return x.charAt((int) (Math.random()* x.length()));
	}

	public static char vrniPredzadnjo(String x) {
		return x.charAt(x.length()-2);	
	}

}
