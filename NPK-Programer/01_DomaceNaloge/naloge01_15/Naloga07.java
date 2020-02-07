package naloge01_15;

public class Naloga07 {

	public static void main(String[] args) {
		
		String vneseniNiz = args[0];
		String obratniNiz = "";
		
		
		for(int i = vneseniNiz.length()-1; i >=0; i--) 
			obratniNiz += vneseniNiz.charAt(i);
		
		String palindrom  = vneseniNiz.equals(obratniNiz) ? "niz JE palindrom" : "niz NI palindrom";
		
		System.out.println(palindrom);
		

	}

}
