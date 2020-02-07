package naloge01_15;
public class Naloga05 {

	public static void main(String[] args) {
		
		//Opcija 1

		String vneseniNiz = args[0];

		char[] nizVArray = vneseniNiz.toCharArray();		

		System.out.println("Vneseni niz: " + vneseniNiz);

		for (int i = 0; i < nizVArray.length; i += 2) {

			System.out.print(nizVArray[i]);

		}
		
//		Opcija 2
		
		String zem = args[0];		
		System.out.println("\nOpcija 2:");
		
		for(int i = 0; i < zem.length(); i+=2) {
			
			System.out.print(zem.charAt(i));
		}

	}

}
