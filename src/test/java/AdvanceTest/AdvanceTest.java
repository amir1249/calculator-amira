package AdvanceTest;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

import org.junit.Test;

import AdvanceClac.CalculationAdavanceOperationInterface;

public class AdvanceTest {

	CalculationAdavanceOperationInterface sc = new CalculationAdavanceOperationInterface();
	private final static Logger LOG = Logger.getLogger(CalculationAdavanceOperationInterface.class.getName());
	Scanner s = new Scanner(System.in);
	Random rand = new Random();

	@Test
	public void cosAdvance() {
		double value = 0;
		double result = 0;
		double valueRadians = 0;
		for (int i = 0; i < 50; i++) {
			value = rand.nextDouble() * 50;

			valueRadians = Math.toRadians(value);
			result = Math.cos(valueRadians);
			LOG.info("Testing the method add with: " + value);
			assertEquals(sc.cos(value), result, 0.1);

		}
	}

	@Test
	public void sinAdvancet() {
		double value = 0;
		double result = 0;
		double valueRadians = 0;
		for (int i = 0; i < 50; i++) {
			value = rand.nextDouble() * 50;
			valueRadians = Math.toRadians(value);
			result = Math.sin(valueRadians);
			LOG.info("Testing the method add with: " + value);
			assertEquals(sc.sin(value), result, 0.1);
		}
	}

	@Test
	public void squAdvance() {
		double value = 0;
		double result = 0;
		for (int i = 0; i < 50; i++) {
			value = rand.nextDouble() * 50;
			result = Math.pow(value, 2);
			LOG.info("Testing the method add with: " + value);
			assertEquals(sc.squ(value), result, 0.1);
		}
	}

	@Test
	public void cubAdvance() {
		double value = 0;
		double result = 0;
		for (int i = 0; i < 50; i++) {
			value = rand.nextDouble() * 50;
			result = Math.pow(value, 3);
			LOG.info("Testing the method add with: " + value);
			assertEquals(sc.cub(value), result, 0.1);
		}
	}

	@Test
	public void squrtAdvance() {
		double value = 0;
		double result = 0;
		for (int i = 0; i < 50; i++) {
			value = rand.nextDouble() * 50;
			result = Math.sqrt(value);
			LOG.info("Testing the method add with: " + value);
			assertEquals(sc.squrt(value), result, 0.1);
		}
	}

	@Test
	public void eAdvance() {

		for (int i = 0; i < 50; i++) {
			LOG.info("Testing the method add with: ");
			assertEquals(sc.e(), Math.E, 0.1);
		}
	}

	@Test
	public void negaticcosAdvance() {
		double value = 0;
		double result = 0;
		double valueRadians = 0;
		for (int i = 0; i < 50; i++) {
			value = rand.nextDouble() * -50; // för att räkna minus då måste ligga en - tecken framför 10 och ändra
												// nollar
			valueRadians = Math.toRadians(value);
			result = Math.cos(valueRadians);
			LOG.info("Testing the method add with: " + value);
			assertEquals(sc.cos(value), result, 0.1);

		}
	}

	@Test
	public void negativSinAdvancet() {
		double value = 0;
		double result = 0;
		double valueRadians = 0;
		for (int i = 0; i < 50; i++) {
			value = rand.nextDouble() * -50;
			valueRadians = Math.toRadians(value);
			result = Math.sin(valueRadians);
			LOG.info("Testing the method add with: " + value);
			assertEquals(sc.sin(value), result, 0.1);
		}
	}

	@Test
	public void negativSquAdvance() {
		double value = -4;
		double result = -16;
		for (int i = 0; i < 50; i++) {
			value = rand.nextDouble() * -50;
			result = Math.pow(value, 2);
			LOG.info("Testing the method add with: " + value);
			assertEquals(sc.squ(value), result, 0.1);
		}
	}

	@Test
	public void NegativCubAdvance() {
		double value = -10;
		double result = 10000;
		for (int i = 0; i < 50; i++) {
			value = rand.nextDouble() * -50;
			result = Math.pow(value, 3);
			LOG.info("Testing the method add with: " + value);
			assertEquals(sc.cub(value), result, 0.1);
		}
	}

	@Test
	public void negativSqurtAdvance() {
		double value = -10;
		double result = -100;
		for (int i = 0; i < 50; i++) {
			value = rand.nextDouble() * -50;
			result = Math.sqrt(value);
			LOG.info("Testing the method add with: " + value);
			assertEquals(sc.squrt(value), result, 0.1);
		}
	}

}
