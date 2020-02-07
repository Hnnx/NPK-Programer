package threads;


public class MainT {

	public static void main(String[] args) {
		
		Niti1 prvaNit = new Niti1("Nit-1", 250);
		prvaNit.start();
		
		Niti1 drugaNit = new Niti1("Nit-2", 50);
		drugaNit.start();
		
		Niti1 tretjaNit = new Niti1("Nit-3", 950);
		tretjaNit.start();


		
	}

}
