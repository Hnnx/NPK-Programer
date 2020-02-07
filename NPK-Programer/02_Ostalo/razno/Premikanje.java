package razno;
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Premikanje implements Runnable {

	JFrame okvir;
	//Staring position
	int mojX = 250;
	int mojY = 250;
	Canvas kanvas;
	BufferStrategy bufferStrategy;
	boolean dela = true;
	
	int premakniCrto = 300;

	//MAIN
	public static void main(String[] args) {
		Premikanje premik = new Premikanje();

		new Thread(premik).start();		

	}//end main

	public void  run() {
		while(this.dela) {
			Paint();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				System.out.println(e.getStackTrace() );
			}
		}
	}

	//Konstruktor:
	public Premikanje() {
		okvir = new JFrame("Premikanje");

		JPanel polje = (JPanel) okvir.getContentPane();
		polje.setPreferredSize(new Dimension(500, 500));
		polje.setLayout(null);

		kanvas = new Canvas();
		kanvas.setBounds(0, 0, 500, 500);
		kanvas.setIgnoreRepaint(false);

		polje.add(kanvas);

		okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okvir.pack(); //Prilagodi velikost glede na komponente
		okvir.setResizable(false);
		okvir.setVisible(true);

		kanvas.createBufferStrategy(2);
		this.bufferStrategy = kanvas.getBufferStrategy();
		kanvas.requestFocus(); //kanvas mora imet fokus, če ne se ne zgodi nič, ko premikamo.

		kanvas.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent event) {
				premakni(event);
			}
		});


	}

	protected void premakni(KeyEvent event) {
		switch (event.getKeyCode() ) {
		case KeyEvent.VK_DOWN:
			mojY += 5;
			premakniCrto -= 10;
			break;
		case KeyEvent.VK_UP:
			mojY -= 5;
			premakniCrto += 10;
			break;
		case KeyEvent.VK_LEFT:
			mojX -= 5;
			break;
		case KeyEvent.VK_RIGHT:
			mojX += 5;
			break;
		}

	}



	public void Paint() {
		Graphics2D g = (Graphics2D) this.bufferStrategy.getDrawGraphics();
		g.clearRect(0, 0, 500, 500); //ko premikamo krog, ga brie na prejnšnjem mestu
		Paint(g);
		this.bufferStrategy.show();

	}

	//Metoda, ki narise krog:
	protected void Paint(Graphics2D g) {
		
		g.setColor(Color.lightGray);
		
		int[] tockaX = new int[3];
		int[] tockaY = new int[3];
		
		tockaX[0] = mojX+275; tockaY[0] = mojY+260;
		// sredina vrh
		tockaX[1] = mojX+287; tockaY[1] = mojY+240;
		
		tockaX[2] = mojX+300; tockaY[2] = mojY+260;
		
		int tocke = tockaX.length;
		
		
		
		Polygon nus = new Polygon(tockaX,tockaY,tocke);
		g.fillPolygon(nus);
		
		


		
		Graphics2D debelaLinija = (Graphics2D) g;
		debelaLinija.setStroke(new BasicStroke(5));				
		
		
		g.setColor(Color.pink);
		g.drawLine(premakniCrto, 385, mojX+293, mojY+420);
		
		g.setColor(Color.lightGray);
		
		g.fillOval(mojX+5, mojY+7, 70, 130);		
		g.fillOval(mojX-10, mojY, 50, 50);
		g.fillOval(mojX+37, mojY, 50, 50);

		
	}








}