package naloge01_15;
import java.util.Arrays;

public class Naloga02 {

	public static void main(String[] args) {		

		int prvoStevilo = Integer.parseInt(args[0]);
		int drugoStevilo = Integer.parseInt(args[1]);
		int tretjeStevilo = Integer.parseInt(args[2]);
		int cetrtoStevilo = Integer.parseInt(args[3]);
		int petoStevilo = Integer.parseInt(args[4]);

				
		int[] vsaStevila = {prvoStevilo, drugoStevilo, tretjeStevilo, cetrtoStevilo, petoStevilo};
		
		Arrays.sort(vsaStevila);	
		
		int najmanjseStevilo = vsaStevila[0];
		int najvecjeStevilo = vsaStevila[ vsaStevila.length-1 ];
		
		int temp = 0;
		
		for (int i : vsaStevila) {			
		temp += i;			
		}
		
		int average = temp/vsaStevila.length;
	

		System.out.println("Najmanjse vneseno stevilo: "+najmanjseStevilo);
		System.out.println("Najvecje vneseno stevilo: "+najvecjeStevilo);
		System.out.println("Povprecje vnesenih stevil: "+average);
		
		
		
		
		
		
		
		

	
	}

}
