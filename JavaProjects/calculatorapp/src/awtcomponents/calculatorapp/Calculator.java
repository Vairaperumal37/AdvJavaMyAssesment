package awtcomponents.calculatorapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Calculator {

	
	Window calculatorWindow;
	DisplayPanel displayPanel;
	DigitPanel digitPanel;
	OperatorPanel operatorPanel;
	CalculatorBrain calculatorBrain;
	specialOperatorPanel specialOperatorPanel;
	
	
	
	public Calculator(String title) {
		// TODO Auto-generated constructor stub
		
		buildUi(title);
	}
	
	

	private void buildUi(String title) {
		// TODO Auto-generated method stub
		calculatorWindow=new Window(title);
		calculatorWindow.setLayout(new BorderLayout());

		calculatorBrain=new CalculatorBrain();
		
		
		displayPanel=new DisplayPanel();
		//calculatorWindow.add(displayPanel, BorderLayout.NORTH);
		
		
		digitPanel=new DigitPanel();
		digitPanel.setDigitClickListner(calculatorBrain); //inform calculator brain that digit is clicked
		calculatorWindow.add(digitPanel,BorderLayout.CENTER);
		
		operatorPanel=new OperatorPanel();
		operatorPanel.setOperatorListner(calculatorBrain); //inform calculator brain that operator is clicked
		calculatorWindow.add(operatorPanel,BorderLayout.EAST);
		
		specialOperatorPanel=new specialOperatorPanel();
		specialOperatorPanel.setSpecialOperatorListner(calculatorBrain); //inform calculator brain that operator is clicked
		calculatorWindow.add(specialOperatorPanel,BorderLayout.NORTH);
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(2,2));
		p1.add(displayPanel);
		p1.add(specialOperatorPanel);
		calculatorWindow.add(p1,BorderLayout.NORTH);
		
		calculatorBrain.setDisplayChangeListner(displayPanel);  //display panel will recieve display changes
		
		
	}

	public void start() {
		// TODO Auto-generated method stub
		calculatorWindow.setSize(350,350);
		calculatorWindow.setVisible(true);
	}

}
