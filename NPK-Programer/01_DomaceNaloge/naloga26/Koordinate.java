package naloga26;


public class Koordinate {

	private double sirina;
	private double dolzina;

	//Konstruktor
	public Koordinate(double sirina, double dolzina) {
		this.sirina = sirina;
		this.dolzina = dolzina;
	}

	//Getterji
	public double getSirina() {
		return this.sirina;
	}

	public double getDolzina() {
		return this.dolzina;
	}


	/************ METODE *********/


	//Overrida java.lang.String z nasim
	public String toString() {
		int stopinjeSirina = (int) this.sirina;
		int stopinjeDolzina = (int) this.dolzina;

		int minuteSirina = (int) ((this.sirina - stopinjeSirina) * 60); 
		int minuteDolzina = (int) ((this.dolzina - stopinjeDolzina) * 60);

		String niz =  stopinjeSirina + " " + minuteSirina  +"; " 
				+ stopinjeDolzina + " " + minuteDolzina;
		return niz;
	}

	//Metodo public String hemisfera(), ki vrne 2-črkovni zapis polobel (S, J, V, Z),

	public String hemisfera() {
		
		if(this.getSirina() >= 0  && this.getDolzina() >= 0)
			return "SV";
		else if(this.getSirina() >= 0 && this.getDolzina() <= 0)
			return "SZ";
		else if(this.getSirina() <= 0 && this.getDolzina() >= 0)
			return "JV";
		else
			return "JZ";		
	}

	// metodi public void pristej(Koordinate drugeKoordinate) in public void odstej(Koordinate drugeKoordinate)
	// metodi naj omogočijo seštevanje in odštevanje koordiant.

	public void pristej(Koordinate drugeKoordinate) {

	}

	public void odstej(Koordinate drugeKoordinate) {

	}


	
	//Metoda equals overloada java.lang equals z drugimi argumenti(Koordinate drugeKoordinate)
	public boolean equals(Koordinate drugeKoordinate) {
		if(this.sirina == drugeKoordinate.getSirina() 
				&& this.dolzina == drugeKoordinate.getDolzina()) {
			return true;
		}

		return false;
	}
}
