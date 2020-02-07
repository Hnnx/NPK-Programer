package razno;

public class Regi {

	public static void main(String[] args) {
		
		
		String input = "MyName123is567Testing";		
		
		
		System.out.println(noNums(input));
		
		System.out.println(noChars(input));
			

	}
	
	public static String noNums(String x) {
		
		return x.replaceAll("[0-9]", "");
		
	}
	
	public static String noChars(String x) {
		
		
		return x.replaceAll("[^0-9]", "");
	}

}
