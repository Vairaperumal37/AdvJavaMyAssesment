import com.swtcomponents.*;

public class Main {

	public static void main(String[] args) {
		Application
		.instance
		.setTitle("Calculator")
		.build(new CalculatorUI())
		.run();
	}

}
