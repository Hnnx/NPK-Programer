package zemljepis;

public class Koordinate {

	private double sirina;
	private double dolzina;

	public Koordinate(double sirina, double dolzina) {

		this.sirina = sirina;
		this.dolzina = dolzina;
	}


	public String toString() {		
		int stopinjeSirina = (int) this.sirina;
		int stopinjeDolzina = (int) this.dolzina;

		int minuteSirina = (int) ((this.sirina - stopinjeSirina) * 60);
		int minuteDolzina = (int) ( (this.dolzina - stopinjeDolzina) * 60);

		String niz = stopinjeSirina + " " + minuteSirina + "; "
				+ stopinjeDolzina+ " " + minuteDolzina;

		return niz;
	}

	public boolean equals(Koordinate drugeKoordinate) {

		if	(this.sirina == drugeKoordinate.getSirina() &&
				this.dolzina == drugeKoordinate.getDolzina())
			return true;		
		return false;


	}

	private double getDolzina() {
		return this.dolzina;
	}


	private double getSirina() {
		return this.sirina;
	}

}
