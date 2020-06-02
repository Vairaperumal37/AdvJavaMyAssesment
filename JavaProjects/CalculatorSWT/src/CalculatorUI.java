
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.swtcomponents.*;


public class CalculatorUI implements UIBuilder {
	
	ControlBuilder builder;
	
	public void build(Composite parent) {
		
		parent.setSize(400, 500);
        
		GridLayout layout=new GridLayout();	
		layout.numColumns=4;
		layout.makeColumnsEqualWidth =true;
		parent.setLayout(layout);
		
		Text TextBox = new Text(parent,SWT.TOP|SWT.RIGHT);
		TextBox.setText("0");
		
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.widthHint = 300;
		gridData.heightHint = 20; 
		gridData.horizontalSpan = 4;
		TextBox.setLayoutData(gridData);
		
		String [] values= {"MC","M+","%","*","7","8","9","-","4","5","6","+","1","2","3","=","0","."};

		
		builder=new ControlBuilder(parent);
		Button button =null;

		for(int i=0;i<values.length;i++)
		{
			if(!(values[i] == "0" || values[i] == "="))
			{
		builder
		.button(values[i])
		.background(0, 0, 0)
		.foreground(192, 192, 192)
		.setLayoutData(
				Grid
					.data().stretch()
					.get()
			);
		
		/*
		 * button.setText(values[i]); button.setBackground(color);
		 */
			}
			else if(values[i] == "0")
			{
				builder
				.button(values[i])
				.background(0, 0, 0)
				.foreground(192, 192, 192)
				.setLayoutData(
						Grid
							.data().stretch().hspan(2)
							.get()
					);
			}
			else if(values[i] == "=")
			{
				builder
				.button(values[i])
				.background(0, 0, 0)
				.foreground(192, 192, 192)
				.setLayoutData(
						Grid
						.data().stretch().vspan(2)
						.get()
						);
			}
			/*
			 * button.addSelectionListener(new SelectionAdapter() {
			 * 
			 * public void widgetSelected(SelectionEvent e) { Button btn= (Button)
			 * e.getSource(); TextBox.setText(btn.getText()); } });
			 */
		}
		
		        parent.pack();
	}


}
