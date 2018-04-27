
import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RecGuiNew extends Applet implements ActionListener {

	Label lenL;			TextField txt;
	Label widL;			TextField txt1;
	Label arL;			TextField txt2;
	Label radiusLB;		Button    btnA;
	Label pemL;			Button    btnP;	
	
	public void init(){
		setLayout(null);
		
		lenL = new Label("Length");
		add(lenL);
		lenL.setLocation(10,10);
		lenL.setSize(80, 20);
		
		txt = new TextField();
		add(txt);
		txt.setLocation(10, 30);
		txt.setSize(80, 20);
		
		widL = new Label("Width");
		add(widL);
		widL.setLocation(10,50);
		widL.setSize(80, 20);
		
		txt1 = new TextField();
		add(txt1);
		txt1.setLocation(10, 70);
		txt1.setSize(80, 20);
		
		arL = new Label("Value: ");
		add(arL);
		arL.setForeground(Color.CYAN);
		arL.setLocation(10,90);
		arL.setSize(250, 20);
		
		radiusLB = new Label("Radius");
		add(radiusLB);
		radiusLB.setLocation(10,110);
		radiusLB.setSize(80,20);
		
		txt2 = new TextField();
		add(txt2);
		txt2.setLocation(10,130);
		txt2.setSize(80,20);

		btnA = new Button("Find Area");
		add(btnA);
		btnA.setLocation(10, 150);
		btnA.setSize(80, 20);
		
		btnP = new Button("Find Perimeter");
		add(btnP);
		btnP.setLocation(10, 180);
		btnP.setSize(90, 20);

		
		Button areaBtn = new Button("Find Area Cricle");
		add(areaBtn);
		areaBtn.setLocation(10,210);
		areaBtn.setSize(90,25);
	
		btnA.addActionListener(this);
		btnP.addActionListener(this);
		areaBtn.addActionListener(this);
	
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try{
		int x = Integer.parseInt(txt.getText());
		int y = Integer.parseInt(txt1.getText());	
		Double rad = Double.parseDouble(txt2.getText());
		
		if(e.getActionCommand().equals("Find Area")){
			arL.setForeground(Color.BLUE);
			arL.setText("Area: " + area(x,y));
		}else if (e.getActionCommand().equals("Find Area Cricle")) {
			arL.setForeground(Color.ORANGE);
			double area = Math.PI * (rad*rad);
			arL.setText("Area of Circle: " + area);
		}
		else{
			arL.setForeground(Color.GREEN);
			arL.setText("Perimeter: " + perim(x,y));
		}}catch(NumberFormatException e1){
			arL.setForeground(Color.RED);
			arL.setText("Error check inputs!!!"); }
		
	}
	public int area(int x, int y){
		return x*y;
	}
	public int perim(int x, int y){
		return 2*x+2*y;
	}
	}