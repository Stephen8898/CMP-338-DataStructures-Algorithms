package com.steve;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Card1  {

	private JPanel pane;
	private JPanel imageD;
	private JLabel cardD;
	private JButton draw;
	private JButton shuffle;
	private JButton gameover;
	private ImageIcon img;
	private ImageIcon img1;
	
	JFrame gui = new JFrame();
	
	public Card1(){
		
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setTitle("Stephen's Card Game");
		gui.setLocationRelativeTo(null);
		gui.setSize(400,400);
	
	
		pane = new JPanel();
		pane.setLayout(new BorderLayout());
		imageD = new JPanel();
		img = new ImageIcon("img\\Defaultpic.png");
		setImg1(new ImageIcon("img\\Jokerquit.png"));
		cardD = new JLabel(img);
		setShuffle(new JButton("Shuffle"));
		draw = new JButton("Draw");
		gameover = new JButton("Quit");
		
		gui.setVisible(true);
	}


	public JButton getShuffle() {
		return shuffle;
	}


	public void setShuffle(JButton shuffle) {
		this.shuffle = shuffle;
	}


	public ImageIcon getImg1() {
		return img1;
	}


	public void setImg1(ImageIcon img1) {
		this.img1 = img1;
	}
	


}


