

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumGui extends Applet implements ActionListener {

	Label aL;				TextField txt;
	Label bL;				TextField txt1;
	Label cL;				TextField txt2;
	Label dL;				TextField txt3;
	Label eL;				TextField txt4;
	Label fL;				TextField txt5;
	Label sumL;
	//ScrollPane scroll;
	
	public void init(){
		
		setLayout(null);
	
		aL = new Label("A:");
		add(aL);
		aL.setLocation(10, 10);
		aL.setSize(80, 20);
		
		txt = new TextField();
		add(txt);
		txt.setLocation(10, 30);
		txt.setSize(80,20);
		
		
		bL = new Label("B:");
		add(bL);
		bL.setLocation(10, 50);
		bL.setSize(80, 20);
		
		txt1 = new TextField();
		add(txt1);
		txt1.setLocation(10, 70);
		txt1.setSize(80,20);
		
		cL = new Label("C:");
		add(cL);
		cL.setLocation(10, 90);
		cL.setSize(80, 20);
		
		txt2 = new TextField();
		add(txt2);
		txt2.setLocation(10, 110);
		txt2.setSize(80,20);

		dL = new Label("D:");
		add(dL);
		dL.setLocation(10, 130);
		dL.setSize(80, 20);
		
		txt3 = new TextField();
		add(txt3);
		txt3.setLocation(10, 150);
		txt3.setSize(80,20);

		eL = new Label("E:");
		add(eL);
		eL.setLocation(10, 170);
		eL.setSize(80, 20);
		
		txt4 = new TextField();
		add(txt4);
		txt4.setLocation(10, 190);
		txt4.setSize(80,20);

		fL = new Label("F:");
		add(fL);
		fL.setLocation(10, 210);
		fL.setSize(80, 20);
		
		txt5 = new TextField();
		add(txt5);
		txt5.setLocation(10, 230);
		txt5.setSize(80,20);

		sumL = new Label("Sum: ");
		add(sumL);
		sumL.setForeground(Color.BLUE);
		sumL.setLocation(10, 250);
		sumL.setSize(250,20);
		
		Button btn = new Button("Sum:");
		add(btn);
		btn.setLocation(10, 270);
		btn.setSize(80,20);
		
		btn.addActionListener(this);
		
		/*
		scroll = new ScrollPane(Scrollbar.VERTICAL);
		scroll.setBounds(30, 20, 40, 80);
		add(scroll);
		MouseListener mouseListener = null;
		scroll.addMouseListener(mouseListener);
		*/
		
	}
		public static int sumA(int [] x, int last){
		
			if(last==-1) return 0;
			else return  sumA(x,last-1)+ x[last];
		}
	
	@Override
	public void actionPerformed(ActionEvent e1) {
		// TODO Auto-generated method stub
		
		sumL.setForeground(Color.BLUE);
		try{
		int a = Integer.parseInt(txt.getText());
		int b = Integer.parseInt(txt1.getText());
		int c = Integer.parseInt(txt2.getText());
		int d = Integer.parseInt(txt3.getText());
		int e = Integer.parseInt(txt4.getText());
		int f = Integer.parseInt(txt5.getText());
		
		int []x = {a,b,c,d,e,f};
		
		sumL.setText("Sum: " + sumA(x,x.length-1));
		}catch(NumberFormatException e){
			sumL.setForeground(Color.RED);
			sumL.setText("Error try again!!!");
		}
	}

	

}
