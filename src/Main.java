
public class Main {
	public static void main (String[] args) {
		CalculatorView view = new CalculatorView ();
		Calculator calculator = new Calculator ();
		CalculatorController controller = new CalculatorController (calculator, view);
		
		System.out.println(controller.getInput ());
	}
}
