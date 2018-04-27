package com.steve;
import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class Game1 extends JFrame {

	         JButton Shuffle ;
	         JButton Draw;	
	
		public Game1() {
			super("Card Game");
			setLayout(new FlowLayout());
			
			Shuffle = new JButton("Shuffle");
			add(Shuffle,BorderLayout.PAGE_END);
			
			Draw = new JButton("Draw"); 
			add(Draw,BorderLayout.PAGE_END);
			
		/*	
		 
			Icon s = new ImageIcon(getClass().getResource("img\\giphy-downsized.gif"));
			Icon d = new ImageIcon(getClass().getResource("img\\0.png"));
	*/	
			//andlerClass handle = new HandlerClass();
			//Shuffle.addActionListener(handle);
			//Draw.addActionListener(handle);
			
		}
		/*
		private class HandlerClass implements ActionListener {
			public void actionPerformed(ActionEvent event){
				
			}
			
		}

		*/

}
