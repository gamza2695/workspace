package r08_interface;

public interface Calculator {
	
	public static final double PI = 3.14; // 원주율
	public static final int MAX_NUM = 2_147_000_000; // 최대값
	public static final int MIN_NUM = -2_147_000_000; // 최소값
	
	public abstract int plus(int a, int b); // +
	public abstract int minus(int a, int b); // -
	public abstract int multi(int a, int b); // *
	public abstract int div(int a, int b); // /
	public abstract int mod(int a, int b); // %
	
	public abstract double areaOfCircle(double r); // 원의 넓이
	public abstract int pow(int a, int x); // 거듭 제곱

}
