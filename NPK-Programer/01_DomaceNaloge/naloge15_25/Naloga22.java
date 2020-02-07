package naloge15_25;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Naloga22 {
	
//Napisi program, ki bo uporabnika vprasal naj vnese poljuben niz. 
//Vneseni niz naj nato zapise v datoteko mojiNizi.txt. 
//Program naj ohrani prej zabelezene nize.
	
	static File datoteka;
 
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		//Vprasaj za ime datoteke		
		System.out.println("Ime datoteke: ");
		String fileName  = sc.nextLine();
		
		//Ce user ne da imena, naj bo fileName blank
		if(fileName.isBlank() || fileName.isEmpty()) {
			fileName = "blank";
		}
		
		
		//Vprasaj za input, shrani v "vnos"
		System.out.println("Vnesi poljuben niz: ");
		String vnos = sc.nextLine();
		System.out.println("1 - Izvozi Word datoteko");
		System.out.println("2 - Izvozi Notepad datoteko");
		System.out.println("3 - Izvozi Wordpad datoteko");
		
		//String da se izognem parsanju, ce uporabnik ne izbere cifre izvozi brez koncnice
		String izbor = sc.nextLine();		
		sc.close();
		
		
		//Extensions
		String txt = ".txt";
		String doc = ".doc";
		String rtf = ".rtf";
		
		//Kreiraj datoteko in concataj koncnico				
		switch (izbor) {
		case "1":
		datoteka = new File(fileName.concat(doc));
			break;
		case "2":
		datoteka = new File(fileName.concat(txt));
			break;
		case "3":
			datoteka = new File(fileName.concat(rtf));
			break;
		default:
			System.out.println("Datoteka je kreirana brez koncnice");
			datoteka = new File(fileName);
			break;
		}
		
		//Boilerplate za kreiranje
		if(!datoteka.exists()) {
			try {
				datoteka.createNewFile();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		
		//Pisanje v datoteko		
		try {
			
			//Ce dodamo parameter TRUE bo file shranjeval inpute
			BufferedWriter pisi = new BufferedWriter( new FileWriter(datoteka,true));
			
			//.write metoda vnasa stuff v file
			pisi.write(vnos);
			
			//newLine se doda, da loci vnose po vrsticah
			pisi.newLine();
			
			pisi.close();		

		} catch (IOException e) {
			System.out.println("Pri vpisovanju v datoteko je prislo do napake");
		}

	}

}
