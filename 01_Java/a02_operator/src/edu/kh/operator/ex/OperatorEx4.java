package edu.kh.operator.ex;

import java.util.Scanner;

public class OperatorEx4 {
	
	/* [배수 확인 프로그램]
	 * 확인할 수 : 15
	 * 배수 : 4
	 * 
	 * 15는 4의 배수? false
	 * 
	 * -----------------------------
	 * 확인할 수 : 333
	 * 배수 : 33
	 * 
	 * 333는 3의 배수? true
	 *
	 */

	public static void main(String[] args) {
		
		System.out.println("[배수 확인 프로그램]");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("확인할 수 : ");
		int num1 = sc.nextInt();
		System.out.print("배수 : ");
		int num2 = sc.nextInt();
	
		// boolean result = input1 % input2 == 0;
		// System.out.printf("%d는 %d의 배수? %b", num1, num2, result);
		System.out.println();
		System.out.printf("%d는 %d의 배수? %b", num1, num2, num1%num2==0);

	}

}
