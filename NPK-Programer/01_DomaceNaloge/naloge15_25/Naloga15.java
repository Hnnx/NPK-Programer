package naloge15_25;

public class Naloga15 {

	public static void main(String[] args) {
		
		int tabela[][][][] = new int[2][2][2][2];		
		
		
		for (int a = 0; a < tabela.length; a++) {
			
			for(int b = 0; b < tabela[a].length; b++) {
				
				for(int c = 0; c < tabela[a][b].length;c++) {
					
					for(int d = 0; d < tabela[a][b][c].length; d++) {						
						
						tabela[a][b][c][d] = (int) (Math.random() * 10 + 1);						
						System.out.print(tabela[a][b][c][d] + " ");
						
					}						
				}			
			}			
		}		
		
	}

}
