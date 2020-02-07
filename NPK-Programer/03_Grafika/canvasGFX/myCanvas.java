package canvasGFX;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class myCanvas extends JComponent {

		
	public void paint(Graphics g) {
		
		//doloci barvi + fillaj
		g.setColor(Color.red);		
		g.fillOval(30, 30, 50, 70);
		
		//ta samo izrise brez file
		g.draw3DRect(30, 50, 20, 50, true);
		
		//doloci barvo + fillaj
		g.setColor(Color.blue);		
		g.fill3DRect(10, 120, 50, 30, true);
		
		//RECT PISE "PROTI DOL"
		g.drawRect(5, 5, 20, 20);
		//TEXT PISE "PROTI GOR"
		g.drawString("Danes je lep dan", 5, 5);
		
		g.setColor(Color.orange);
		
		g.fillRect(200, 200, 70, 50);
		
		g.setColor(Color.LIGHT_GRAY);
		
		g.fillRect(200, 200, 50, 50);
	}

}
