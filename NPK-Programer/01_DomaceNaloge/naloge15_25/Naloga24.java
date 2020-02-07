package naloge15_25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Naloga24 {

	public static void main(String[] args) throws IOException{		
		

		File f = new File("stevila.txt");
		

		try {			
			BufferedReader beri = new BufferedReader(new FileReader(f));
			String vrstica = "";
			int sumOfAll = 0;
			int numsAmount = 0;

			while( (vrstica = beri.readLine() ) != null  ) {

				String[] strStevilaVVrstici = vrstica.split(";");
				int[] intStevilaVVrstici = new int[strStevilaVVrstici.length];

				for (int i = 0; i < strStevilaVVrstici.length; i++) {
					intStevilaVVrstici[i] = Integer.parseInt(strStevilaVVrstici[i]);
					sumOfAll += intStevilaVVrstici[i];					
				}
				numsAmount += intStevilaVVrstici.length;


				//Deljiva
				deljivaStevila(intStevilaVVrstici);

				//Prastevilo
				prastevilo(intStevilaVVrstici);
				
				//SestejVrstico
				sestejVrstico(intStevilaVVrstici);

			}

			int avg = sumOfAll / numsAmount;
			System.out.println("Povprecje stevil v datoteki: " + avg);


		} catch (IOException e) {
			System.out.println("Napaka: "+ e.toString());
		}
		
	
	}


	// DELJIVA >>
	public static void deljivaStevila(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if(jeDeljivo(arr[i])) {
				zapisiDeljiva(arr[i]);
			}
		}
	}

	public static boolean jeDeljivo(int i) {
		if(i % 3 == 0 &&  i % 5 == 0 && i % 11 == 0) {
			return true;
		}
		return false;
	}

	public static void zapisiDeljiva(int i) {

		File del = new File("deljiva.txt");


		if (! del.exists() ) {
			try {
				del.createNewFile();
			} catch (IOException e) {
				System.out.println("Napaka: "+e.toString());
			}
		}

		try {
			BufferedWriter pisi = new BufferedWriter(new FileWriter(del));
			pisi.write(i + " ");
			pisi.close();

		} catch (IOException e) {
			System.out.println("Napaka: " + e.toString());
		}		


	}



	//Prastevilo >>
	public static boolean jePrastevilo(int st) {

		for (int i = 2; i < st / 2; i++) {
			if(st % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void zapisiPrastevilo(int i) {
		
		File p = new File("prastevila.txt");		
		
		if(! p.exists()) {
			try {
				p.createNewFile();
			} catch (IOException e) {
				System.out.println("Napaka: "+e.toString());
			}
		}
		
		try {
			BufferedWriter pisi = new BufferedWriter(new FileWriter(p,true));
			
			pisi.write(i+" ");
			pisi.close();
		} catch (IOException e) {
			System.out.println("Napaka: " + e.toString());
		}
	}

	public static void prastevilo(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if(jePrastevilo(arr[i])) {
				zapisiPrastevilo(arr[i]);
			}
		}
		
		
		
	}

	
	//sestevek Vrstic >>
	
	public static void sestejVrstico(int[] arr) {
		
		int sum = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];			
		}
		
		//Podpicje
		boolean narediPodpicje = true;
		
		File sv = new File("sestevekVrstic.txt");
		
		if( ! sv.exists() ) {
			narediPodpicje = false;		
		}
		
		
		try {			
			sv.createNewFile();
		} catch (IOException e) {
			System.out.println("Napaka: " + e.toString());
		}
		
		
		try {
			BufferedWriter pisi = new BufferedWriter(new FileWriter(sv,true));
			
			if(narediPodpicje) pisi.write(";");
			
			pisi.write(sum + "");
			pisi.close();
			
		} catch (IOException e) {
			System.out.println("napaka: "+ e.toString());
		}
		
		
	}
	
	
}//END CLASS