package bonusNaloge;

import java.util.Scanner;

public class Tree {

	public static void main(String[] args) throws InterruptedException  {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Visina trikoitnika?");
		int visina = sc.nextInt() - 1;		
		
		jelka(visina);
	
		sc.close();

	}	
	
	public static void jelka(int visina) throws InterruptedException {
		
		System.out.println("Visina trikoitnika?");
		
		for (int i = 0; i <= visina; i++) {
			
			//visina -> 0 odmik *
			for (int j = visina; j > i; j--) {
				System.out.print(" ");
			}
			
			//Trikotnik /|
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			//Trikotnik |\
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			//newLine
			Thread.sleep(100);			
			System.out.println("");
			
		}		
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < visina-1; j++) {
				System.out.print(" ");					
			}
				
			System.out.println("***");
			Thread.sleep(120);	

		}
		
	}

}