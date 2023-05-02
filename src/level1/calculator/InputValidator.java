package level1.calculator;

class InputValidator {
	public boolean isValidNumber(String input) {
		try {
			Double.parseDouble(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
