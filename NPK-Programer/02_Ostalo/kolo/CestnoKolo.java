package kolo;

public class CestnoKolo extends Kolo {

	// >>>> ATRIBUTI <<<<
	private int prestava = 1;
	private final int MAX_STEVILO_PRESTAV;


	// >>>> KONSTRUKTORJI <<<<	
	public CestnoKolo(String barva, int maxHitrost, int maxPrestav) {
		super(barva, maxHitrost);		
		this.MAX_STEVILO_PRESTAV = maxPrestav;
	}

	public CestnoKolo(String barva, int maxHitrost) {
		super(barva, maxHitrost);		
		this.MAX_STEVILO_PRESTAV = 6;		
	}

	// >>>> METODE <<<<
	public void pospesi() {		
		if(this.lahkoPospesi()) {
			super.hitrost += this.prestava;
		}
	}

	private boolean lahkoPospesi() {		
		int novaHitrost = super.hitrost+ this.prestava;		
		return novaHitrost <= super.MAX_HITROST;			
	}

	
	public void prestavaGor() {		
		if(this.lahkoPrestaviGor()) 
			this.prestava++;	
	}
	
	//prestava na vajah:
	public void visajBrzino() {
		int novaPrestava = this.prestava +1;
		
		if(novaPrestava <= this.MAX_STEVILO_PRESTAV) {
			this.prestava = novaPrestava;
		}
	}
	

	private boolean lahkoPrestaviGor() {		
		int novaPrestava = this.prestava+1;		
		return novaPrestava <= this.MAX_STEVILO_PRESTAV;		
	}


	//=>  SUPER AL THIS?
	public void zaviraj() {		
		if(this.hitrost > 0) {
			this.hitrost--;
		}
	}

	public void prestavaDol() {

		if(this.lahkoPrestaviDol()) {
			this.prestava--;
		}		
	}


	private boolean lahkoPrestaviDol() {		
		int novaPrestava = this.prestava-1;		
		return novaPrestava >= 1;		

	}


	//Metoda ki simulira pospesek
	public void accelSim() {		
		for (int i = 0; i < prestava; i++) {
			for (int j = 0; j < 3; j++) {
				pospesi();
			}
			prestavaGor();
		}
	}

	protected void izpisiVseLasnosti() {
		super.izpisiVseLastnosti();
		System.out.println("Trenutna prestava: "+ this.prestava);
		System.out.println("Maksimalna prestava: " + this.MAX_STEVILO_PRESTAV);
	}
}
