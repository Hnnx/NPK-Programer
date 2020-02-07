package naloge01_15;

import java.util.Calendar;
import java.util.Scanner;

public class Naloga04 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();		
		int currentYear = cal.get(Calendar.YEAR);

		Scanner sc = new Scanner(System.in);

		int letnicaRojstva = 0;
		boolean preveriLetnico = true;

		while(preveriLetnico) {
			System.out.println("Vpisi letnico:");
			letnicaRojstva = Integer.parseInt(sc.nextLine());

			if(  letnicaRojstva > 1900 && letnicaRojstva < currentYear+1)  {
				break;
			}
			System.out.println("Neveljaven vnos, vnesi letnico med 1900 in "+ currentYear);
		}
		
		sc.close();




		int starost = currentYear - letnicaRojstva;
		int manjkajocaLeta = 18 - starost;

		if(starost >= 18)
			System.out.println("Lahko se udelezite volitev.");
		else if(manjkajocaLeta == 1) {
			System.out.println("Zal ste premladi.\nVolitev se lahko udelezite cez "+manjkajocaLeta +" leto.");
			
		}
		
		else if(manjkajocaLeta == 2) {
			System.out.println("Zal ste premladi.\nVolitev se lahko udelezite cez "+manjkajocaLeta +" leti.");
		}
		else if(manjkajocaLeta == 3 || manjkajocaLeta == 4) {
			System.out.println("Zal ste premladi.\nVolitev se lahko udelezite cez "+manjkajocaLeta +" leta.");
		}
		else {
			System.out.println("Zal ste premladi.\nVolitev se lahko udelezite cez "+manjkajocaLeta +" let.");
		}





	}

}