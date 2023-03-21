/* This program is a simple representation of a GUI calculator
 * 
 * @author Mohammed
 * 
 * CIS 2571
 * Dr. Sam
 */
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class GUI_Calculator extends JFrame {
	
	private static final long serialVersionUID = 1L;

	//variables for the math
	double x, y;
	
	//creates the textfields
	JTextField first = new JTextField(10);
	JTextField second = new JTextField(10);
	JTextField equals = new JTextField(10);
	
	//creating buttons for the math operations
	JButton add = new JButton("Add");
	JButton sub = new JButton("Subtract");
	JButton mul = new JButton("Multiply");
	JButton div = new JButton("Divide");
	
	//Constructor - Creates a FlowLayout
	public GUI_Calculator() {
		//Creates the layout of the window
		setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));
		add(new JLabel("Number 1"));
		add(first);
		add(new JLabel("Number 2"));
		add(second);
		add(new JLabel("Result"));
		add(equals);
		equals.setEnabled(false); // Disable users to type in the result textfield
		add(add);
		add(sub);
		add(mul);
		add(div);
		
		
		//function for the add button
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Catches the String in the text field and convert to integers
				String number1 = first.getText();
				String number2 = second.getText();
				try {
				x = Double.parseDouble(number1);
				y = Double.parseDouble(number2);
				double result = x + y;
				String value = String.valueOf(result); // convert double to string
				equals.setText(value);
				}catch (Exception ex) {
					equals.setText("Incorrect Input!");
				}
			} // actionPerformed
		} // ActionListener
		); // add.addActionListener
		
		sub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String number1 = first.getText();
				String number2 = second.getText();
				try {
				x = Double.parseDouble(number1);
				y = Double.parseDouble(number2);
				double result = x - y;
				String value =String.valueOf(result); // convert double to string
				equals.setText(value);
				}catch (Exception ex) {
					equals.setText("Incorrect Input!");
				}
				
			}
		});
		
		mul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String number1 = first.getText();
				String number2 = second.getText();
				try {
				x = Double.parseDouble(number1);
				y = Double.parseDouble(number2);
				double result = x * y;
				String value =String.valueOf(result); // convert double to string
				equals.setText(value);
				}catch (Exception ex) {
					equals.setText("Incorrect Input!");
				}
			}
		});
		
		div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String number1 = first.getText();
				String number2 = second.getText();
				try {
				x = Double.parseDouble(number1);
				y = Double.parseDouble(number2);
				
				if(y == 0) {
					equals.setText("Can't / by Zero!");
				} else {
				double result = x / y;
				String value =String.valueOf(result); // convert double to string
				equals.setText(value);
			}	}catch (Exception ex) {
				equals.setText("Incorrect Input!");
			}		
			}
		});
		
	} // Constructor
	
//Main program to set the JFrame
	public static void main(String[] args) {
		GUI_Calculator frame = new GUI_Calculator();
		frame.setTitle("My Calculator");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(330,550);
		frame.setVisible(true);
	} // main
}
