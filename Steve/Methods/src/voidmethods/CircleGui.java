package voidmethods;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CircleGui extends Applet implements ActionListener {

 Label radiusLB;
 Label areaLB;
 TextField txt;
 
public void init(){
	setLayout(null);
	
	radiusLB = new Label("Radius");
	add(radiusLB);
	radiusLB.setLocation(10,10);
	radiusLB.setSize(80,20);
	
	txt = new TextField();
	add(txt);
	txt.setLocation(10,30);
	txt.setSize(80,20);
	
	areaLB = new Label("Area: ");
	add(areaLB);
	areaLB.setLocation(10,50);
	areaLB.setSize(250,20);
	
	Button areaBtn = new Button("Find Area");
	add(areaBtn);
	areaBtn.setLocation(10,70);
	areaBtn.setSize(80,25);
	
	areaBtn.addActionListener(this);
}	

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try{
		double rad = Double.parseDouble(txt.getText());
		double area = Math.PI * (rad*rad);
		areaLB.setText("Area: " + area);
		}catch(NumberFormatException e1){
		areaLB.setText("Area: Error enter Integer");
		}
	}

}