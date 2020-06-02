package awtcomponents.calculatorapp;


import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import awtcomponents.calculatorapp.models.CalculatoSpecialOperatorClickListner;

public class specialOperatorPanel extends Panel implements ActionListener {

	CalculatoSpecialOperatorClickListner specialoperatorListner;
	
	public CalculatoSpecialOperatorClickListner getSpecialOperatorListner() {
		return specialoperatorListner;
	}

	public void setSpecialOperatorListner(CalculatoSpecialOperatorClickListner specialoperatorListner) {
		this.specialoperatorListner = specialoperatorListner;
	}

	public specialOperatorPanel() {
	
		this.setLayout(new GridLayout(1,3));		
		String [] values= {"C","AC","<-"};
		
		for(String value :values) {
				Button button=new Button(value);
				button.setSize(60,40);
				this.add(button);
				button.addActionListener(this);
		}
			
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String value=e.getActionCommand().trim();
		//System.out.println("Operator '"+value+"'");
		specialoperatorListner.specialoperatorClicked(value);
		
	}
	
	
	
	
}
