import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Main.BasicCalculator;
import scala.util.Random;

public class BasicCalculatorTest {

	BasicCalculator calc = new BasicCalculator();	
	Random rand = new Random();
	double numberOne = 0.0;
	double numberTwo = 0.0;
	double result = 0.0;
	static DecimalFormat df2 = new DecimalFormat("#.##");
	
	//(rand.nextDouble()*-100);
	
	@Test
	public void testBasicAdditionMethodPositive() {
		System.out.println("\nAddition Positive: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = (rand.nextDouble()* 100);
			//System.out.println(numberOne);
			numberTwo = (rand.nextDouble()* 100);
			//System.out.println(numberTwo);
			result = numberOne + numberTwo;
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.addition(numberOne, numberTwo), result, 0);
		}
		System.out.print("\n--------------------------------------------------------------------------------------");
	//}
	
	//@Test
	//public void testBasicAdditionMethodNegative() {
		System.out.println("\nAddition Negative: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = (rand.nextDouble()* -100);
			//System.out.println(numberOne);
			numberTwo = (rand.nextDouble()* -100);
			//System.out.println(numberTwo);
			result = numberOne + numberTwo;
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.addition(numberOne, numberTwo), result, 0);
		}
		System.out.print("\n--------------------------------------------------------------------------------------");
	//}
	
	//@Test
	//public void testBasicAdditionMethodZero() {
		System.out.println("\nAddition Zero: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = 0;
			//System.out.println(numberOne);
			numberTwo = 0;
			//System.out.println(numberTwo);
			result = numberOne + numberTwo;
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.addition(numberOne, numberTwo), result, 0);
		}
		System.out.print("\n======================================================================================");
	}
	
	//// testBasicSubtractionMethod ////
	
	@Test
	public void testBasicSubtractionMethodPositive() {
		System.out.println("\nSubtraction Positive: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = (rand.nextDouble()* 100);
			//System.out.println(numberOne);
			numberTwo = (rand.nextDouble()* 100);
			//System.out.println(numberTwo);
			result = numberOne - numberTwo;
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.subtraction(numberOne, numberTwo), result, 0);
		}
		System.out.print("\n--------------------------------------------------------------------------------------");
	//}
	//@Test
	//public void testBasicSubtractionMethodNegative() {
		System.out.println("\nSubtraction Negative: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = (rand.nextDouble()* -100);
			//System.out.println(numberOne);
			numberTwo = (rand.nextDouble()* -100);
			//System.out.println(numberTwo);
			result = numberOne - numberTwo;
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.subtraction(numberOne, numberTwo), result, 0);
		}
		System.out.print("\n--------------------------------------------------------------------------------------");
	//}
	//@Test
	//public void testBasicSubtractionMethodZero() {
		System.out.println("\nSubtraction Zero: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = 0;
			//System.out.println(numberOne);
			numberTwo = 0;
			//System.out.println(numberTwo);
			result = numberOne - numberTwo;
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.subtraction(numberOne, numberTwo), result, 0);
		}
		System.out.print("\n======================================================================================");
	}
	
	//// testBasicMultiplicationMethod ////
	@Test
	public void testBasicMultiplicationMethodPositive() {
		System.out.println("\nMultiplication Positive: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = (rand.nextDouble()* 100);
			//System.out.println(numberOne);
			numberTwo = (rand.nextDouble()* 100);
			//System.out.println(numberTwo);
			result = numberOne * numberTwo;
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.multiplication(numberOne, numberTwo), result, 0);
		}
		System.out.print("\n--------------------------------------------------------------------------------------");
	//}
	
	//@Test
	//public void testBasicMultiplicationMethodNegative() {
		System.out.println("\nMultiplication Negative: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = (rand.nextDouble()* -100);
			//System.out.println(numberOne);
			numberTwo = (rand.nextDouble()* -100);
			//System.out.println(numberTwo);
			result = numberOne * numberTwo;
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.multiplication(numberOne, numberTwo), result, 0);
		}
		System.out.print("\n--------------------------------------------------------------------------------------");
	//}
	
	//@Test
	//public void testBasicMultiplicationMethodZero() {
		System.out.println("\nMultiplication Zero: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = 0;
			//System.out.println(numberOne);
			numberTwo = 0;
			//System.out.println(numberTwo);
			result = numberOne * numberTwo;
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.multiplication(numberOne, numberTwo), result, 0);
		}
		System.out.print("\n======================================================================================");
	}
	
	//// testBasicDivisionMethod ////
	
	@Test
	public void testBasicDivisionMethodPositive() {
		
		System.out.println("\nDivision Positive: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = (rand.nextDouble()* 100);
			//System.out.println(numberOne);
			numberTwo = (rand.nextDouble()* 100);
			//System.out.println(numberTwo);
			result = numberOne / numberTwo;
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.division(numberOne, numberTwo), result, 0);
		}
		System.out.print("\n--------------------------------------------------------------------------------------");
	//}
	
	//@Test
	//public void testBasicDivisionMethodNegativeNegative() {
		System.out.println("\nDivision Negative: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = (rand.nextDouble()* -100);
			//System.out.println(numberOne);
			numberTwo = (rand.nextDouble()* -100);
			//System.out.println(numberTwo);
			result = numberOne / numberTwo;
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.division(numberOne, numberTwo), result, 0);
		}
		System.out.print("\n--------------------------------------------------------------------------------------");
	//}
	
	//@Test
	//public void testBasicDivisionMethodZero() {
		System.out.println("\nDivision Zero: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = 0;
			//System.out.println(numberOne);
			numberTwo = 0;
			//System.out.println(numberTwo);
			result = numberOne / numberTwo;
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.division(numberOne, numberTwo), result, 0);
		}
		System.out.print("\nZero divided by zero is undefined because everything is a valid solution!");
		System.out.print("\n======================================================================================");
	}
}
