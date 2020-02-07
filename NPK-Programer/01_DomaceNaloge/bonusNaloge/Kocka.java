package bonusNaloge;

import java.util.Scanner;

public class Kocka {

	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);

		String response = "";

		while(true) {

			System.out.println("Pritisni \"enter\" za met kocke");

			try {
				response = sc.nextLine();				
				if(response.isBlank() || response.isEmpty()) 
					vrziKocko();						
				else {
					sc.close();
					break;
				}			


			} catch (Exception e) {
				System.out.println("Vnesi veljaven odgovor (Da/Ne)");
			}

		}
	}

	public static int getRDM() {
		return (int)(Math.random()*6+1);
	}

	public static void vrziKocko() throws InterruptedException {

		System.out.print("Kocka pada");
		Thread.sleep(200);
		System.out.print(".");
		Thread.sleep(200);
		System.out.print(".");
		Thread.sleep(200);
		System.out.print(".");
		Thread.sleep(200);
		System.out.print(".");
		System.out.println("\n");

		//"animacija"
		showKocka(getRDM());
		Thread.sleep(150);
		showKocka(getRDM());
		Thread.sleep(200);
		showKocka(getRDM());
		Thread.sleep(150);
		showKocka(getRDM());
		Thread.sleep(100);

		int x = getRDM();		
		showKocka(x);
		System.out.println("kocka je padla na: " + x);
		System.out.println();
	}

	public static void showKocka(int x) {

		switch (x) {
		case 1:
			System.out.println("+-------+");
			System.out.println("|       |");
			System.out.println("|   *   |");
			System.out.println("|       |");
			System.out.println("+-------+");			
			break;
		case 2:
			System.out.println("+-------+");
			System.out.println("| *     |");
			System.out.println("|       |");
			System.out.println("|     * |");
			System.out.println("+-------+");			
			break;
		case 3:
			System.out.println("+-------+");
			System.out.println("| *     |");
			System.out.println("|   *   |");
			System.out.println("|     * |");
			System.out.println("+-------+");	
			break;
		case 4:
			System.out.println("+-------+");
			System.out.println("| *   * |");
			System.out.println("|       |");
			System.out.println("| *   * |");
			System.out.println("+-------+");	
			break;
		case 5:
			System.out.println("+-------+");
			System.out.println("| *   * |");
			System.out.println("|   *   |");
			System.out.println("| *   * |");
			System.out.println("+-------+");	
			break;
		case 6:
			System.out.println("+-------+");
			System.out.println("| *   * |");
			System.out.println("| *   * |");
			System.out.println("| *   * |");
			System.out.println("+-------+");	
			break;
		default:
			System.out.println("Error");
			break;
		}
	}




}
