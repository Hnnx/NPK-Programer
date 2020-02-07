package razno;

import java.util.Arrays;


public class PowSolo {

	public static void main(String[] args) {
		
		int[] x = {2,2,2};
		
		multi(x);

	
	}
	
	public static Integer[] multi(int[] arr) {
		
		Integer dl = arr.length;
		Integer[] drugiArray = new Integer[dl];
		
		for (int i = 0; i < arr.length; i++) {
			
			drugiArray[i] = arr[i] * dl;		
			System.out.println(drugiArray[i]);
			
			
		}
		
		return drugiArray;
				

	}
	

	

}
