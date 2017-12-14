package SimpleCalc;

public class CalculationBasicOperationInterface implements calculatorMain {

	/**
	 * two attributes  
	 * 
	 */
	public int firstNumber;
	public int secondNumber;

	
	/**
	 * auto generated method to count addition
	 * @param firstNumber and second Number
	  * double firstNumber and double secondNumber
	 * @return returning double value result from method
	 */
	public double addition(double firstNumber, double secondNumber) {
		double result=firstNumber + secondNumber;
		return result;
	}
	/**
	 * auto generated method to count subtraction
	 * @param  firstNumber and second Number
	 * double firstNumber and double secondNumber
	 * @return returning double value result from method
	 */

	public double sub(double firstNumber, double secondNumber) {
		double result=firstNumber - secondNumber;
		return result;
	}
	/**
	 * auto generated method to count multiplication
	 * @param  firstNumber and second Number
	 * double firstNumber and double secondNumber
	 * @return returning double value result from method
	 */

	public double mult(double firstNumber, double secondNumber) {
		double result=firstNumber * secondNumber;
		return result;
	}
	/**
	 * auto generated method to count division
	 * @param  firstNumber and second Number
	 * double firstNumber and double secondNumber
	 * @return returning double value result from method
	 */

	public double div(double firstNumber, double secondNumber) {
		if (secondNumber == 0) {
			return -0.123456789;
		}
			
		return firstNumber / secondNumber;
		
	}
}