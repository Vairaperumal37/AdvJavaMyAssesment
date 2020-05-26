package awtcomponents.caluclator;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener{

	String temp1,temp2,temp3,temp4,temp5;
	int action,value;
	private Button bt1;
	private Button bt2;
	private Button bt3;
	private Button bt4;
	private Button bt5;
	private Button bt6;
	private Button bt7;
	private Button bt8;
	private Button bt9;
	private Button bt10;
	private Button bt11;
	private Button bt12;
	private Button bt13;
	private Button bt14;
	private TextField valueTextFiled;
	private Button bt15;

	public ActionHandler(Button bt1,Button bt2,Button bt3,Button bt4,Button bt5,Button bt6,
			Button bt7,Button bt8,Button bt9,Button bt10,Button bt11,Button bt12,Button bt13,Button bt14, Button bt15,TextField valueTextFiled) {
		this.bt1 = bt1;
		this.bt2 = bt2;
		this.bt3 = bt3;
		this.bt4 = bt4;
		this.bt5 = bt5;
		this.bt6 = bt6;
		this.bt7 = bt7;
		this.bt8 = bt8;
		this.bt9 = bt9;
		this.bt10 = bt10;
		this.bt11 = bt11;
		this.bt12 = bt12;
		this.bt13 = bt13;
		this.bt14 = bt14;
		this.bt15 = bt15;
		this.valueTextFiled = valueTextFiled;
		
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == bt1)
		{
			temp1 =  valueTextFiled.getText();
			temp2 = "1";
			temp3 = temp1+temp2;
			valueTextFiled.setText(temp3);
		}
		if(e.getSource() == bt2)
		{
			temp1 =  valueTextFiled.getText();
			temp2 = "2";
			temp3 = temp1+temp2;
			valueTextFiled.setText(temp3);
		}
		if(e.getSource() == bt3)
		{
			temp1 =  valueTextFiled.getText();
			temp2 = "3";
			temp3 = temp1+temp2;
			valueTextFiled.setText(temp3);
		}
		if(e.getSource() == bt4)
		{
			temp1 =  valueTextFiled.getText();
			temp2 = "4";
			temp3 = temp1+temp2;
			valueTextFiled.setText(temp3);
		}
		if(e.getSource() == bt5)
		{
			temp1 =  valueTextFiled.getText();
			temp2 = "5";
			temp3 = temp1+temp2;
			valueTextFiled.setText(temp3);
		}
		if(e.getSource() == bt6)
		{
			temp1 =  valueTextFiled.getText();
			temp2 = "6";
			temp3 = temp1+temp2;
			valueTextFiled.setText(temp3);
		}
		if(e.getSource() == bt7)
		{
			temp1 =  valueTextFiled.getText();
			temp2 = "7";
			temp3 = temp1+temp2;
			valueTextFiled.setText(temp3);
		}
		if(e.getSource() == bt8)
		{
			temp1 =  valueTextFiled.getText();
			temp2 = "8";
			temp3 = temp1+temp2;
			valueTextFiled.setText(temp3);
		}
		if(e.getSource() == bt9)
		{
			temp1 =  valueTextFiled.getText();
			temp2 = "9";
			temp3 = temp1+temp2;
			valueTextFiled.setText(temp3);
		}
		if(e.getSource() == bt10)
		{
			temp1 =  valueTextFiled.getText();
			temp2 = "0";
			temp3 = temp1+temp2;
			valueTextFiled.setText(temp3);
		}
		if(e.getSource() == bt11)
		{
			temp4 =  valueTextFiled.getText();
			valueTextFiled.setText("");
			action = 1;
		}
		if(e.getSource() == bt12)
		{
			temp4 =  valueTextFiled.getText();
			valueTextFiled.setText("");
			action =2;
		}
		if(e.getSource() == bt13)
		{
			temp4 =  valueTextFiled.getText();
			valueTextFiled.setText("");
			action =3;
		}
		if(e.getSource() == bt14)
		{
			temp4 =  valueTextFiled.getText();
			valueTextFiled.setText("");
			action = 4;
		}
		if(e.getSource() == bt15)
		{
			temp5 =valueTextFiled.getText();
			if(action ==1)
			{
				value = Integer.parseInt(temp4)+Integer.parseInt(temp5);
				valueTextFiled.setText(String.valueOf(value));
			}
			if(action ==2)
			{
				value = Integer.parseInt(temp4)-Integer.parseInt(temp5);
				valueTextFiled.setText(String.valueOf(value));
			}
			if(action ==3)
			{
				value = Integer.parseInt(temp4)*Integer.parseInt(temp5);
				valueTextFiled.setText(String.valueOf(value));
			}
			if(action ==4)
			{
				value = Integer.parseInt(temp4)/Integer.parseInt(temp5);
				valueTextFiled.setText(String.valueOf(value));
			}
		}
	}

}
