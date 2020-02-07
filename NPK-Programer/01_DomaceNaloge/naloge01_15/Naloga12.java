package naloge01_15;

public class Naloga12 {

	public static void main(String[] args) {

		String input = args[0];
		

		if(input.length() != 6) {
			System.out.println("Stevilo ne ustreza pogojem");
		}
		else {			
			try { 
				int preveriVrednost = Integer.parseInt(input);

			}
			catch (Exception e){
				System.out.println("ni stevilo");
				System.exit(0);

			}

			System.out.println("Vneseno stevilo ("+ input+") razdelimo na dva dela \n"+ input.substring(0,3) +" in "+ input.substring(3,6));
			System.out.println("Rezultat je:");
			rez(input);	
		}




	}	


	public static void rez(String vnos) {

		int prviDel = Integer.parseInt(vnos.substring(0,3));
		int drugiDel = Integer.parseInt(vnos.substring(3,6));
		System.out.print(prviDel+drugiDel);

	}

}
