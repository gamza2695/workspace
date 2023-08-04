package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		else{
			for(int i=1; i<=input;i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		else{
			for(int i=input; i>=1 ;i--) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=input; i++) {
			System.out.print(i);
			if(i<input) {
				System.out.print(" + ");
			}
			sum +=i;
		}
		System.out.print( " = " + sum);
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if(num1<1 || num2<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		else if(num1>=num2){
			for(int i=num2; i<=num1 ;i++) {
				System.out.print(i + " ");
			}
		}
		else if(num1<num2) {
			for(int i=num1; i<=num2 ;i++) {
				System.out.print(i + " ");
			}
		}

		/*
		// num1 과 num2의 위치를 바꾸는 방법
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		for(int i = num1 ; i<=num2; i++) {
			System.out.print(i+" ");
		}
		*/
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.printf("=====%d단=====\n",dan);
		
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan>=2 && dan<=9) {
			System.out.printf("=====%d단=====\n",dan);
			
			for(int i = 1; i<=9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}	
		}
		else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
		
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i<=input; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = input; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int line = 1; line<=input; line++) {
			for(int space=1; space<=input-line; space++) {
				System.out.print(" ");
			}
			for(int star=1; star<=line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int lineNum = 2*input-1;
		
		for(int line = 1; line<=lineNum; line++) {
			
			if(line<=input) {
				for(int star=1; star<=line; star++) {
					System.out.print("*");
				}
			}
			else {
				for(int star=2*input-line;star>=1;star--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int line = 1; line<=input; line++) {
			
			for(int space=1; space<=input-line; space++) {
				System.out.print(" ");
			}
			for(int star=1; star<=2*line-1; star++) {
				System.out.print("*");
			}
			/*for(int space=input-line; space>=1; space--) {
				System.out.print(" ");
			}*/
			System.out.println();
		
		}		
	}
	
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for(int line = 1; line<=input; line++) {
			
			if(line==1 || line==input) {
				for(int star=1; star<=input; star++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				for(int space=1; space<=input-2;space++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.println();
		}		
	}


	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i<=input; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i + " ");
			}
			if(i%2==0 && i%3==0) {
				++count;
			}
		}
		System.out.println("\ncount : " + count);
		
	}
	
}
