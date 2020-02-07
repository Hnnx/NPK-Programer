package kolo4;

public class Pony extends Kolo implements PrevoznoSredstvo{

	public Pony(String barva, int hitrost) {
		super(barva, hitrost);
	
	}

	@Override
	void pospesi() {
		super.hitrost++;

	}

	@Override
	void zaviraj() {		
		super.hitrost--;
	}

	@Override
	public boolean sePremika() {
		return super.hitrost > 0;
	}
	
	

}
