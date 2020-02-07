package canvasGFX;

import javax.swing.JFrame;

public class Grafika2 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		frame.setBounds(150,150,400,400);
		
		frame.getContentPane().add(new myCanvas());
		
		frame.setVisible(true);

	
	
	}

}
