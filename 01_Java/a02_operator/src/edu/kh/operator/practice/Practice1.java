package edu.kh.operator.practice;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println();
		System.out.println("1인당 사탕 개수 : " + candy/num);
		System.out.println("남는 사탕 개수 : " + candy%num);
	}
}
