package naloge15_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Naloga21 {

	public static void main(String[] args) throws IOException {
		izbirniMeni();
	}

	private static void izbirniMeni() throws IOException {
		System.out.println("1 - Sestej");
		System.out.println("2 - Odstej");
		System.out.println("3 - Mnozi");
		System.out.println("4 - Deli");
		System.out.println("5 - Potenca");
		System.out.println("6 - Kvadrat");
		System.out.println("7 - Trikratnik Stevil");
		System.out.println("8 - Ostanek");
		System.out.println("9 - Koren");
		System.out.println("10 - Izhod");

		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Ukaz: ");
		int ukaz = Integer.parseInt(beri.readLine());
		stikalo(ukaz);

	}

	private static void stikalo(int ukaz) throws IOException {
		switch(ukaz) {
		case 1:
			sestej();
			break;
		case 2:
			odstej();
			break;
		case 3:
			mnozi();
			break;
		case 4:
			deli();
			break;
		case 5:
			potenca();
			break;
		case 6:
			kvadrat();
			break;
		case 7:
			trikratnikStevil();
			break;
		case 8:
			ostanek();
			break;
		case 9:
			koren();
			break;
		case 10:
			System.exit(0);
		default:
			System.out.println("Neveljaven ukaz!");
		}

		izbirniMeni();
	}

	public static void ostanek() throws IOException{

		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Vnesi prvo stevilo: ");
		double prvoStevilo = Double.parseDouble(beri.readLine());

		System.out.print("Vnesi drugo stevilo: ");
		double drugoStevilo = Double.parseDouble(beri.readLine());
		
		double rezultat = prvoStevilo % drugoStevilo;

		System.out.println("Ostanek:\n"+prvoStevilo+" % "+ drugoStevilo+" = " + rezultat);



	}

	public static void trikratnikStevil() throws IOException{

		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Vnesi prvo stevilo: ");
		double prvoStevilo = Double.parseDouble(beri.readLine());

		System.out.print("Vnesi drugo stevilo: ");
		double drugoStevilo = Double.parseDouble(beri.readLine());

		System.out.println("Trikratnik stevil je: "+ prvoStevilo * 3 +  " in " + drugoStevilo *3);

	}

	public static void kvadrat() throws IOException{


		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Vnesi stevilo: ");
		double prvoStevilo = Double.parseDouble(beri.readLine());


		double rezultat = prvoStevilo*prvoStevilo;

		System.out.println("Kvadrat stevila " + prvoStevilo+" je "+ rezultat);
	}

	public static void koren() throws IOException{


		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Vnesi prvo stevilo: ");
		double prvoStevilo = Double.parseDouble(beri.readLine());


		double rezultat = Math.sqrt(prvoStevilo);

		System.out.println("Koren stevila "+prvoStevilo+" je " + rezultat);}

	public static void potenca()  throws IOException{

		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Vnesi stevilo, ki ga zelis potencirat: ");
		double prvoStevilo = Double.parseDouble(beri.readLine());

		System.out.print("Vnesi Potenco: ");
		double drugoStevilo = Double.parseDouble(beri.readLine());

		double rezultat = Math.pow(prvoStevilo,drugoStevilo);

		System.out.println(prvoStevilo + " na " + drugoStevilo + " potenco =  " + rezultat);}

	public static void deli() throws IOException{
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Vnesi prvo stevilo: ");
		double prvoStevilo = Double.parseDouble(beri.readLine());

		System.out.print("Vnesi drugo stevilo: ");
		double drugoStevilo = Double.parseDouble(beri.readLine());

		double rezultat = prvoStevilo / drugoStevilo;

		System.out.println(prvoStevilo + " / " + drugoStevilo + " = " + rezultat);

	}

	public static void mnozi() throws IOException {

		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Vnesi prvo stevilo: ");
		double prvoStevilo = Double.parseDouble(beri.readLine());

		System.out.print("Vnesi drugo stevilo: ");
		double drugoStevilo = Double.parseDouble(beri.readLine());

		double rezultat = prvoStevilo * drugoStevilo;

		System.out.println(prvoStevilo + " x " + drugoStevilo + " = " + rezultat);


	}

	public static void odstej() throws IOException {


		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Vnesi prvo stevilo: ");
		double prvoStevilo = Double.parseDouble(beri.readLine());

		System.out.print("Vnesi drugo stevilo: ");
		double drugoStevilo = Double.parseDouble(beri.readLine());

		double rezultat = prvoStevilo - drugoStevilo;

		System.out.println(prvoStevilo + " - " + drugoStevilo + " = " + rezultat);

	}

	public static void sestej() throws IOException {
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Vnesi prvo stevilo: ");
		double prvoStevilo = Double.parseDouble(beri.readLine());

		System.out.print("Vnesi drugo stevilo: ");
		double drugoStevilo = Double.parseDouble(beri.readLine());

		double rezultat = prvoStevilo + drugoStevilo;

		System.out.println(prvoStevilo + " + " + drugoStevilo + " = " + rezultat);
	}

}
