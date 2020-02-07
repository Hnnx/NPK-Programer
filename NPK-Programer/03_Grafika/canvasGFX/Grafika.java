package canvasGFX;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grafika  extends JPanel{

	public static void main(String[] args) {
		
		JFrame okno = new JFrame();
		
		okno.setSize(300,300);
		
		okno.add(new Grafika());
		
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setVisible(true);

		
	}
	
	public void paint(Graphics g) {	
		
		g.drawRect(5, 10, 30, 50);
		g.setColor(Color.blue);
		g.fillRect(60, 50, 30, 23);
		g.drawRoundRect(10, 100, 50, 50, 50, 50);
		g.drawRoundRect(30, 30, 10, 10, 30, 5);
		g.setColor(Color.RED);
		g.drawOval(50, 10, 30, 30);
	}
	
	



}

