import javax.swing.*;

import java.awt.event.*;

// New event listener that monitors changing values for components

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// Allows me to format the numbers

import java.text.NumberFormat;

// Allows me to edit borders on panels

import javax.swing.border.*;


public class Lesson22 extends JFrame{
	
	JButton button1;
	JLabel label1, label2, label3, label4, label5, label6, label7;
	JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7;
	JCheckBox dollarSign, commaSeparator;
	JRadioButton freshmanNums, sophomoreNums, juniorNums, seniorNums;
	JSlider howManyTimes;
	JTextArea textArea1;
	
	double number1, number2, number3, number4, number5, totalCalc;
	
	public static void main(String[] args){
		
		new Lesson22();
		
	}
	
	public Lesson22(){
		
		// Define the size of the frame
		
		this.setSize(350, 400);
				
		// Opens the frame in the middle of the screen
		
		this.setLocationRelativeTo(null);
		
		// Define how the frame exits (Click the Close Button)
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		// Define the title for the frame
				
		this.setTitle("Student");
				
		// The JPanel contains all of the components for your frame
				
		JPanel thePanel = new JPanel();
		
		// ---------------------------------------------------------
		
		
		// How to add a label --------------------------
		
		label6 = new JLabel("Student Name");
		
		thePanel.add(label6);
				
		// How to add a text field ----------------------
				
		textField6 = new JTextField("", 20);
						
		thePanel.add(textField6);
		
		// How to add a label --------------------------
		
		label1 = new JLabel("Unit 1 Test");
		
		thePanel.add(label1);
				
		// How to add a text field ----------------------
				
		textField1 = new JTextField("", 5);
						
		thePanel.add(textField1);
		
		// How to add a label --------------------------
		
		label2 = new JLabel("Unit 2 Test");
				
		thePanel.add(label2);
						
		// How to add a text field ----------------------
						
		textField2 = new JTextField("", 5);
								
		thePanel.add(textField2);
		
		// How to add a label --------------------------
		
		label3 = new JLabel("Unit 3 Test");
		
		thePanel.add(label3);
				
		// How to add a text field ----------------------
				
		textField3 = new JTextField("", 5);
						
		thePanel.add(textField3);
		
		// How to add a label --------------------------
		
		label4 = new JLabel("Unit 4 Test");
		
		thePanel.add(label4);
				
		// How to add a text field ----------------------
				
		textField4 = new JTextField("", 5);
						
		thePanel.add(textField4);
		
		// How to add a label --------------------------
		
		label5 = new JLabel("Unit 5 Test");
		
		thePanel.add(label5);
				
		// How to add a text field ----------------------
				
		textField5 = new JTextField("", 5);
						
		thePanel.add(textField5);
		
		// How to add checkboxes ------------------------
		
		//dollarSign = new JCheckBox("Dollars"); 
		///commaSeparator = new JCheckBox("Commas");
		
		//thePanel.add(dollarSign);
		
		// By putting true in here it is selected by default
		
		//thePanel.add(commaSeparator, true);

		// Creates radio buttons with default labels
		
		freshmanNums = new JRadioButton("Freshman");
		sophomoreNums = new JRadioButton("Sophomore");
		juniorNums = new JRadioButton("Junior");
		seniorNums = new JRadioButton("Senior");
		
		// Creates a group that will contain radio buttons
		// You do this so that when 1 is selected the others
		// are deselected
		
		ButtonGroup operation = new ButtonGroup();
		
		// Add radio buttons to the group
		
		operation.add(freshmanNums);
		operation.add(sophomoreNums);
		operation.add(juniorNums);
		operation.add(seniorNums);
		
		// Create a new panel to hold radio buttons
		
		JPanel operPanel = new JPanel();
		
		// Surround radio button panel with a border
		// You can define different types of borders
		// createEtchedBorder, createLineBorder, createTitledBorder
		// createLoweredBevelBorder, createRaisedBevelBorder
		
		Border operBorder = BorderFactory.createTitledBorder("Operation");
		
		// Set the border for the panel
		
		operPanel.setBorder(operBorder);
		
		// Add the radio buttons to the panel
		
		operPanel.add(freshmanNums);
		operPanel.add(sophomoreNums);
		operPanel.add(juniorNums);
		operPanel.add(seniorNums);
		
		// Selects the add radio button by default
		
		freshmanNums.setSelected(true);
		
		// Add the panel to the main panel
		// You don't add the group
		
		thePanel.add(operPanel);
		
		/* How to create a slider ----------------
		
		label3 = new JLabel("Perform How Many Times?");
		
		thePanel.add(label3);
		
		// Creates a slider with a min value of 0 thru 99
		// and an initial value of 1
		
		howManyTimes = new JSlider(0, 99, 1);
		
		// Defines the minimum space between ticks
		
		howManyTimes.setMinorTickSpacing(1);
		
		// Defines the minimum space between major ticks
		
		howManyTimes.setMajorTickSpacing(10);
		
		// Says to draw the ticks on the slider
		
		howManyTimes.setPaintTicks(true);
		
		// Says to draw the tick labels on the slider
		
		howManyTimes.setPaintLabels(true);
		
		// Create an instance of ListenForEvents to handle events
		
		ListenForSlider lForSlider = new ListenForSlider();
				
		// Tell Java that you want to be alerted when an event
		// occurs on the slider
				
		howManyTimes.addChangeListener(lForSlider);
		
		thePanel.add(howManyTimes);
		
		*/
		
		// Create a button with Click Here on it
		
		button1 = new JButton("Calculate");
				
		// Create an instance of ListenForEvents to handle events
				
		ListenForButton lForButton = new ListenForButton();
				
		// Tell Java that you want to be alerted when an event
		// occurs on the button
		
				
		button1.addActionListener(lForButton);
				
		thePanel.add(button1);
		
		
		// How to add a label --------------------------
		
		label5 = new JLabel("Test Average");
		
		thePanel.add(label5);
				
		// How to add a text field ----------------------
				
		textArea1 = new JTextArea(1, 5);
						
		thePanel.add(textArea1);
		
		
		
		this.add(thePanel);
		
		this.setVisible(true);
		
		// Gives focus to the textfield
		
		textField1.requestFocus();
		
	}
	
