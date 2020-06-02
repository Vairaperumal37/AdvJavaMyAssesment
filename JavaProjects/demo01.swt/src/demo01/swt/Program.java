package demo01.swt;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Program {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Display display = new Display();
        Shell shell = new Shell(display);   
        shell.setText("Hello");
        
        Button button = new Button(shell, 0);
        button.setText("Hello");
        button.setBounds(10, 10, 100, 200);
		shell.setVisible(true);
		
		
		
		while(!shell.isDisposed())
		{
			if (!display.readAndDispatch())
			{
				display.sleep();
			}
		}
		System.out.println();
	}

}
