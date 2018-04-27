package com.steve;

	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;

	public class CardGame1 {
		

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			JFrame gui = new JFrame();
			
			gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gui.setTitle("Stephen's Game");
			gui.setSize(350,350);
			gui.setLocationRelativeTo(null); // cent GUL
	 		
			
			Container container = gui.getContentPane();
			
			JLabel label = new JLabel();
			
			//JPanel image
			JPanel imagePanel = new JPanel();
			ImageIcon img = new ImageIcon("img\\0.png");
			JLabel cardDisplay = new JLabel(img);
			imagePanel.add(cardDisplay);
			
			//JPanel for Buttons
			JPanel buttonsPanel = new JPanel();
			JButton shuffle = new JButton("Shuffle");
			shuffle.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e){
					
				}
			});
			
			JButton draw = new JButton("Draw");
			draw.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					ImageIcon img = new ImageIcon("img/24.png");
					cardDisplay.setIcon(img);
				}
				
			});
				
			buttonsPanel.add(shuffle);
			buttonsPanel.add(draw);
			
			//adding to container
			container.add(imagePanel);
			container.add(buttonsPanel, BorderLayout.PAGE_END);
			
			gui.setVisible(true);
			
		}

	}


