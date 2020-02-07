package threads;


public class Main {

	public static void main(String[] args) {
		
		Niti2 niti1 = new Niti2("Nit 1", 500);
		//CE je true ni vezan na uporabnika
		niti1.setDaemon(true);
		niti1.start();
		
		Niti2 niti2 = new Niti2("Nit 2", 900);
		niti2.setDaemon(false);
		niti2.start();

	
	}

}
