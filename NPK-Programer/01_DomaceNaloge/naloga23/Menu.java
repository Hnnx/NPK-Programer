package naloga23;

import java.io.File;
import java.util.Scanner;

public class Menu extends FileHandler{
	Scanner sc = new Scanner(System.in);	
	
	// Deklariran file obj + name + ukaz za switch
	String fileName = "";	
	File st;
	int ukaz;
	
	// Vnos imena datoteke(ce je ni, jo kreira z ukazom "8")
	public File getFile() {
		System.out.println("Vpisi ime datoteke:");
		fileName = sc.nextLine();
		st = new File(fileName);
		return st;
	}
	
	// Izpisi Menu in metodo "stikalo" za izbor 
	public void showMenu() {
		System.out.println("1 - File Info");
		System.out.println("2 - Beri");
		System.out.println("3 - Pisi + Dodaj vrstico");
		System.out.println("4 - Pisi + Povozi vrstice ");		
		System.out.println("5 - Odstrani datoteko");
		System.out.println("6 - Domaca Naloga");
		System.out.println("7 - Ustvari file");
		System.out.println("8 - Izberi drugo datoteko");
		System.out.println("9 - IZHOD");
		System.out.println("Izbira:");
		ukaz = Integer.parseInt(sc.nextLine());
		stikalo();		
	}

	// klice metod iz File Handlerja ter metode ta izhod
	public void stikalo() {
		switch (ukaz) {
		case 1:
			fileInfo(st);
			System.out.println();
			showMenu();		
			break;
		case 2:
			readFile(st);
			izhod();
			break;
		case 3:
			System.out.println("Vnos v datoteko:");
			String novaVrsticaDodaj = sc.nextLine();
			writeInFile(st, novaVrsticaDodaj, true);
			showMenu();
			break;
		case 4:
			System.out.println("Vnos v datoteko:");
			String novaVrsticaPovozi = sc.nextLine();
			writeInFile(st, novaVrsticaPovozi, false);
			izhod();
			break;
		case 5:
			removeFile(st);
			izhod();
			break;
		case 6:
			writeInFile(st, getSum(st), true);
			izhod();
			break;
		case 7:
			createFile(st);
			System.out.println("Datoteka " + st+" je bila ustvarjena\n");
			showMenu();
			break;
		case 8:
			getFile();		
			showMenu();
			break;
		case 9:
			System.out.println("Progam se bo zaustavil");
			System.exit(0);
			break;
		default:
			System.out.println("Vnesi stevilo med 1 in 9");
			break;
		}

	}

	// funckija za izhod iz programa, da n
	public void izhod() {
		System.out.println("\nIzhod? Ja / Ne");
		String response = sc.nextLine();
		
		if( response.equalsIgnoreCase("ja") || response.equalsIgnoreCase("j")) {
			System.out.println("Progam se bo zaustavil");
			System.exit(0);
		}
		else {
			showMenu();				
		}
		
	}
	
	
}
