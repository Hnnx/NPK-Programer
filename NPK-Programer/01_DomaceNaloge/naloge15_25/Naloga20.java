package naloge15_25;

public class Naloga20 {

	public static void main(String[] args) {
		
		int[] tabela = new int[50];
		
		polnjeneTabele(tabela, 1000, 5000);
		
		izpisTabele(tabela);
		System.out.println("\n");
		System.out.println("Povprecna vrednost: " + povprecnaVrednostStevil(tabela));
		
	}
	
	
	public static double povprecnaVrednostStevil(int[] arr) {		
		int sestevekStevil = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sestevekStevil += arr[i];
		}
		
		return (double) sestevekStevil / arr.length;
	}
	
	
	public static void izpisTabele(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void polnjeneTabele(int[] arr, int min, int max) {
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = (int) (Math.random()* max + min);
		}
		
	}

}
