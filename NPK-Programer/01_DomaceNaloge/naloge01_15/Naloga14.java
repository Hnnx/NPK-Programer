package naloge01_15;

public class Naloga14 {

	public static void main(String[] args) {



		int[][] twoDimensional = new int[14][9];

		//Izpis Tabele ::>
		System.out.println("Izpis tabele:\n");
		for (int i = 0; i < twoDimensional.length; i++) {
			for (int j = 0; j < twoDimensional[i].length; j++) {
				twoDimensional[i][j] = (int) (Math.random()*70+1);
				System.out.print(twoDimensional[i][j]+" ");
			}
			System.out.println("");
		}

		System.out.println("");
		//Izpis tabele / 7 ::>
		System.out.println("Izpis stevil deljivih s 7:\n");
		for(int i = 0; i < twoDimensional.length; i++) {
			for(int j = 0; j < twoDimensional[i].length; j++) {
				if(twoDimensional[i][j] % 7 == 0){
					System.out.println(twoDimensional[i][j] +" je deljivo s 7");
				}
			} 
		}

		int temp = 0;

		System.out.println("");
		//Sestevek tabele ::>
		System.out.println("Sestevek tabele:\n");

		for(int i = 0; i < twoDimensional.length;i++) {
			for(int j = 0; j < twoDimensional[i].length;j++) {
				temp += twoDimensional[i][j];			}
		}
		System.out.println(">> "+ temp);


	}

}
