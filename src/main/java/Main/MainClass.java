
/**
 * Main method is main of application
 * 
 * 
*/

package Main;

import java.util.*;

import SimpleCalc.CalculationBasicOperationInterface;

public class MainClass {
/** 
 * @param args
 */
	
	public static void main(String[] args) {
	/**
	 * Infinite loop to run the application 
	 * Switch method to make user choice  be free to choice which operation user want 
	 * Scanner to get the value user input and count it then return the result from chosen operation
	 */
		for (;;) {
			CalculationBasicOperationInterface sc=new CalculationBasicOperationInterface();
			AdvanceClac.CalculationAdavanceOperationInterface ca=new AdvanceClac.CalculationAdavanceOperationInterface();
			Scanner s=new Scanner(System.in);
			System.out.println(
					"1.add/ 2.sub /3.mult/ 4.div /5.sin(x) /6.cos(x) /7.square /8.e /9.cubed /10.square root  ");
			double result;
			int choice = s.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter First Number");
				double number1 = s.nextDouble();
				System.out.println("Enter your second Number");
				double number2 = s.nextDouble();
				result = sc.addition(number1, number2);
				System.out.println("Your result is" + "\t" + result + "\n");
				break;
			}
			case 2: {
				System.out.println("Enter First Number");
				double number1 = s.nextDouble();
				System.out.println("Enter your second Number");
				double number2 = s.nextDouble();
				result = sc.sub(number1, number2);
				System.out.println("Your result is" + "\t" + result + "\n");
				break;
			}
			case 3: {
				System.out.println("Enter First Number");
				double number1 = s.nextDouble();
				System.out.println("Enter your second Number");
				double number2 = s.nextDouble();
				result = sc.mult(number1, number2);
				System.out.println("Your result is" + "\t" + result + "\n");
				break;
			}
			case 4: {
				System.out.println("Enter First Number");
				double number1 = s.nextDouble();
				System.out.println("Enter your second Number");
				double number2 = s.nextDouble();
				result = sc.div(number1, number2);
				System.out.println("Your result is" + "\t" + result + "\n");
				break;
			}
			case 5: {
				System.out.println("Enter First Number");
				double number1 = s.nextDouble();
				result = ca.sin(number1);
				System.out.println(" sin(x) of " + number1 + " is " + "\t" + result + "\n");
				break;
			}
			case 6: {
				System.out.println("Enter First Number");
				double number1 = s.nextDouble();
				result = ca.cos(number1);
				System.out.println(" cos(x) of " + number1 + " is " + "\t" + result + "\n");
				break;
			}
			case 7: {
				System.out.println("Enter First Number");
				double number1 = s.nextDouble();
				result = ca.squ(number1);
				System.out.println(" square " + number1 + " is " + "\t" + result + "\n");
				break;
			}
			case 8: {
				result = ca.e();
				System.out.println(" e " + " is " + "\t" + result + "\n");
				break;
			}
			case 9: {
				System.out.println("Enter First Number");
				double number1 = s.nextDouble();
				result = ca.cub(number1);
				System.out.println(" cubed " + number1 + " is " + "\t" + result + "\n");
				break;
			}
			case 10: {

				System.out.println("Enter First Number");
				double number1 = s.nextDouble();
				result =ca.squrt(number1);
				System.out.println(" square root  " + number1 + " is " + "\t" + result + "\n");
				break;
				}
			}
		}
	}
}
