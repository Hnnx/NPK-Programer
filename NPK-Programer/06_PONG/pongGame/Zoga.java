package pongGame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Zoga {

	//Velikost Zoge
	private static final int PREMER = 30;
	
	//Zacetna pozicija
	public int x = 0;
	public int y = 0;
	
	public int xPremik = 1;
	int yPremik = 1;
	private Igra igra;
	
	public Zoga(Igra igra) {
		this.igra = igra;
	}
	
	
	public void paint(Graphics2D g) {
		g.setColor(Color.black);
		g.fillOval(x, y, PREMER, PREMER);
	}
	
	
	
	/*
	 *  spodnji del sem poskusal spreminjati ampak mi potem ne steje pravilno tock oz. rund
	 *	ubistvu ko doseze zoga vrh ali dno yPremik pridobi vrednost hitrost / hitrost -1 
	 *	  
	 *  
	 */
	public void premakni() {
		if(x + this.xPremik < 0) {
			xPremik = igra.hitrost;
		}
		if(x + this.xPremik > igra.getWidth() - PREMER) {
			xPremik = -igra.hitrost;
		}		
		
		if(y + this.yPremik > igra.getHeight() - PREMER) {	
			igra.incPoints(2);			
			yPremik = -igra.hitrost;
		}
		if(y + this.yPremik < 0) {
			igra.incPoints(1);
			yPremik = igra.hitrost;			
		}		
		
		
		
		//Collision z loparjem (doda tocko in speed++ na 7 odbojev // spremeni yPremik		
		if(trk()) {
			odboj();
			yPremik = -igra.hitrost;
		}
		if(p2trk()) {
			odboj();
			yPremik = igra.hitrost;
		}
		
		x += xPremik;
		y += yPremik;
	}
	
	
	private void odboj() {
		igra.odboj++;			
		if(igra.odboj % 7 == 0) igra.hitrost++;		
	}
	
	public Rectangle getMejeZoge() {
		return new Rectangle(this.x, this.y, PREMER, PREMER);
	}
	
	public boolean trk() {
		return igra.lopar.getMejeLoparja().intersects(this.getMejeZoge());
	}
	
	public boolean p2trk() {
		return igra.lopar.p2getMejeLoparja().intersects(this.getMejeZoge());
	}


}
