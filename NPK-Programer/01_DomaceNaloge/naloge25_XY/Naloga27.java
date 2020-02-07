package naloge25_XY;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Naloga27 extends JPanel{

	private static final int WIDTH = 400;
	private static final int HEIGHT= 500;

	//Colors

	Color bordoRdeca = new Color(194, 40, 15);
	Color svetloModra = new Color(201, 253, 242);
	Color zelena = new Color(7, 53, 16);
	Color rumena = new Color(240, 241, 83);
	Color zarki = new Color(249, 218, 155);



	public static void main(String[] args) {

		JFrame win = new JFrame("avto");
		win.setSize(new Dimension(WIDTH,HEIGHT));
		win.add(new Naloga27());		
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setResizable(false);		
		win.setVisible(true);


	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(1));

		//Lucke + linije speadaj		
		g.setColor(Color.yellow);
		g.fillOval(50, 300, 20, 30);
		g.setColor(Color.black);
		g.drawOval(50, 300, 20, 30);



		//Snopki svetlobe front
		g.setColor(Color.black);
		g.drawLine(40, 305, 15, 300);		
		g.drawLine(40, 315, 15, 315);		
		g.drawLine(40, 325, 15, 330);

		//Streha
		g.setColor(svetloModra);
		g.fillRect(123, 250, 130, 70);
		g.setColor(Color.black);
		g.drawRect(123, 250, 130, 70);

		//Zadnja Luc
		g.setColor(Color.red);
		g.fillRect(297, 303, 20, 20);
		g.setColor(Color.black);
		g.drawRect(297, 303, 20, 20);

		//Snopki svetlobe back		
		g.drawLine(335, 300, 320, 305);		
		g.drawLine(335, 312, 320, 312);		
		g.drawLine(335, 322, 320, 319);

		//Volan
		g.drawOval(130, 275, 20, 30);		
		g.drawLine(132, 280, 140, 290);
		g.drawLine(140, 290, 145, 279);
		g.drawLine(140, 290, 140, 295);


		//Sedez spredaj
		g.drawRect(170, 280, 10, 50);
		g.drawRect(172, 273, 5, 5);	
		g.drawLine(175, 273, 175, 280);

		//Sedez zadaj
		g.drawRect(203, 280, 10, 50);
		g.drawRect(205, 273, 5, 5);	
		g.drawLine(208, 273, 208, 280);		


		//Sprednje Okno
		g.setColor(svetloModra);	

		int[] sprednjeOknoX = new int[3];
		int[] sprednjeOknoY = new int[3];
		int sprednjeOknoPoints = sprednjeOknoX.length;

		sprednjeOknoX[0] = 90;	sprednjeOknoY[0] = 295;
		sprednjeOknoX[1] = 124; sprednjeOknoY[1] = 250;
		sprednjeOknoX[2] = 124; sprednjeOknoY[2] = 295;		


		Polygon sprednjeOkno = new Polygon(sprednjeOknoX,sprednjeOknoY,sprednjeOknoPoints);
		g.fillPolygon(sprednjeOkno);		
		g.setColor(Color.black);
		g.drawPolygon(sprednjeOkno);		


		//Zadnje okno

		g.setColor(svetloModra);		
		int[] zadnjeOknoX = new int[3];
		int[] zadnjeOknoY = new int[3];
		int zadnjeOknoPoints = zadnjeOknoX.length;


		zadnjeOknoX[0] = 253; zadnjeOknoY[0] = 250;
		zadnjeOknoX[1] = 253; zadnjeOknoY[1] = 294;
		zadnjeOknoX[2] = 290; zadnjeOknoY[2] = 294;

		Polygon zadnjeOkno = new Polygon(zadnjeOknoX, zadnjeOknoY, zadnjeOknoPoints);
		g.fillPolygon(zadnjeOkno);
		g.setColor(Color.black);
		g.drawPolygon(zadnjeOkno);		


		Graphics2D debelaLinija = (Graphics2D) g;
		debelaLinija.setStroke(new BasicStroke(2));		


		//Karoserija		
		g.setColor(bordoRdeca);
		g.fillRect(60, 295, 250, 70);
		g.setColor(Color.black);
		g.drawRect(60, 295, 250, 70);

		Graphics2D g3 = (Graphics2D) g;
		g3.setStroke(new BasicStroke(1));

		//Napis na avtu
		g.setColor(Color.black);
		g.drawString("VOLVO", 150, 325);
		g.drawString("16 VALVE TURBO", 150, 350);


		//Sprednja guma
		g.setColor(Color.black);
		g.fillOval(75, 345, 50, 50);

		//Sprednja feltna
		g.setColor(Color.white);
		g.fillOval(81, 351, 38, 38);

		//Sprednja Center Feltna
		g.setColor(Color.black);
		g.fillOval(98, 368, 5, 5);


		//Zadnja guma
		g.setColor(Color.black);
		g.fillOval(245, 345, 50, 50);	

		//Zadnja feltna
		g.setColor(Color.white);
		g.fillOval(251, 351, 38, 38);

		//Zadnja Center Feltna
		g.setColor(Color.black);
		g.fillOval(268, 369, 5, 5);


		//Sprednje Linije za feltno
		g.drawLine(85, 350, 116, 388);
		g.drawLine(85, 390, 116, 350);
		g.drawLine(80, 370, 120, 370);
		g.drawLine(100, 350, 100, 390);

		//zadnje linije za feltno
		g.setColor(Color.black);
		g.drawLine(257, 353, 280, 385);		
		g.drawLine(250, 371, 289, 371);		
		g.drawLine(255, 390, 282, 352);		
		g.drawLine(270, 353, 270, 390);


		//Trava		
		g.setColor(zelena);		
		g.fillRect(0, 395, WIDTH, HEIGHT);
		
		
		g.setColor(zarki);
		Graphics2D zarki = (Graphics2D) g;
		zarki.setStroke(new BasicStroke(5));
		
		
		g.drawLine(350, 90, 250, 120);		
		g.drawLine(350, 90, 250, 50);
		g.drawLine(350, 90, 270, 190);
		g.drawLine(350, 90, 350, 220);
		g.drawLine(350, 90, 330, 5);


		//Sunce
		g.setColor(rumena);
		g.fillOval(290, 10, 150, 150);
		
		
		








	}


}


