package threads;


public class Niti1  implements Runnable{

	private Thread nit;
	private String imeNiti;
	private int spanje;

	public Niti1(String ime,int spanje) {
		this.imeNiti = ime;
		this.spanje = spanje;		 
	}

	public void start() {
		System.out.println("Zacetek niti: " + this.imeNiti);
		if(nit == null){
			nit = new Thread(this, this.imeNiti);
			nit.start();
		}
	}

	
	public void run() {
		
		System.out.println("zagon niti" + this.imeNiti);
		
		try {
			for (int i = 0; i < 8; i++) {
				System.out.println("Nit: "+ this.imeNiti + " = "+ i);
				Thread.sleep(this.spanje);
				
			}
		} catch (InterruptedException e) {
			System.out.println("Nit " + this.imeNiti+" je bila prekinjena");
		}

		System.out.println(this.imeNiti + " je Zakljucena");
	}



}
