package Main;

import java.lang.Math;

public class AdvancedCalculator extends BasicCalculator implements AdvancedCalculatorInterface {

	/*@Override
	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	@Override
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber ;
	}

	@Override
	public double division(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
	}
*/

	public double squareroot(double number) {
		return Math.sqrt(number);
	}

	
	public double raisedToThePowerOf(double base, double exponent) {
		return Math.pow(base, exponent);
	}


	public double absoluteValue(double number) {
		return Math.abs(number);
	}


	public double square(double number) {
		return Math.pow(number, 2);
	}


	public double cube(double number) {
		return Math.pow(number, 3);
	}

}
