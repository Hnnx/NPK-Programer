package naloge01_15;

public class Naloga08 {

	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);


		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(" * ");						
			}
			System.out.println("");		
		}

	}

}
