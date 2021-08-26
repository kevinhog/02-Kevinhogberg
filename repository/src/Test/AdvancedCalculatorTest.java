package Test;
import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

import Main.AdvancedCalculator;
import scala.util.Random;


public class AdvancedCalculatorTest {
	AdvancedCalculator calc = new AdvancedCalculator();	
	Random rand = new Random();
	double numberOne = 0.0;
	double numberTwo = 0.0;
	double result = 0.0;
    static DecimalFormat df2 = new DecimalFormat("#.##");
    double min = -10.0; 
    double max = 10.0;

    //// testSquarerootMethod ////
    @Test
	public void testSquarerootMethodPositive() {
    	System.out.print("\n--------------------------------------------------------------------------------------");
		System.out.println("\nSquareroot Positive: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne =  (rand.nextDouble()*10);
			
			result = Math.sqrt(numberOne);
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.squareroot(numberOne), result, 0);
		}
		System.out.print("\n--------------------------------------------------------------------------------------");
	
		System.out.println("\nSquareroot Negative: ");
	
		for (int i = 0; i < 10; i++) {
			numberOne =  (-20 + rand.nextDouble()*10);
		
			result = Math.sqrt(numberOne);
			System.out.print(df2.format(result) + " | " );
			
			
			assertEquals(calc.squareroot(numberOne), result, 0);
		}
		System.out.print("\nIt's impossible to get a square root of a negative number!");
		System.out.print("\n--------------------------------------------------------------------------------------");
		
		System.out.println("\nSquareroot Zero: ");
	
		for (int i = 0; i < 10; i++) {
			numberOne =  0;//(-20 + rand.nextDouble()*10);
			System.out.print(numberOne);

			result = Math.sqrt(numberOne);
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.squareroot(numberOne), result, 0);
		}
		System.out.print("\nZero has only one square root which is 0!");
		System.out.print("\n======================================================================================");
	}
	
	//// testRaisedToThePowerOf ////
	@Test
	public void testRaisedToThePowerOfMethod() {
		
		System.out.println("\nRaisedToThePowerOf Positive: ");
		for (int i = 0; i < 10; i++) {
			numberOne = (rand.nextDouble()*10);
		
			numberTwo = (rand.nextDouble()*10);
			
			result = Math.pow(numberOne, numberTwo);
			
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.raisedToThePowerOf(numberOne, numberTwo), result, 0);
			
		}
		System.out.print("\n--------------------------------------------------------------------------------------");
	
		System.out.println("\nRaisedToThePowerOf Negative: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = (rand.nextDouble() *-10);
			//System.out.println(numberOne);
			numberTwo = (rand.nextDouble() *-10);
			//System.out.println(numberTwo);
		
			result = Math.pow(numberOne, numberTwo);
			
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.raisedToThePowerOf(numberOne, numberTwo), result, 0);
			
		}
		System.out.print("\n--------------------------------------------------------------------------------------");

		System.out.println("\nRaisedToThePowerOf Zero: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = 0; 
		
			numberTwo = 0;
			
			result = Math.pow(numberOne, numberTwo);
			
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.raisedToThePowerOf(numberOne, numberTwo), result, 0);
			
		}
		System.out.print("\nAny number raised to the power of 0 equals to 1!");
		System.out.print("\n======================================================================================");
	}
	
	
	
	//// testAbsoluteValue ////
	
	@Test
	public void testAbsoluteValueMethod() {
		System.out.println("\nAbsolute Positive: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne =  (rand.nextDouble()*30);
			
			
			result = Math.abs(numberOne);
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.absoluteValue(numberOne), result, 0);
		}
		System.out.print("\n--------------------------------------------------------------------------------------");
	
		System.out.println("\nAbsolute Negative: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = (rand.nextDouble()*-100);
			
			result = Math.abs(numberOne);
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.absoluteValue(numberOne), result, 0);
		}
		System.out.print("\n--------------------------------------------------------------------------------------");

		System.out.println("\nAbsolute Zero: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = 0;
			
			result = Math.abs(numberOne);
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.absoluteValue(numberOne), result, 0);
		}
		System.out.print("\n======================================================================================");
	}
	
	
	
	//// testSquare ////
	@Test
	public void testSquareZeroMethod() {
		System.out.println("\nSquare Positive: ");
		for (int i = 0; i < 10; i++) {
			numberOne =  (rand.nextDouble()* 100);
			
			result = Math.pow(numberOne, 2);
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.square(numberOne), result, 0);
		}
		System.out.print("\n--------------------------------------------------------------------------------------");
		
		System.out.println("\nSquare Negative: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne =  (rand.nextDouble()* -100);
			
			result = Math.pow(numberOne, 2);
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.square(numberOne), result, 0);
		}
		System.out.print("\n--------------------------------------------------------------------------------------");
		
		System.out.println("\nSquare Zero: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne =  0;
		
			result = Math.pow(numberOne, 2);
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.square(numberOne), result, 0);
		}
		System.out.print("\n======================================================================================");
	}
	
	
	
	//// testCubeMethod ////
	@Test
	public void testCubeMethodPositive() {
		
		System.out.println("\nCube Positive: ");
		for (int i = 0; i < 10; i++) {
			numberOne =  (rand.nextDouble()* 100);
		
			result = Math.pow(numberOne, 3);
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.cube(numberOne), result, 0);
		}
		System.out.print("\n--------------------------------------------------------------------------------------");

		System.out.println("\nCube Negative: ");
		for (int i = 0; i < 10; i++) {
			numberOne =  (rand.nextDouble()* -100);
			
			result = Math.pow(numberOne, 3);
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.cube(numberOne), result, 0);
		}
		System.out.print("\n--------------------------------------------------------------------------------------");

		System.out.println("\nCube Zero: ");
		for (int i = 0; i < 10; i++) {
			numberOne =  0;
				
			result = Math.pow(numberOne, 3);
			System.out.print(df2.format(result) + " | " );
			
			assertEquals(calc.cube(numberOne), result, 0);
		}
		System.out.print("\n======================================================================================");
	}
	
	
	
	
}
