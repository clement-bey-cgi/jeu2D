package jeu2D.config;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.corba.se.impl.naming.namingutil.CorbalocURL;

public class MaFenetre extends JFrame {
	
	public MaFenetre() throws IOException {
		this.setVisible(true);
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setTitle("Jeu 2D");
		
		Panneau pan = new Panneau();
		this.setContentPane(pan);
		
	}
}
