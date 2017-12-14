package AdvanceClac;

/**
 * 
 * @author Amir
 * @version 1.0
 * This is my superclass CalculationAdavanceOperationInterface that implements the interface calculatorMain
 */

public class CalculationAdavanceOperationInterface implements AdvanceInterface {

	/**
	 * auto generated method to count sin
	 * @param firstNumber
	 *  double value
	 * @return returning double value result from method
	 */
	public double sin(double firstNumber) {
		double valueRadians = Math.toRadians(firstNumber);
		return Math.sin(valueRadians);
	}

	/**
	 * auto generated method to count cos
	 * @param firstNumber
	 * double value
	 * @return returning double value result from method
	 */
	public double cos(double firstNumber) {
		double valueRadians = Math.toRadians(firstNumber);
		return Math.cos(valueRadians);
	}

	/**
	 * auto generated method to count squ
	 * @param firstNumber
	 * double value
	 * @return returning double value result from method
	 */
	public double squ(double firstNumber) {
		return Math.pow(firstNumber, 2);
	}

	/**
	 * auto generated method to count cub
	 * @param firstNumber
	 *  double value
	 * @return returning double value result from method
	 */
	public double cub(double firstNumber) {
		return Math.pow(firstNumber, 3);
	}

	/**
	 * auto generated method to count e
	 * @param constant
	 * e
	 * @return 2.7182818284590455
	 */
	public double e() {
		return 2.7182818284590455;
	}

	/**
	 * auto generated method to count squrt
	 * @param firstNumber
	 *            double value
	 * @return returning double value result from method
	 */
	public double squrt(double firstNumber) {
		return Math.sqrt(firstNumber);
	}

}
