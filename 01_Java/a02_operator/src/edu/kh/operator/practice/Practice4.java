package edu.kh.operator.practice;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = age <= 13 ? "어린이" : (age > 19 ? "성인" : "청소년");
		//String result = age <= 13 ? "어린이" : (age <= 19 ? "청소년" : "성인");
		// 어린이에서 한번 걸러지니까 age <=19 가능!
		
		// -> 청소년을 찾는 조건을 age <=19 라고만 작성해도 13이하를 제외하기 때문에
		// age > 13 && age <= 19 조건과 동일 조건이 성립한다.
		
		System.out.println(result);
	}
}