	private class ListenForButton implements ActionListener{
		
		// This method is called when an event occurs
		
		public void actionPerformed(ActionEvent e){
			
			// Check if the source of the event was the button
			
			if(e.getSource() == button1){
				try{
			    number1 = Double.parseDouble(textField1.getText());
				number2 = Double.parseDouble(textField2.getText());
				number3 = Double.parseDouble(textField3.getText());
				number4 = Double.parseDouble(textField4.getText());
				number5 = Double.parseDouble(textField5.getText());
			        textArea1.append(average(number1, number2, number3, number4, number5) + "");
			     }
			        //getText returns a String so you have to parse it
				// into a double in this situation
				
				/*try{
					number1 = Double.parseDouble(textField1.getText());
					number2 = Double.parseDouble(textField2.getText());
				}*/
				
				catch(NumberFormatException excep){
					
					// JOptionPane displays a popup on the screen
					// (parentComponent, message, title, error icon)
					// Error Icons: WARNING_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE
					
					JOptionPane.showMessageDialog(Lesson22.this, "Please Enter the Right Info", "Error", JOptionPane.ERROR_MESSAGE);
					System.exit(0); // Closes the Java app
				}
				 
				/*
				if(addNums.isSelected()) { totalCalc = addNumbers(number1, number2, howManyTimes.getValue()); 
				
				} else if(subtractNums.isSelected()) { totalCalc = subtractNumbers(number1, number2, howManyTimes.getValue()); 

				} else if(multNums.isSelected()) { totalCalc = multiplyNumbers(number1, number2, howManyTimes.getValue()); 
				
				} else { totalCalc = divideNumbers(number1, number2, howManyTimes.getValue()); }
				
				// If the dollar is selected in the checkbox print the number as currency
				
				if(dollarSign.isSelected()) {
					
					// Defines that you want to format a number with $ and commas
					
					NumberFormat numFormat = NumberFormat.getCurrencyInstance();
					
					JOptionPane.showMessageDialog(Lesson22.this, numFormat.format(totalCalc), "Solution", JOptionPane.INFORMATION_MESSAGE);
					
				} 
				
				// If the comma is selected in the checkbox print the number with commas
				
				else if(commaSeparator.isSelected()) {
					
					// Defines that you want to format a number with commas
					
					NumberFormat numFormat = NumberFormat.getNumberInstance();
					
					JOptionPane.showMessageDialog(Lesson22.this, numFormat.format(totalCalc), "Solution", JOptionPane.INFORMATION_MESSAGE);
					
				} else {
				
				JOptionPane.showMessageDialog(Lesson22.this, totalCalc, "Solution", JOptionPane.INFORMATION_MESSAGE);
				
				}*/
					
			}
			
		}
		
	}
	
	// Implements ActionListener so it can react to events on components
	
		/*private class ListenForSlider implements ChangeListener{

			@Override
			public void stateChanged(ChangeEvent e) {
				
				// Check if the source of the event was the button
				
				if(e.getSource() == howManyTimes){
					
					label3.setText("Perform How Many Times? " + howManyTimes.getValue() );
					
						
				}
				
			}
		
		
		
		}*/
		
		public static double average(double number1, double number2, double number3, 
		double number4, double number5)
		{
		    double avg = (number1 + number2 + number3 + number4 + number5)/5;
		    
		    return avg;
		  }
		  
		/*public static double addNumbers(double number1, double number2, int howMany){
			
			double total = 0;
			
			int i = 1;
			
			while(i <= howMany){
				total = total + (number1 + number2);
				i++;
			}
			
			return total;
			
		}
		
		public static double subtractNumbers(double number1, double number2, int howMany){
			
			double total = 0;
			
			int i = 1;
			
			while(i <= howMany){
				total = total + (number1 - number2);
				i++;
			}
			
			return total;
			
		}
		
		public static double multiplyNumbers(double number1, double number2, int howMany){
			
			double total = 0;
			
			int i = 1;
			
			while(i <= howMany){
				total = total + (number1 * number2);
				i++;
			}
			
			return total;
			
		}
		
		public static double divideNumbers(double number1, double number2, int howMany){
			
			double total = 0;
			
			int i = 1;
			
			while(i <= howMany){
				total = total + (number1 / number2);
				i++;
			}
			
			return total;
			
		}*/
	
}