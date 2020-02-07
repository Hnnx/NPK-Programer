package imageManipulation;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Slika extends JPanel{

	public static void main(String[] args) {

		JFrame frame = new JFrame();

		frame.getContentPane().add(new Slika());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);

	}
	
	public void paint(Graphics g) {
		
		Image img = mojaSlika();
		g.drawImage(img, 10, 10, this);
		
	}
	
	private Image mojaSlika() {
		
		BufferedImage bImg = null;
		BufferedImage preoblikovanaSlika = null;
		
		try {
			bImg = ImageIO.read(new File("C:\\pic.png"));
			
			int[][] pixArray = new int [bImg.getHeight()][bImg.getWidth()];
			
			for (int i = 0; i < pixArray.length; i++) {
				for (int j = 0; j < pixArray[i].length; j++) {
					pixArray[i][j] = bImg.getRGB(j, i);
					System.out.print(pixArray[i][j]+" ");
				}
				System.out.println("");
			}
			
			preoblikovanaSlika = new BufferedImage(bImg.getWidth(), bImg.getHeight(),
					BufferedImage.TYPE_INT_RGB);
			
			for (int i = 0; i < pixArray.length; i++) {
				for (int j = 0; j < pixArray[i].length; j++) {
					preoblikovanaSlika.setRGB(j, i, pixArray[i][j]);
				}
			}
			
			
		} catch (Exception e) {
			System.out.println("Error! "+ e.toString());
		}
		
		
		return preoblikovanaSlika;
	}

}
