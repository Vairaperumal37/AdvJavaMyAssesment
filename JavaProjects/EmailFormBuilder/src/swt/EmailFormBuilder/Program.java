package swt.EmailFormBuilder;

import org.eclipse.swt.widgets.Shell;

import com.swtcomponents.*;

public class Program {

	public static void main(String[] args) {

		Application
			.instance
			.setTitle("Email Composer")
			.build(new EmailFormBuilder())
			.run();
	}

}
