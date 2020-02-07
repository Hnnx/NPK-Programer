package naloge01_15;

public class Naloga11 {

	public static void main(String[] args) {

		int mesec = 0;

		while(true) {
			try {
				mesec = Integer.parseInt(args[0]);
				break;
			}
			catch (Exception e) {
				System.out.println("Vnesena vrednost ni stevilo.");
				break;
				}
		}

		
		switch (mesec) {
		case 1:
			System.out.println("Januar");
			break;
		case 2:
			System.out.println("Februar");
			break;
		case 3:
			System.out.println("Marec");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("Maj");
			break;
		case 6:
			System.out.println("Junij");
			break;
		case 7:
			System.out.println("Julij");
			break;
		case 8:
			System.out.println("Avgust");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("Oktober");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("\"Great Scott!\"");
			break;
		}

	}

}
