package naloge15_25;

public class Naloga19 {

	public static void main(String[] args) {


		int[] tabela = new int[155];
		int[] drugaTabela = new int[17];
		int[] tabela3 = new int[5];
		int[] tabela4 = new int[3];

		tabela = napolniTabelo(tabela.length, 200);
		drugaTabela = napolniTabelo(drugaTabela.length, 10 );
		tabela3 = napolniTabelo(tabela3.length, 17);
		tabela4 = napolniTabelo(tabela4.length, 5);

		izpisiTabelo(tabela);
		System.out.println("");
		izpisiTabelo(drugaTabela);
		System.out.println("");
		izpisiTabelo(tabela3);
		System.out.println("");
		izpisiTabelo(tabela4);

	}

	public static int[] napolniTabelo(int velikostTabele, int razpon) {
		int[] tab = new int[velikostTabele];

		for(int i = 0; i < tab.length; i ++) {
			tab[i] = (int) (Math.random() * razpon+1);
		}
		return tab;		
	}	
	public static void izpisiTabelo(int[] tab) {		
		
		for (int i = 0; i < tab.length; i++) {			
			if( i <= tab.length-1) {
				System.out.print(tab[i] + ", ");				
			}
			else {
				System.out.println(tab[i]);
			}
		}

		//Preverjanje z obicnim forom:
		System.out.print("Preverjanje:\n");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]+" ");			
		}
		System.out.println();


	}

}


