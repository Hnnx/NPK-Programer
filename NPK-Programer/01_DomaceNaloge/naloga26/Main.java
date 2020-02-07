package naloga26;

public class Main {
	//

	public static void main(String[] args) {
		Koordinate koper = new Koordinate(-20.70, -15.1);
		Koordinate celje = new Koordinate(46.236, 15.268);
		
		System.out.println("Koordinate Kopra so: " + koper.toString() + " "+ koper.hemisfera());
		System.out.println("Koordinate Celja so: " + celje.toString() + " "+ celje.hemisfera());
		
		if(koper.equals(celje)) System.out.println("Koordinati sta enaki");
		else System.out.println("Koordinati nista enaki");
	

	}

}
