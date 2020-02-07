package naloge01_15;

public class Naloga09 {

	public static void main(String[] args)  {

		int steviloVrstic = (int) (Math.random()*15+3);

		for(int i = steviloVrstic; i > 0; i--) {
			
			for(int j = 0; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int zvezdice = 1; zvezdice <= i;zvezdice++ ) {
				System.out.print("* ");
			}

			System.out.println("");

		}


//		for(int i = 0; i < steviloVrstic; i ++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//
//		}	

	}

}
