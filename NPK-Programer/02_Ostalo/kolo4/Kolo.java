package kolo4;

public abstract class Kolo {
	
	private String barva;
	protected int hitrost = 0;
	
	public Kolo(String barva, int hitrost) {
		this.barva = barva;
		this.hitrost = hitrost;
	}
	
	public void izpisiVseLastnosti() {
		System.out.println("Barva kolesa: " + barva);
		System.out.println("Trenutna hitrost: " + hitrost);
	}
	
	abstract void pospesi();
	
	abstract void zaviraj();
		
	}


