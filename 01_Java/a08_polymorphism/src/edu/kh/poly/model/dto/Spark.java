package edu.kh.poly.model.dto;

public class Spark extends Car {

	private double discountRate; // 할인율
	
	public Spark() {
		// TODO Auto-generated constructor stub
	}


	public Spark(int wheel, int seat, String fuel, double discountRate) {
		super(wheel, seat, fuel);
		this.discountRate = discountRate;
	}


	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		return super.toString() + " / Spark [discountRate=" + discountRate + "]";
	}
	
	@Override
	public void bindingTest() {
		System.out.println("Spark 자료형 입니다.");
	}
}
