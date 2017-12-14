package SimpleTest;

import SimpleCalc.CalculationBasicOperationInterface;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

import org.junit.Test;

public class SimpleTest {

	CalculationBasicOperationInterface co = new CalculationBasicOperationInterface();
	private final static Logger LOG = Logger.getLogger(CalculationBasicOperationInterface.class.getName());
	Scanner s = new Scanner(System.in);
	Random rand = new Random();

	@Test
	public void positivAddtionTest() {
		double firstNumber = 4;
		double secondNumber = 40;
		double result = 0;
		for (int i = 0; i < 50; i++) {
			firstNumber = rand.nextDouble() * 50;
			secondNumber = rand.nextDouble() * 50;
			result = firstNumber + secondNumber;
			LOG.info("Testing the method add with: " + result);
			assertEquals(co.addition(firstNumber, secondNumber), result, 1);
		}
	}

	@Test
	public void positivSubtratctioTest() {
		double firstNumber = 30;
		double secondNumber = 20;
		double result = 0;
		for (int i = 0; i < 50; i++) {
			firstNumber = rand.nextDouble() * 50;
			secondNumber = rand.nextDouble() * 50;
			result = firstNumber - secondNumber;
			LOG.info("Testing the method add with: " + result);
			assertEquals(co.sub(firstNumber, secondNumber), result, 1);

		}
	}

	@Test
	public void positivMultTest() {
		double firstNumber = 10;
		double secondNumber = 20;
		double result = 0;
		for (int i = 0; i < 50; i++) {
			firstNumber = rand.nextDouble() * 50;
			secondNumber = rand.nextDouble() * 50;
			result = firstNumber * secondNumber;
			LOG.info("Testing the method add with: " + result);
			assertEquals(co.mult(firstNumber, secondNumber), result, 1);

		}
	}

	@Test
	public void positivDivTest() {
		double firstNumber = 30;
		double secondNumber = 40;
		double result = 0;
		for (int i = 0; i < 50; i++) {
			firstNumber = rand.nextDouble() * 50;
			secondNumber = rand.nextDouble() * 50;
			result = firstNumber / secondNumber;
			LOG.info("Testing the method add with: " + result);
			assertEquals(co.div(firstNumber, secondNumber), result, 1);
		}
	}
	
	
	@Test
	public void positivDivByZero() {
		double firstNumber = 30;
		double secondNumber = 0;
		double result = -0.123456789;
		LOG.info("Testing the method add with: " + result);
		assertEquals(co.div(firstNumber, secondNumber), result, 1);
		
	}

	@Test
	public void negativAddtionTest() {
		double firstNumber = -4;
		double secondNumber = -40;
		double result = 0;
		for (int i = 0; i < 50; i++) {
			firstNumber = rand.nextDouble() * -50;
			secondNumber = rand.nextDouble() * -50;
			result = firstNumber + secondNumber;
			LOG.info("Testing the method add with: " + result);
			assertEquals(co.addition(firstNumber, secondNumber), result, 1);
		}
	}

	@Test
	public void negativSubtratctioTest() {
		double firstNumber = -30;
		double secondNumber = -20;
		double result = 0;
		for (int i = 0; i < 50; i++) {
			firstNumber = rand.nextDouble() * -50;
			secondNumber = rand.nextDouble() * -50;
			result = firstNumber - secondNumber;
			LOG.info("Testing the method add with: " + result);
			assertEquals(co.sub(firstNumber, secondNumber), result, 1);

		}
	}

	@Test
	public void negativMultTest() {
		double firstNumber = -10;
		double secondNumber = -20;
		double result = 0;
		for (int i = 0; i < 50; i++) {
			firstNumber = rand.nextDouble() * -50;
			secondNumber = rand.nextDouble() * -50;
			result = firstNumber * secondNumber;
			LOG.info("Testing the method add with: " + result);
			assertEquals(co.mult(firstNumber, secondNumber), result, 1);

		}
	}

	@Test
	public void negativDivTest() {
		double firstNumber = -30;
		double secondNumber = -40;
		double result = 0;
		for (int i = 0; i < 50; i++) {
			firstNumber = rand.nextDouble() * -50;
			secondNumber = rand.nextDouble() * -50;
			result = firstNumber / secondNumber;
			LOG.info("Testing the method add with: " + result);
			assertEquals(co.div(firstNumber, secondNumber), result, 1);
		}
	}

}