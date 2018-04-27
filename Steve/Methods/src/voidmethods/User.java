package voidmethods;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User extends JFrame implements ActionListener {

	
	
	public static void input(JFrame gui){
		gui.setTitle("Making a Test U.I.");
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setLocationRelativeTo(null);
		gui.setSize(400,300);
		
		gui.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input(new JFrame());
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
