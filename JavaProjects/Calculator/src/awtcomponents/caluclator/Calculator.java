package awtcomponents.caluclator;

import java.awt.*;
import java.awt.event.ActionListener;

public class Calculator extends Frame {

	public Calculator()
	{
		createDesign();
	}

	Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,Quit;
	TextField valueTextFiled;

	private void createDesign() {
		setLayout(new FlowLayout());
		this.setTitle("Calculator");
		valueTextFiled = new TextField(20);
		this.add(valueTextFiled);

		setLayout(new GridLayout(4,4));
		bt1 = new Button("1");
		bt2 = new Button("2");
		bt3 = new Button("3");
		bt4 = new Button("4");
		bt5 = new Button("5");
		bt6 = new Button("6");
		bt7 = new Button("7");
		bt8 = new Button("8");
		bt9 = new Button("9");
		bt10 = new Button("0");
		bt11 = new Button("+");
		bt12 = new Button("-");
		bt13 = new Button("*");
		bt14 = new Button("%");
		bt15 = new Button("=");
		Quit = new Button("Quit");


		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);
		this.add(bt7);
		this.add(bt8);
		this.add(bt9);
		this.add(bt10);
		this.add(bt11);
		this.add(bt12);
		this.add(bt13);
		this.add(bt14);
		this.add(bt15);
		this.add(Quit);
		
        ActionHandler action =new ActionHandler(bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,valueTextFiled);
        bt1.addActionListener(action);
        bt2.addActionListener(action);
        bt3.addActionListener(action);
        bt4.addActionListener(action);
        bt5.addActionListener(action);
        bt6.addActionListener(action);
        bt7.addActionListener(action);
        bt8.addActionListener(action);
        bt9.addActionListener(action);
        bt10.addActionListener(action);
        bt11.addActionListener(action);
        bt12.addActionListener(action);
        bt13.addActionListener(action);
        bt14.addActionListener(action);
        bt15.addActionListener(action);
        valueTextFiled.addActionListener(action);

		invalidate();
				
		Quit.addActionListener(new QuitButtonHandler());

		setSize(300, 300);
	}
}
