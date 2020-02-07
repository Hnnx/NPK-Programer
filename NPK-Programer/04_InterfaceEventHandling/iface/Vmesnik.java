package iface;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vmesnik {
	
	private JFrame mainFrame;
	private JLabel glavaLabel;
	private JLabel statusLabel;
	private JLabel sporociloLabel;
	private JPanel controlPanel;
	
	public Vmesnik() {
		this.pripraviUI();
	}

	private void pripraviUI() {
		mainFrame = new JFrame("Moje okno!");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1) );
		
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				System.exit(0);
			}
		});
		
		glavaLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		
		statusLabel.setSize(350, 100);

		sporociloLabel = new JLabel("Danes je lep dan", JLabel.CENTER);
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout() );
		
		mainFrame.add(glavaLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		
		mainFrame.setVisible(true);
	}

	// MAIN:
	public static void main(String[] args) {
		
		Vmesnik okno = new Vmesnik();
		
		okno.pokaziFrame();

	}// END MAIN

	private void pokaziFrame() {
		JFrame frame = new JFrame();
		
		frame.setSize(300, 300);
		
		frame.setLayout(new FlowLayout() );
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				frame.dispose();
			}
		});
		
		glavaLabel.setText("Container: JFrame");
		
		frame.add(sporociloLabel);
		
		JButton gumb = new JButton("Odpri drugi frame");
		gumb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("Frame, ki ga vidi uporabnik");
				frame.setVisible(true);
			}
			
		});
		
		controlPanel.add(gumb);
		mainFrame.setVisible(true);
		
	}

}