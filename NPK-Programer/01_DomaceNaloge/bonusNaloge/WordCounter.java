package bonusNaloge;

import java.io.File;

public class WordCounter extends naloga23.FileHandler{

	public static void main(String[] args) {
		
		File f = new File("Besedilo.txt");
		
		readFile(f);
		
		totalWords(f);	
		

	}

}
