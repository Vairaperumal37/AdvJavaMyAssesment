package swt.ToDOManager;

import org.eclipse.swt.widgets.Shell;

import com.swtcomponents.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application
				.instance
				.setTitle("Todo Manager")
				.build(new TodoMainScreen())
				//.packShell()
				.center()				
				.run();
		
	}

}
