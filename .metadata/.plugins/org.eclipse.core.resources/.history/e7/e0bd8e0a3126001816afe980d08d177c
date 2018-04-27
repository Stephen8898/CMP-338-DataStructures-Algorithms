package com.steve;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CardGame  {
	
 
	
	public int randomCardgen(){
		int[] Icon = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,
						17,18,19,20,21,22,23,24,25,26,27,
        		        28,29,30,31,32,33,34,35,36,37,
        		        38,39,40,41,42,43,44,45,46,47,48,
        		        49,50,51,52}; 
		
			int iRandom = (int) (Math.random()* Icon.length);

			
			return iRandom ;
	}

	
	public static void main(String[] args) {
	
		CardGame b = new CardGame();
			
		JFrame gui = new JFrame();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setLocationRelativeTo(null);
		gui.setTitle("Card Game");
		gui.setSize(450,400);
		
		//gui.setBackground(Color.black);
	      
		
		Container container = gui.getContentPane();
		
		JPanel pane = new JPanel();
		// Create Image 
		JButton shuffle1 = new JButton("Shuffle");
		 JButton draw1 = new JButton("Draw");
		 JButton gameover = new JButton("Quit cause this game sucks!!!");
		JPanel ImageD = new JPanel();
		// Setting Default image
		// Setting JOption Icon
		ImageIcon img = new ImageIcon("img\\Defaultpic.png");
		ImageIcon img1 = new ImageIcon("img\\Jokerquit.png");
		JLabel cardD = new JLabel(img);
		gameover.setEnabled(false);
		ImageD.add(cardD);
		
		
		// Connecting Image to Button
		// JPanel button randomCardgen()

		// This Method come from the Action Listener class and the class
		// has action performed which is the only method this class has.
		// It allows action to happen when a button is pressed 
				shuffle1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed (ActionEvent e) {
						ImageIcon img = new ImageIcon("img\\giphy-downsized.gif");
						shuffle1.setEnabled(false);
						shuffle1.setText("Shuffling");
						draw1.setEnabled(true);
						draw1.setText("Draw");
						cardD.setIcon(img);
						gameover.setEnabled(false);
					}
				});
		
				draw1.setEnabled(false);
				draw1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed (ActionEvent e) {
						ImageIcon img = new ImageIcon("img/" +  b.randomCardgen()+".png");
						cardD.setIcon(img);
						draw1.setEnabled(false);
						shuffle1.setEnabled(true);
						shuffle1.setText("Shuffle");
						gameover.setEnabled(true);
					}
				});
			
				
				gameover.addActionListener(new ActionListener() {
					private int EXIT_ON_CLOSE;

					@Override
					public void actionPerformed (ActionEvent e){
						shuffle1.setEnabled(false);
						draw1.setEnabled(false);
							gameover.setEnabled(false);
						JOptionPane.showMessageDialog(null,
								" Wait!!! Before you go.\n"
							    + "Do you wanna know how I got these scars?!\n"
							    + " Woahaha!! Woo! Woo! ",
							    "WHY SO SERIOUS?",
							    JOptionPane.INFORMATION_MESSAGE, img1);
								System.exit(EXIT_ON_CLOSE);
					}
				});
				
				
		// Making Button
		pane.add(shuffle1);
		pane.add(draw1);
		pane.add(gameover);
	
		// Adding to container or display in user interface
		container.add(ImageD);
		container.add(pane,BorderLayout.PAGE_END);
		
		gui.setVisible(true);
		

	}	
	
}
