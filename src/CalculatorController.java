
public class CalculatorController {
	private Calculator calculator;
	private CalculatorView view;
	
	public CalculatorController(Calculator calculator, CalculatorView view) {
		this.calculator = calculator;
		this.view = view;
	}
	
	/** Get user to input any String value.
	 *  
	 * @return
	 */
	public String getInput () {
		// TODO: Look up how to ask user for String input, then replace "aString" in the return statement with the String user inputs.
		return "aString";
	}
	
}
