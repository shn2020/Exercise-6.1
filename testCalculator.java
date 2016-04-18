
public class testCalculator {
	public static void main(String[] args) {
		double[] num = new double[5];
		num[0] = 1.0;
		num[1] = 2.0;
		num[2] = 3.0;
		num[3] = 4.0;
		num[4] = 5.0;
		
		System.out.println(num[1] + " + " + num [2] + " = " +Calculator.getSum(num[1],num[2]));
		System.out.println("Sum of array = " + Calculator.getSum(num));
		
		System.out.println("(" + num[1] + " + " + num [2] +")/ 2 = " +Calculator.getAverage(num[1],num[2]));
		System.out.println("Average of array = " + Calculator.getAverage(num));
		
		System.out.println(num[1] + " * " + num [2] + " = " + Calculator.getProduct(num[1],num[2]));
		System.out.println("Product of array = " + Calculator.getProduct(num));
		
		System.out.println((int)num[4] + "! = " + (int)Calculator.getFactorial(num[4]));
		
		// Initialize factorial array
		double[] factArray = Calculator.getFactorial(num);
		
		for (double e: factArray) {
			System.out.print(e + " ");
		}
	}
}
