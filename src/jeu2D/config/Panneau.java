package jeu2D.config;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel {
	
	public void paintComponent(Graphics g) {
		Integer pourcentX = (this.getWidth()/100)*1;
		Integer pourcentY = (this.getHeight()/100)*1;
		g.fillOval( pourcentX*40, pourcentY*60, pourcentX*20, pourcentY*40);
		
		Image img;
		try {
			img = ImageIO.read(new File("visagePj.PNG"));
			g.drawImage(img,pourcentX*45, pourcentY*45, pourcentX*10,pourcentY*15, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
