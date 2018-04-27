import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;


public class Converter extends Applet implements ActionListener{

	Label cel;
	Label con;
	TextField t;
	Button conB;
	Button conB1;
	

	public void init() {
		setLayout(null);
		
		cel = new Label("Input");
		add(cel);
		cel.setLocation(10, 10);
		cel.setSize(80, 20);
		
		t = new TextField();
		add(t);
		t.setLocation(10,30);
		t.setSize(80, 20);
		
		conB = new Button("Celsius");
		add(conB);
		conB.setLocation(10, 60);
		conB.setSize(80, 20);
		
		
		con = new Label("Convert: ");
		add(con);
		con.setLocation(10, 80);
		con.setSize(80, 20);
		
		
		conB1 = new Button("Farenheit");
		add(conB1);
		conB1.setLocation(10, 110);
		conB1.setSize(80, 20);
		
		conB.addActionListener(this);
		conB1.addActionListener(this);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
		double x = Double.parseDouble(t.getText());
		double y = x*1.8+32;
		if(e.getActionCommand().equals(conB)) {
			y = (x-32)/1.8;
			con.setText("Celcuis: " + y);
		}
		else {con.setText("Farenheit: " + y);}
		
		}
		catch(NumberFormatException e1) {
			con.setText("Error input integer");
		}
	}
	
	
	
	
}
