package ex;

import java.util.Scanner;

public class op1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("정수 입력 2 : ");
		int input2 = sc.nextInt();
		
		System.out.println(); 
		
		// + 연산
		System.out.println(input1 + " + " + input2 + " = " + (input1+input2));
		
		// - 연산
		int minusResult = input1 - input2;
		System.out.println(input1 + " - " + input2 + " = " + minusResult);
		
		// * 연산
		System.out.printf("%d * %d = %d\n", input1, input2, input1*input2);

		// / 연산
		System.out.printf("%d / %d = %.1f\n", input1, input2, (double)input1/input2);

		// % 연산 
		System.out.printf("%d %% %d = %d", input1, input2, input1%input2);

	}
}