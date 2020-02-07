package eventHandler;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

//ROKA S PRSTOM MED DRAGGANJEM

public class PoslusalecMiske extends JPanel implements MouseMotionListener{

	private static final int SIRINA = 120; //širina kvadratka;
	private static final int MAXST = 20; // maximalno število kvadratkov
	private int steviloKvadratkov = 0;
	private int trenutniKvadratek = -1;
	private Rectangle[] kvadratki = new Rectangle[MAXST]; //območje kvadratka

	//>>MAIN
	public static void main(String[] args) {
		JFrame okvir = new JFrame(); 

		okvir.setSize(500, 500);
		okvir.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		Container pane = okvir.getContentPane();
		pane.add(new PoslusalecMiske()); //Objekt smo dali v pane

		okvir.setVisible(true);

	}// >>>END MAIN

	//KONSTRUKTOR:
	public PoslusalecMiske() {
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent event) {
				int miskaX = event.getX();
				int miskyY = event.getY();

				trenutniKvadratek = getKvadratek(miskaX, miskyY);

				if(trenutniKvadratek < 0) {
					dodajKvadratek(miskaX, miskyY);
				}
			}

			public void mouseClicked(MouseEvent event) {
				if(event.getClickCount() >= 2) {
					odstraniKvadratek(trenutniKvadratek);
				}
			}

		});

		addMouseMotionListener(this);
	}

	public int getKvadratek(int miskaX, int miskaY) {
		for(int i = 0; i<this.steviloKvadratkov; i++) {
			if(this.kvadratki[i].contains(miskaX, miskaY))
				return i; 
		}

		return -1;
	}

	private void dodajKvadratek(int miskaX, int miskaY) {
		if(this.steviloKvadratkov == MAXST) //če smo dosegli max stevilo kvadratkov, ne nardi nič.
			return;

		this.kvadratki[this.steviloKvadratkov] = new Rectangle(miskaX, miskaY, SIRINA, SIRINA);
		this.steviloKvadratkov++;

		repaint();
	}

	public void odstraniKvadratek(int izbraniKvadratek) {
		if(izbraniKvadratek < 0 || izbraniKvadratek >= this.steviloKvadratkov) {
			return;
		}

		this.steviloKvadratkov--;
		this.kvadratki[izbraniKvadratek] = this.kvadratki[this.steviloKvadratkov];

		if(this.trenutniKvadratek == izbraniKvadratek) {
			this.trenutniKvadratek = -1;
		}

		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for(int i = 0; i<this.steviloKvadratkov; i++) {
			((Graphics2D) g).draw(this.kvadratki[i] );
		}
	}

	public void mouseDragged(MouseEvent e) {
		int miskaX = e.getX();
		int miskaY = e.getY();

		if(this.trenutniKvadratek >= 0) {


			Graphics g = getGraphics();
			g.setXORMode(getBackground());
			((Graphics2D)g).draw(this.kvadratki[this.trenutniKvadratek]);

			this.kvadratki[this.trenutniKvadratek].x = miskaX;
			this.kvadratki[this.trenutniKvadratek].y = miskaY;

			//lahko das tui repaint namesto tega
			( (Graphics2D) g ).draw(this.kvadratki[this.trenutniKvadratek]);

			g.dispose();
		}

		//DOMACA NALOGA
		if(this.getKvadratek(miskaX, miskaY) >= 0 ) {
			setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		} else {
			setCursor(Cursor.getDefaultCursor());
		}
	}

	public void mouseMoved(MouseEvent e) {
		
		int miskaX = e.getX();
		int miskaY = e.getY();
		
		if(this.getKvadratek(miskaX, miskaY) >= 0 ) {
			setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		} else {
			setCursor(Cursor.getDefaultCursor());
		}
		
		

	}

}