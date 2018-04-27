
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleGui extends Applet implements ActionListener{
	
	 Label lengthLB;
	 Label widthLB;
	 Label areaLB;
	 TextField txt;
	 TextField txt1;
	 Label perimLB;
	
	public void init(){
	
		setLayout(null);

		lengthLB = new Label("Length : ");   // Create Label Object
		add(lengthLB);							// Add it into the window
		lengthLB.setLocation(10,10);			// Set location and size
		lengthLB.setSize(80,20);
		
	    txt = new TextField(); 
		add(txt); 
		txt.setLocation(10,30);
		txt.setSize(80, 20);
		
		widthLB = new Label("Width : ");   
		add(widthLB);							
		widthLB.setLocation(10,50);			
		widthLB.setSize(80,20);
		
		txt1 = new TextField(); 
		add(txt1); 
		txt1.setLocation(10,70);
		txt1.setSize(80, 20);
		
		areaLB = new Label("Area : ");   
		add(areaLB);						
		areaLB.setLocation(10,110);			
		areaLB.setSize(80,20);
	
		Button areaBtn = new Button(" Find Area ");	
		add(areaBtn);
		areaBtn.setLocation(10,140);
		areaBtn.setSize(85,25);
		
		perimLB = new Label("Perimeter: ");
		add(perimLB);
		perimLB.setLocation(10,190);
        perimLB.setSize(100,20);   
		
		Button perimBtn = new Button(" Find Perimeter ");	
		add(perimBtn);
		perimBtn.setLocation(10,220);
		perimBtn.setSize(85,25);
		
		areaBtn.addActionListener(this); // Connect ActionListener to button
		perimBtn.addActionListener(this);
	}


	public static double areaCalc(String x , String y) {
		double l = Double.parseDouble(x);
		double w = Double.parseDouble(y);
		
		return l * w;
	}

	public static double perimCalc(String x, String y) {
		double l = Double.parseDouble(x);
		double w = Double.parseDouble(y);
		
		return 2*l + 2*w;
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String len = txt.getText();
		String wid = txt1.getText();
	
		try {
			areaLB.setText("Area: " + areaCalc(len,wid));
		}catch(NumberFormatException e1){
			areaLB.setText("Area: Error ");
		}
		
	}
	
	
	public void actionPerformed1(ActionEvent e){
		String len = txt.getText();
		String wid = txt1.getText();
		
		try {
			perimLB.setText("Perimeter: " + perimCalc(len,wid));
		} catch(NumberFormatException e2){
			perimLB.setText("Perimeter: Error");
		}
		
	}
}