package kolo;

public class Kolo {
	protected String barva;
	protected int hitrost = 0; 
	protected final int MAX_HITROST;
	
	
	
	public Kolo(String barva) {
		this.barva = barva;
		this.MAX_HITROST = 50;
	}
	
	public Kolo (String barva, int maxHitrost) {
		this.barva = barva;
		this.MAX_HITROST = maxHitrost;
	}
	
	public String getBarva() {
		return this.barva;
	}
	
	public void zaviraj() {
		if(this.hitrost > 0) {
			this.hitrost--;
		}		
	}
	
	public void pospesi() {
		if(this.lahkoPospesi()) {
			this.hitrost++;
		}
	}

	private boolean lahkoPospesi() {
		int novaHitrost = this.hitrost + 1;
		
		if(novaHitrost <= this.MAX_HITROST) {
			return true;
		}
		
		return false;
	}
	
	protected void izpisiVseLastnosti() {
		System.out.println("Barva kolesa: " + this.barva);
		System.out.println("Trenutna hitrost: " + this.hitrost);
		System.out.println("Maksimalna hitrost: " + this.MAX_HITROST);
	}
}
