package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	// 실습문제 1
	public void practice1() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<=0) {
			System.out.println("양수만 입력해주세요.");
		} else {
			if(num%2==0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		}
	}


	// 실습문제 2
	public void practice2() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();	
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		if(kor < 40 || math < 40 || eng < 40 || avg < 60) {
			// kor>=40 && math>=40 && eng>=40 && avg>=60 반대로...?
			System.out.println("불합격입니다.");
		}
		else {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %.1f\n", avg);
			System.out.println("축하합니다, 합격입니다!");
		}	
	}
	

	// 실습문제 3
	public void practice3() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();		
		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12 : System.out.println(month + "월은 31일까지 있습니다."); break;
		case 4, 6, 9, 11 		   : System.out.println(month + "월은 30일까지 있습니다."); break;
		case 2 					   : System.out.println(month + "월은 28일까지 있습니다."); break;
		default					   : System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		
		/*
		int day = 0; // 해당하는 달의 마지막 일(날짜)을 저장 단, 1~12월이 아니면 0을 저장
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12 : day = 31; break;
		case 4, 6, 9, 11 		   : day = 30; break;
		case 2 					   : day = 28; break;
		} //default day는 계속 0
		if(day==0) { 
			System.out.println(month + "월은 잘못 입력된 달입니다.");	
		} else { 
			System.out.println(month + "월은 " + day +"일까지 있습니다.");
		}*/

	}
	

	// 실습문제 4
	public void practice4() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.println("BMI 지수 : " + BMI);
		
		String result;
		
		if(BMI < 18.5) {
			result = "저체중";
		} else if(BMI < 23) {
			result = "정상체중";
		} else if(BMI < 25) {
			result = "과체중";
		} else if(BMI < 30) {
			result = "비만";
		} else {
			result = "고도비만";
		}
		System.out.println(result);
		
		
	}
	

	// 실습문제 5
	public void practice5() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int midterm = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int finalterm = sc.nextInt();
		System.out.print("과제 점수 : ");
		int hw = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int attend = sc.nextInt();
		System.out.println("==================결과==================");
	
	
		
		if(attend <= 20*0.7) {
			System.out.printf("Fail[출석 횟수 부족 (%d/20)]", attend);
		}
		else {
			/*  
			 * 변수에 저장하는 게 좋음!
			 * double midScore = midTerm * 0.2;
			 * double finalScore = finalTerm * 0.3;
			 * 
			 */
			double points = midterm*0.2 + finalterm*0.3 + hw*0.3 + ((double)attend/20*100)*0.2;
			
			System.out.println("중간 고사 점수(20) : " + midterm*0.2);
			System.out.println("기말 고사 점수(20) : " + finalterm*0.3);
			System.out.println("과제 점수  (20) : " + hw*0.3);
			System.out.println("출석 점수  (20) : " + ((double)attend/20*100)*0.2);
			System.out.println("총점 : " + points);
			
			if(points < 70) {
				System.out.println("Fail[점수 미달]");
			}
			else {
				System.out.println("PASS");				
			}
		}
	}
}
