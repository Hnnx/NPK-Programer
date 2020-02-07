package bonusNaloge;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Kovanci {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> apoeni = new ArrayList<String>();
	
	public static void main(String[] args) throws InterruptedException {

		double vrednostIzdelka = 0.00;
		double gotovina = 0.00;
		

		while(true) {
			try {
				System.out.println("Vrednost izdelka: ");
				vrednostIzdelka = Double.parseDouble(sc.nextLine());
				System.out.println("Placilo: ");
				gotovina = Double.parseDouble(sc.nextLine());

				if(gotovina > vrednostIzdelka) {
					break;
				}
				else {
					System.out.println("Placilo more presegati vrednost izdelka!");
					System.out.println("Placilo " + gotovina+" je manjse od " + vrednostIzdelka);

				}


			} catch (InputMismatchException e) {
				System.out.println("Vnesi stevilo"+e.toString());
			} catch (NumberFormatException e) {
				System.out.println("Prislo je do napake: " + e.toString());
			} 					
			catch (Exception e) {
				System.out.println("Prislo je do napake: "+ e.toString());
			}
		}
		
		double cv = gotovina - vrednostIzdelka;
		double value = Math.round(cv * 1000) / 1000.0;
		
		
		double e500 = 500.00, e200 = 200.00, e100 = 100.00, e50 = 50.00, e20 = 20.00, e10 = 10.00, e5 = 5.00, e2 = 2.00, e1 = 1.00;	
		double c50 = 0.50, c20 = 0.20, c10 = 0.10, c05 = 0.05, c02 = 0.02, c01 = 0.01;

		//APOENI za izpisovanje:
		int a500 = 0, a200 = 0, a100 = 0, a50 = 0, a20 = 0, a10 = 0, a5 = 0, a2 = 0, a1 = 0;
		int ac50 = 0, ac20 = 0, ac10 = 0, ac05 = 0, ac02 = 0, ac01 = 0;


		while(value > 0 ) {

			if( value >= e500 )  {vnesiNumVList(e500); value -= e500; 	value = Math.round(value * 1000) / 1000.0;}
			else if( value >= e200 ) { vnesiNumVList(e200); value -= e200; 	value = Math.round(value * 1000) / 1000.0;}
			else if( value >= e100 ) { vnesiNumVList(e100);	value -= e100; 	value = Math.round(value * 1000) / 1000.0;}
			else if( value >= e50 )	 { vnesiNumVList(e50); value -= e50; value = Math.round(value * 1000) / 1000.0;}
			else if( value >= e20 )  { vnesiNumVList(e20); value -= e20; value = Math.round(value * 1000) / 1000.0;}
			else if( value >= e10 )	 { vnesiNumVList(e10); value -= e10; value = Math.round(value * 1000) / 1000.0;}
			else if( value >= e5 )	 { vnesiNumVList(e5); value -= e5;	value = Math.round(value * 1000) / 1000.0;	}
			else if( value >= e2 )   { vnesiNumVList(e2); value -= e2;	value = Math.round(value * 1000) / 1000.0;	}
			else if( value >= e1 )   { vnesiNumVList(e1); value -= e1;	value = Math.round(value * 1000) / 1000.0;	}
			else if( value >= c50 )  { vnesiNumVList(c50); value -= c50; value = Math.round(value * 1000) / 1000.0; }
			else if( value >= c20 )  { vnesiNumVList(c20); value -= c20; value =  Math.round(value * 1000) / 1000.0; }
			else if( value >= c10 )  { vnesiNumVList(c10); value -= c10; value = Math.round(value * 1000) / 1000.0; }
			else if( value >= c05 )  { vnesiNumVList(c05); value -= c05; value = Math.round(value * 1000) / 1000.0; }
			else if( value >= c02 )  { vnesiNumVList(c02); value -= c02; value = Math.round(value * 1000) / 1000.0; }
			else if( value >= c01 )  { vnesiNumVList(c01); value -= c01;  value = Math.round(value * 1000) / 1000.0;}

		}

		System.out.print("Vsi Apoeni: ");

		for (int i = 0; i < apoeni.size(); i++) {


			System.out.print(apoeni.get(i)+" ");

			if( apoeni.get(i).equals("500 EUR") ) a500++;
			if( apoeni.get(i).equals("200 EUR") ) a200++;
			if( apoeni.get(i).equals("100 EUR") ) a100++;
			if( apoeni.get(i).equals("50 EUR") ) a50++;
			if( apoeni.get(i).equals("20 EUR") ) a20++;
			if( apoeni.get(i).equals("10 EUR") ) a10++;
			if( apoeni.get(i).equals("5 EUR") ) a5++;
			if( apoeni.get(i).equals("2 EUR") ) a2++;	
			if( apoeni.get(i).equals("1 EUR") ) a1++;	

			if( apoeni.get(i).equals("0.50c") ) ac50++;
			if( apoeni.get(i).equals("0.20c") ) ac20++;
			if( apoeni.get(i).equals("0.10c") ) ac10++;
			if( apoeni.get(i).equals("0.05c") ) ac05++;
			if( apoeni.get(i).equals("0.02c") ) ac02++;
			if( apoeni.get(i).equals("0.01c") ) ac01++;


		}		

		
		System.out.print("Sortiram.");
		Thread.sleep(250);
		System.out.print(".");
		Thread.sleep(50);
		System.out.print(".");
		Thread.sleep(250);
		System.out.print("..");
		Thread.sleep(50);
		

		System.out.println("\nSortirani Apoeni:");


		if(a500 > 0) System.out.println(a500+" x 500 EUR");		
		Thread.sleep(120);
		if(a200 > 0) System.out.println(a200+" x 200 EUR");
		Thread.sleep(120);
		if(a100 > 0) System.out.println(a100+" x 100 EUR");
		Thread.sleep(120);
		if(a50 > 0) System.out.println(a50+" x 50 EUR");
		Thread.sleep(120);
		if(a20 > 0) System.out.println(a20+" x 20 EUR");
		Thread.sleep(120);
		if(a10 > 0) System.out.println(a10+" x 10 EUR");
		Thread.sleep(120);
		if(a5 > 0) System.out.println(a5+" x 5 EUR");
		Thread.sleep(120);
		if(a2 > 0) System.out.println(a2+" x 2 EUR");
		Thread.sleep(120);
		if(a1 > 0) System.out.println(a1+" x 1 EUR");
		Thread.sleep(120);

		if(ac50 > 0) System.out.println(ac50+" x 0.50  EUR");
		Thread.sleep(120);
		if(ac20 > 0) System.out.println(ac20+" x 0.20  EUR");
		Thread.sleep(120);
		if(ac10 > 0) System.out.println(ac10+" x 0.10  EUR");
		Thread.sleep(120);
		if(ac05 > 0) System.out.println(ac05+" x 0.05  EUR");
		Thread.sleep(120);
		if(ac02 > 0) System.out.println(ac02+" x 0.02  EUR");
		Thread.sleep(120);
		if(ac01 > 0) System.out.println(ac01+" x 0.01  EUR");



	}//END MAIN

	public static void vnesiNumVList(double x) {	
		
		if(x == 500.00) apoeni.add("500 EUR");
		if(x == 200.00) apoeni.add("200 EUR");
		if(x == 100.00) apoeni.add("100 EUR");
		if(x == 50.00) apoeni.add("50 EUR");
		if(x == 20.00) apoeni.add("20 EUR");
		if(x == 10.00) apoeni.add("10 EUR");
		if(x == 5.00) apoeni.add("5 EUR");
		if(x == 2.00) apoeni.add("2 EUR");
		if(x == 1.00) apoeni.add("1 EUR");
		if(x == 0.50) apoeni.add("0.50c");
		if(x == 0.20) apoeni.add("0.20c");
		if(x == 0.10) apoeni.add("0.10c");
		if(x == 0.05) apoeni.add("0.05c");
		if(x == 0.02) apoeni.add("0.02c");
		if(x == 0.01) apoeni.add("0.01c");		

	}

}