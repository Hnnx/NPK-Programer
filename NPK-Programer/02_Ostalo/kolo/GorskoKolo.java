package kolo;

public class GorskoKolo extends Kolo {

	private int prestava = 1;
	
	public GorskoKolo(String barva, int maxHitrost) {
		super(barva, maxHitrost);

	}
	
	public void pospesi() {
		super.hitrost++;
	}
	
	public void zaviraj() {
		super.hitrost--;
	}
	
	public void izpisiVseLastnosti() {
		super.izpisiVseLastnosti();
	}
		

}
