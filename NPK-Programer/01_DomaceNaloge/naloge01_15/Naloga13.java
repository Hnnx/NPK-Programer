package naloge01_15;

public class Naloga13 {
	static int j;

	public static void main(String[] args) {		
		for(int i = 0; i < 14000; i++) {
			if(i % 5 == 0 &&  i % 11 == 0 &&  i % 13 == 0) {
				j++;
				System.out.println(j+") "+i);
			}
		}

	}

}
