
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicCalculator basCalc = new BasicCalculator();
		AdvancedCalculator advCalc = new AdvancedCalculator();
		
		System.out.println(basCalc.addition(1.0, 2.0));
		System.out.println(basCalc.division(4.0 , 2.0));
		System.out.println(basCalc.multiplication(7.0 , 3.0));
		
		
		System.out.println(advCalc.raisedToThePowerOf(2.0, 2.0));
		System.out.println(advCalc.cube(4));
		System.out.println(advCalc.square(5));
		
	}

}


