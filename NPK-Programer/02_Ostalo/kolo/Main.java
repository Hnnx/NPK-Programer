package kolo;

public class Main {

	public static void main(String[] args) {
		
		SpustnoKolo s1 = new SpustnoKolo("red", 100, 4.6);
		
		s1.izpisiVseLastnosti();
		s1.zaviraj();
		
		
		for (int i = 0; i < 3; i++) {
			s1.pospesi();
		}
		
		System.out.println();
		s1.izpisiVseLastnosti();

		



	}

}
