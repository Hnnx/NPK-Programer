package naloga23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {

	public static void fileInfo(File f) {
		System.out.println("FileName: "+ f.getName());
		System.out.println("Read: "+f.canRead());
		System.out.println("Write: "+f.canWrite());		
		System.out.println("Location: "+f.getAbsolutePath());
		System.out.println("Size: "+f.length()+" bytes");
	}

	public static void removeFile(File f) {
		f.delete();
		System.out.println("File " + f.getName()+" was deleted");
	}

	public static void createFile(File f) {

		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("Prislo je do napake:");
				System.out.println(e.toString() +" "+ e.getMessage());
			}
		}
	}

	public static void createFile(String f) {

		File x = new File(f+".txt");

		if(!x.exists()) {
			try {
				x.createNewFile();
			} catch (IOException e) {
				System.out.println("Prislo je do napake:");
				System.out.println(e.toString() +" "+ e.getMessage());

			}
		}
	}

	public static void writeInFile(File f,String text,boolean repeat) {

		try {
			BufferedWriter vpis = new BufferedWriter(new FileWriter(f,repeat));

			vpis.write(text);

			vpis.newLine();

			vpis.close();


		} catch (IOException e) {
			System.out.println("Pri vpisovanju je prislo do napake");
		}

	}

	public static void writeInFile(File f,int num,boolean repeat) {

		try {
			BufferedWriter vpis = new BufferedWriter(new FileWriter(f,repeat));

			vpis.write(num);

			vpis.newLine();

			vpis.close();


		} catch (IOException e) {
			System.out.println("Pri vpisovanju je prislo do napake");
		}

	}

	public static void readFile(String f) {
		try {
			BufferedReader read = new BufferedReader(new FileReader(f));

			String line = "";	
			int lineCounter = 1;

			while( (line = read.readLine()) != null) {
				System.out.println(lineCounter+"\t "+line);		
				lineCounter++;
			}	

			read.close();

		} catch (IOException e) {
			System.out.println("pri branju datoteke je prislo do napake");
		}	


	}

	public static void readFile(File f) {
		try {
			BufferedReader read = new BufferedReader(new FileReader(f));

			String line = "";	
			int lineCounter = 1;

			while( (line = read.readLine()) != null) {
				System.out.println(lineCounter+"\t "+line);		
				lineCounter++;
			}	

			read.close();

		} catch (IOException e) {
			System.out.println("Pri branju datoteke je prislo do napake");
		}	


	}


	public static void totalWords(File f) {		

		int wordCount = 0;

		try {

			Scanner sc = new Scanner(f);	

			while( sc.hasNext()  ) {		
				sc.next();
				wordCount++;
			}

			System.out.println("V datoteki je "+ wordCount +" besed");

			sc.close();			


		} catch (Exception e) {
			System.out.println("Pri branju datoteke je prislo do napake");
		}

	}
	
	
	
	public static String getSum(File f) {

		String vrsta = "";

		Double sum = 0.0;

		try {

			BufferedReader beri = new BufferedReader(new FileReader(f));

			while ( (vrsta = beri.readLine()) != null  ) {
				Double parsedNums = Double.parseDouble(vrsta);				
				sum += parsedNums;
			}

			beri.close();

		} catch (IOException e) {
			System.out.println("Prislo je do napake");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}

		String converted = String.valueOf(sum);
		return converted;
	}



}