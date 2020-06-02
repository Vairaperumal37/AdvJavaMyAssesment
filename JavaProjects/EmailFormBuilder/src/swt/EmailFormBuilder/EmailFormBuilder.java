package swt.EmailFormBuilder;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.swtcomponents.*;

public class EmailFormBuilder implements UIBuilder {

	@Override
	public void build(Composite parent) {
		// TODO Auto-generated method stub
		
//		RowLayout layout=new RowLayout(SWT.VERTICAL);
//		layout.marginLeft=20;
//		layout.marginTop=20;
//		layout.spacing=20;
		
		
		FormLayout layout=new FormLayout();
		parent.setLayout(layout);
		
		
		//parent.setLayoutData(layout);
		
		ControlBuilder builder=new ControlBuilder(parent);
		
		
		Label fromLabel = builder.label("From").get(Label.class);
		Text fromTextBox = builder.text().get(Text.class);
		
		Label toLabel = builder.label("To").get(Label.class);
		Text toTextBox = builder.text().get(Text.class);
		
		Label subjectLabel = builder.label("Subject").get(Label.class);
		Text subjectTextBox = builder.text().get(Text.class);
		
		
		Label messageLabel = builder.label("Message").get(Label.class);
		Text messageTextBox = builder.text().get(Text.class);
		
		Button sendCopyCheckBox= builder.checkBox("Send Me A Copy").get(Button.class);
		
		Button sendButton=builder.button("Send").get(Button.class);
		
		
		
		//Let us arrange the control in FormLayout
		FormData fromLabelData=new FormData();
		fromLabelData.left=new FormAttachment(5); //10% from left border
		fromLabelData.top=new FormAttachment(5);   //5% from top border
		fromLabel.setLayoutData(fromLabelData);
		
		
		FormData fromTextBoxData=new FormData(200,20);
		fromTextBoxData.left=new FormAttachment(fromLabel, 20);  //a gap of 10% between label end and textbox start
		fromTextBoxData.top=new FormAttachment(5);
		fromTextBoxData.right=new FormAttachment(50); //60% gap
		fromTextBox.setLayoutData(fromTextBoxData);
		
		FormData toLabelData=new FormData();
		toLabelData.left=new FormAttachment(5); 
		toLabelData.top=new FormAttachment(15); 
		toLabel.setLayoutData(toLabelData);
		
		FormData toTextBoxData=new FormData(200,20);
		toTextBoxData.left=new FormAttachment(toLabel, 35); 
		toTextBoxData.top=new FormAttachment(15);
		toTextBoxData.right=new FormAttachment(50);
		toTextBox.setLayoutData(toTextBoxData);
				
		FormData subjectLabelData=new FormData();
		subjectLabelData.left=new FormAttachment(5); 
		subjectLabelData.top=new FormAttachment(25); 
		subjectLabel.setLayoutData(subjectLabelData);
		
		FormData subjectTextBoxData=new FormData(200,20);
		subjectTextBoxData.left=new FormAttachment(toLabel, 35); 
		subjectTextBoxData.top=new FormAttachment(25);
		subjectTextBoxData.right=new FormAttachment(50);
		subjectTextBox.setLayoutData(subjectTextBoxData);
		
		
		FormData messageLabelData=new FormData();
		messageLabelData.left=new FormAttachment(5); 
		messageLabelData.top=new FormAttachment(35); 
		messageLabel.setLayoutData(messageLabelData);
		
		FormData messageTextBoxData=new FormData(800,200);
		messageTextBoxData.left=new FormAttachment(5); 
		messageTextBoxData.top=new FormAttachment(40);
		messageTextBoxData.right=new FormAttachment(95);
		messageTextBox.setLayoutData(messageTextBoxData);
		
		
		
		FormData sendButtonData=new FormData(200,50);
		sendButtonData.right=new FormAttachment(95);
		sendButtonData.bottom=new FormAttachment(98);
		sendButton.setLayoutData(sendButtonData);
		
		FormData sendCopyCheckBoxData=new FormData(250,50);
		sendCopyCheckBoxData.left=new FormAttachment(5);
		sendCopyCheckBoxData.bottom=new FormAttachment(98);
		sendCopyCheckBox.setLayoutData(sendCopyCheckBoxData);			
				
		
	}

}
