package com.steve;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class CG {
	
	public static JButton draw = new JButton("Draw");
	
	public static void main(String[] args) {
		JFrame gui = new JFrame();
		gui.setTitle("Card Shuffling Program");
		gui.setMaximumSize(new Dimension(300,300));
		gui.setMinimumSize(new Dimension(200,200));
		gui.setSize(300,300);
		gui.setLocationRelativeTo(null);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = gui.getContentPane();
		
		//Default Image on start
		JPanel p1 = new JPanel();
		ImageIcon img = new ImageIcon("img/0.png");
		JLabel defaultImg = new JLabel(img);
		p1.add(defaultImg);
		
		//Buttons shuffle and draw
		JPanel p2 = new JPanel();
		JButton shuffle = new JButton("Shuffle");
		p2.add(shuffle);
		draw.setEnabled(false);
		shuffle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon img = new ImageIcon("img/shuffling.gif");
				defaultImg.setIcon(img);
				shuffle.setEnabled(false);
				shuffle.setText("Shuffling");
				draw.setEnabled(true);
				draw.setText("Draw");
			}
			
		});
		
		p2.add(draw);
		draw.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
                
                int[] cards = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27
                		,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};
                int n = new Random().nextInt(cards.length) + 1;
				ImageIcon img = new ImageIcon("img/"+ n + ".png");
				defaultImg.setIcon(img);
				
				draw.setEnabled(false);
				draw.setText("Shuffled");
				shuffle.setEnabled(true);
				shuffle.setText("Shuffle");
			}
			
		});
		
		container.add(p1, BorderLayout.PAGE_START);
		container.add(p2, BorderLayout.PAGE_END);
		gui.setVisible(true);
	}
}
