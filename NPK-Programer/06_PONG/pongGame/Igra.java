package pongGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Igra extends JPanel {

	Zoga zoga = new Zoga(this);
	Lopar lopar = new Lopar(this);

	//Hitrost in odboji
	public int hitrost = 1;
	public int odboj = 0;

	//Tocke, Zmage
	public int pointsP1 = 0;
	public static int pointsP2 = 0;

	private static int maxPoints = 1;
	private static int maxZmag = 3;
	private static int steviloZmagP1 = 0;
	private static int steviloZmagP2 = 0;


	//Imena,Handle
	private static String playerNameP1;
	private static String playerNameP2;
	static String p1handle;
	static String p2handle;

	//Barve
	static Color viola = new Color(124, 61, 161);
	static Color temnoZelena = new Color(81, 122, 58);

	public static void main(String[] args) throws InterruptedException {

		//Player names + handles
		String response;
		response = JOptionPane.showInputDialog("Insert player 1 name:");
		playerNameP1 = response;

		response = JOptionPane.showInputDialog("Insert player 2 name:");
		playerNameP2 = response;

		if(playerNameP1.length() >= 4) p1handle = playerNameP1.substring(0,4).toLowerCase();			
		else p1handle = playerNameP1.toLowerCase();

		if(playerNameP2.length() >= 4) p2handle = playerNameP2.substring(0,4).toLowerCase();
		else p2handle = playerNameP2.toLowerCase();


		JFrame frame = new JFrame("Igra");
		Igra igra = new Igra();

		frame.add(igra);
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		while (true) {
			igra.premakni();			
			igra.repaint();
			Thread.sleep(5);
		}
	}

	/************ METHODS *******/

	public Igra() {
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {} 
			@Override
			public void keyReleased(KeyEvent e) {
				lopar.tipkaSpuscena(e);
			}
			@Override
			public void keyPressed(KeyEvent e) {
				lopar.tipkaPritisnjena(e);
				lopar.p2tipkaPritisnjena(e);
			}
		});

		setFocusable(true);
	}


	//Premikanje zoge in loparjev
	private void premakni() {
		zoga.premakni();
		lopar.premakni();
		lopar.p2premakni();
	}

	//Metoda za stetje tock. Argument int x = 1 -> Dodaj tocko igralcu1   Argument int x != 1 -> Dodaj drugemu igralcu
	void incPoints(int x) {

		if(x == 1) pointsP1++;
		else pointsP2++;

		//Ob dosedu max tock, dodaj 1 zmago
		if(pointsP1 == maxPoints) {
			steviloZmagP1++;
			gameOver();
		}
		if(pointsP2 == maxPoints) { 
			steviloZmagP2++;
			gameOver();
		}

	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;

		//Glajenje robov
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


		zoga.paint(g2d);
		lopar.paint(g2d);


		//Scoreboard		
		g2d.setColor(viola);
		g2d.setFont(new Font("Helvetica", Font.PLAIN, 20));
		g2d.drawString(String.valueOf(playerNameP1+": " + this.pointsP1), 10, 100);

		g2d.setColor(temnoZelena);
		g2d.drawString(String.valueOf(playerNameP2+": " + Igra.pointsP2), 10, 120);

		//
		g2d.setColor(Color.black);
		g2d.setFont(new Font("Helvetica", Font.PLAIN, 12));
		g.drawString("Hitrost: " + this.hitrost, 5, 300);

	}

	public void gameOver() {		

		//ikona za prikaz ob zmagi
		ImageIcon win = new ImageIcon("pic//gg.png");		

		//Konec runde, takoj po temu se izvede soft reset
		JOptionPane.showMessageDialog(this, "Konec runde!\nZmagovalec je " + getPlayerName(), "KONEC RUNDE!", JOptionPane.PLAIN_MESSAGE, win);		
		reset();

		//ZMAGE, QUIT, REPLAY, HARD RESET
		if(steviloZmagP1 == maxZmag || steviloZmagP2 == maxZmag) {
			JOptionPane.showMessageDialog(null, "Zmagovalec je "+getPlayerName(), "Zmaga!", JOptionPane.PLAIN_MESSAGE, win);
			endGame();
		}

	}



	private void endGame() {		
		//int za preverjanje confirmDialog box rezultata
		int endGame = 0;

		endGame = JOptionPane.showConfirmDialog(this, "Koncaj igro?");
		if(endGame == 0) System.exit(0);			
		else {
			steviloZmagP1 = 0;
			steviloZmagP2 = 0;
			reset();
		}		
	}


	public String getPlayerName() {		

		if(pointsP1 > pointsP2)	return playerNameP1;
		else return playerNameP2;

	}

	public void reset() {
		//>> HITROST
		odboj = 0;
		hitrost = 1;
		//>> TOCKE
		pointsP1 = 0;
		pointsP2 = 0;
		//>> LOPARJI
		lopar.x = 0;
		lopar.p2x = 220;


		//>> ZOGA

		/*
		 * Probal ze vse variante, yPremik od nekje drugje dobi value in ga ni mogoce spremenit
		 *  probal yPremik/xPremik 0  in samo xPremik pridobi vrednost 0, yPremik se premika gor dol torej od nekje drugje dobi value
		 *  probal trk() funkcije in vseeno ni slo
		 *  probal spremenit direkt v Zoga.java file in yPremik se vedno dobi pozitivno vrednost
		 *  
		 *  zoga.y = 50  je namenjana debuganju, zato ker ko dobi player2 tocko lazje razberes trajcetory od zoge
		 */


		zoga.xPremik = 1;
		zoga.yPremik = -1;
		zoga.x = 50;
		zoga.y = 50;

	}

}
