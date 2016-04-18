public class Calculator {
	public static double getSum(double a, double b) {
		return a+b;
	}
	
	public static double getSum(double[] num) {
		double sum = 0;
		for (double e: num) {
			sum += e;
		}
		return sum;
	}
	
	public static double getProduct(double a, double b) {
		return a*b;
	}
	
	public static double getProduct(double[] num) {
		double product = 1;
		for (double e: num) {
			product *= e;
		}
		return product;
	}
	
	public static double getAverage(double a, double b) {
		return getSum(a,b) / 2.0;
	}
	
	public static double getAverage(double[] num) {
		return getSum(num) / num.length;
	}
	
	public static double getFactorial(double a) {
		double factorial = 1.0;
		for (double i = 1; i <= a ; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	public static double[] getFactorial(double[] num) {
		double[] n = new double[num.length];
		for (int i = 0; i < num.length; i++ ) {
			n[i] = getFactorial(num[i]);
		}
		return n;
	}
}
