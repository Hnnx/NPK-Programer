package pongGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Lopar {

	
	//Velikost Loparja
	private static final int SIRINA = 60;
	private static final int VISINA = 20;

	
	/*  PLAYER 1 */
	//Zacetna pozicija
	private static final int Y = 330;
	public int x = 0;

	//Premikanje
	public int xPremik = 0;
	
	/*******************/

	/*  PLAYER 2 */
	//Player 2 Zacetna pozicija
	private static final int p2Y = 20;
	public int p2x = 220;

	//Premikanje
	public int p2xPremik = 0;
	
	
	//Barve
	static Color viola = new Color(124, 61, 161);
	static Color temnoZelena = new Color(81, 122, 58);
	
	

	//Konstruktor
	private Igra igra;	
	public Lopar(Igra igra) {
		this.igra = igra;
	}	


	/***** Metode */
	//Klicemo premakni/p2premakni v Igra classu
	public void premakni() {
		if(this.x + this.xPremik > 0 &&
				this.x + this.xPremik < igra.getWidth() - SIRINA) {
			this.x += this.xPremik;
		}
	}


	public void p2premakni() {
		if(this.p2x + this.p2xPremik > 0 && this.p2x + this.p2xPremik < igra.getWidth() - SIRINA) {
			this.p2x += this.p2xPremik;
		}
	}	




	//Metode, ki se uporabljajo v keyListener (Igra class)
	//Ce spodnjo zbrisemo, bo lopar drsel po ekranu (klicemo to metodo ob keyReleased eventu)
	public void tipkaSpuscena(KeyEvent e) {
		this.xPremik = 0;
		this.p2xPremik = 0;

	}



	//Klicemo metodo ob keyPressed eventu
	
	public void tipkaPritisnjena(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT) this.xPremik = -igra.hitrost;
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) this.xPremik = igra.hitrost;
		
	}
	
	public void p2tipkaPritisnjena(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_Q)	this.p2xPremik = -igra.hitrost;		
		if(e.getKeyCode() == KeyEvent.VK_E) this.p2xPremik = igra.hitrost;
		
	}




	//Za collision detection moremo poleg oblike še definirat bounds/meje
	public Rectangle getMejeLoparja() {
		return new Rectangle(this.x, Y, SIRINA, VISINA);
	}

	public Rectangle p2getMejeLoparja() {
		return new Rectangle(this.p2x, p2Y, SIRINA, VISINA);
	}



	//IZRISIOVANJE NA PANEL
	public void paint(Graphics2D g) {
		
		//Izris Player1
		g.setColor(viola);
		g.fillRect(this.x, Y, SIRINA, VISINA);
		g.setColor(Color.white);
		g.setFont(new Font("Helvetica", Font.PLAIN, 20));
		g.drawString(Igra.p1handle, this.x, 347);
		

		//Izris Player2
		g.setColor(temnoZelena);
		g.fillRect(this.p2x, p2Y, SIRINA, VISINA);
		g.setColor(Color.white);
		g.drawString(Igra.p2handle, this.p2x, 35);
	}


}
