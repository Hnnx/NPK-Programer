package razno;

public class RecursiveString {

	public static void main(String[] args) {
		
		String a = "apple";
		
		recursiveString(a);
		
		int x = recursiveString(a);
		
		System.out.println(x);

	}



	public static int recursiveString(String str) {
		
		if(str.isBlank())
			return 0;
		
		return 5  + recursiveString(str.substring(1));
		

	}

}
