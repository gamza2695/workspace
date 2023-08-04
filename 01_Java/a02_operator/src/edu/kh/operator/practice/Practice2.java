package edu.kh.operator.practice;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result = input > 0 ? "양수" : "양수 아님";
		System.out.println();
		System.out.println(result);
		
		//input > 0 ? "양수" : "양수 아님" => 에러나는 이유 "양수"; 가 남는데 이에 대한 수행할 수 없음
		//System.out.println(input > 0 ? "양수" : "양수 아님"); => 출력해라 라는 수행을 함
		//System.out.println("\n" + (input > 0 ? "양수" : "양수 아님")); 
	}
}
