package com.steve;

import javax.swing.JFrame;

public class ExamReview {

	public static void main(String[] args) {
		
		String[] r = {"Nissan ", "BMW ","Tesla ","Honda \t","Ford ","Toyota "}; 
		for (int i = 0; i < r.length; i++){
			System.out.println(r[i]);
		}
		
		
	
		int[] b = {0,5,15,25,35,45,55,65,75,85,95};
		int i = b.length-1;
		while (i >= 0){
			System.out.println(b[i]);
		i--;
		}
		
		JFrame gui = new JFrame();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setTitle("Window");
		gui.setSize(400,400);
		gui.setLocationRelativeTo(null);
		
		gui.setVisible(true);
		
		
	}

}
