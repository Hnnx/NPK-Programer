package zemljepis;

public class Main {
	
	public static void main(String[] args) {
		
		Koordinate koper = new Koordinate(45.6565, 13.54545);
		Koordinate piran = new Koordinate(45.6565, 13.54545);
		Koordinate celje = new Koordinate(44.6565, 12.5454);
		
		System.out.println("Koordinate Kopra so " + koper.toString());
		System.out.println("Koordinate Celja so " + celje.toString());
		
		System.out.println();
		if(koper.equals(piran)) {
			System.out.println("Koordinati sta enaki");
		} else {
			System.out.println("Koordinati nista enaki");
		}
		
		System.out.println();
		if(koper.equals(celje)) {
			System.out.println("Koordinati sta enaki");
		} else {
			System.out.println("Koordinati nista enaki");
		}
		
		Koordinate[] koordinateMest = new Koordinate[10];
		
		koordinateMest[0] = new Koordinate(13.54343, 70.322);
		koordinateMest[1] = new Koordinate(83.54343, 20.322);
		koordinateMest[2] = new Koordinate(3.54343, 23.322);
		koordinateMest[3] = new Koordinate(12.54343, 1.322);
		koordinateMest[4] = new Koordinate(43.54343, 77.322);
		koordinateMest[5] = new Koordinate(87.54343, 90.322);
		koordinateMest[6] = new Koordinate(32.54343, 45.322);
		koordinateMest[8] = new Koordinate(52.54343, 52.322);
		koordinateMest[9] = new Koordinate(73.54343, 35.322);
		

	
	}

}
