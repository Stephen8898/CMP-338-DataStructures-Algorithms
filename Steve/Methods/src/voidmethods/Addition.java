package voidmethods;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition extends Applet implements ActionListener {

	Label aLB;
	Label bLB;
	Label cLB;
	Label sumLB;
	TextField txt;
	TextField txt1;
	TextField txt2;
	
	public void init() {
		
	setLayout(null);	
		
	aLB = new Label("a");
	add(aLB);
	aLB.setLocation(10,10);
	aLB.setSize(80,20);
	
	txt = new TextField();
	add(txt);
	txt.setLocation(10,30);
	txt.setSize(80, 20);
	
	bLB = new Label("b");
	add(bLB);
	bLB.setLocation(10,50);
	bLB.setSize(80,20);
	
	txt1 = new TextField();
	add(txt1);
	txt1.setLocation(10,70);
	txt1.setSize(80, 20);
	
	
	cLB = new Label("c");
	add(cLB);
	cLB.setLocation(10,90);
	cLB.setSize(80,20);
	
	txt2 = new TextField();
	add(txt2);
	txt2.setLocation(10,110);
	txt2.setSize(80, 20);
	
	sumLB = new Label("a+b+c: "); 
	add(sumLB);
	sumLB.setLocation(10,130);
	sumLB.setSize(250,20);
	
	Button sumBtn = new Button("Find Sum");
	add(sumBtn);
	sumBtn.setLocation(10, 150);
	sumBtn.setSize(80,20);
	
	sumBtn.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try{
		double a = Double.parseDouble(txt.getText());
		double b = Double.parseDouble(txt1.getText());
		double c = Double.parseDouble(txt2.getText());
		
		double sum = a+b+c;
		sumLB.setText("a+b+c: " + sum);
		}catch(NumberFormatException e1){
		sumLB.setText("Error enter numbers");	
		}
	}


}
