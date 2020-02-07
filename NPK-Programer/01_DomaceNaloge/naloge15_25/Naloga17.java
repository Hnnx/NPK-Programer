package naloge15_25;
import java.util.Scanner;

public class Naloga17 {
	
	//NEEDS A TRYCATCH for RESPONSE (LINE 25)

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int rdm1 = (int) (Math.random()*5+1);		
		int rdm2 = (int) (Math.random()*5+1);

		String[][] tabela = new String[rdm1][rdm2];
		
		boolean ponovniVpis = true;
		
		while(ponovniVpis) {
			
			polnjeneTabele(tabela);
			izpisTabele(tabela);
			System.out.println("Vpisi \" konec\" za izhod iz programa");
			String response = sc.nextLine();
			
			if( response.equalsIgnoreCase("konec")){
				System.exit(0);
			}
			
		}

 

	}//::>END MAIN

	//	>> METODE <<
	public static void polnjeneTabele(String[][] arr) {

		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print("Vpisi Niz: ");
				arr[i][j] = sc.nextLine();									
			}

			System.out.println("\n  *********** \n");

		}
	}


	public static void izpisTabele(String[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");				
			}
			System.out.println("");			
		}
	}


}//::>END CLASS




