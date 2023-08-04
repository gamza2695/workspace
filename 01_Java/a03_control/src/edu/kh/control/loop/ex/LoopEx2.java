package edu.kh.control.loop.ex;

import java.util.Scanner;

public class LoopEx2 {

	// 예제 1 - 구구단 2단 출력하기
	public void ex1() {
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ..
		// 2 x 9 = 18
		System.out.println("구구단 2단 출력하기");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("2 X %d = %d\n", i, 2*i);
		}
	}
	
	// 예제 2 - 입력 받은 단 출력하기
	public void ex2() {
		// 단 입력 : 3
		// [구구단 3단]
		// 3 x 1 = 3
		// ..
		// 3 x 9 = 27
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		System.out.printf("\n[구구단 %d단]\n", dan);
		for(int i = 1; i<=9 ; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
		
		
		
		
		
	}

	// 예제 3 - 입력 받은 단 출력하기
	public void ex3() {
		// 조건 : 입력 받은 값이 2~9 사이 일때만 구구단 출력
		//			2~9 사이가 아닐 경우 "잘못 입력 하셨습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if(dan>=2 && dan<=9) {
			System.out.printf("\n[구구단 %d단]\n", dan);
			for(int i = 1; i<=9 ; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
			}
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}

	// 예제 4 - 5 4 3 2 1 출력하기(반복문 사용해서!)
	public void ex4() {
		for(int i =5; i>0; i--) {
			System.out.printf("%d ", i );
		}
	}
	
	// 예제 5 - 9 8 7 6 5 4 출력하기
	public void ex5() {
		for(int i =9; i>=4; i--) {
			System.out.printf("%d ", i );
		}
	}
	
	// 예제 6 - 중첩 반복문 12345 5줄 출력하기
	public void ex6() {
		for(int x = 1; x<=5; x++) {
			for(int i = 1; i<=5; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	// 예제 7 - 54321 4줄 출력하기
	public void ex7() {
		
		for(int x =1 ; x<=4; x++) {
			for(int i=5; i>=1; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	// 예제 8 - 좌표 찍기
	public void ex8() {
		//(0,0) (0,1) (0,2) 
		//(1,0) (1,1) (1,2)
		
		for(int i=0; i<=1;i++) {
			for(int j=0; j<=2; j++) {
				System.out.printf("(%d,%d) ", i, j);
			}
			System.out.println();
		}
	}
	
	// 예제 9 - 2단부터 9단까지 모두 출력하기
	public void ex9() {
		
		for(int i=2;i<=9;i++) {
			for(int j=1; j<=9;j++) {
				System.out.printf("%d X %d = %d \n", i, j, i*j);
			}
			System.out.println("-------------------------");
		}
		
	}
	
	// 예제 10 - 구구단 거꾸로 출력하기
	public void ex10() {
		
		for(int i=9;i>=2;i--) { // 단 지정
			System.out.printf("[%d단]\n", i);
			for(int j=1; j<=9;j++) { // 곱해지는 수 지정
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
			System.out.println("-------------------------");
		}
	}
	
	// 예제 11 - 구구단 출력하기
	public void ex11() {
		// 조건:
		// 1 입력 시 2~9 순서로 출력
		// 2 입력 시 9~2 순서로 출력
		// 1,2 아니면 "잘못 입력 하셨습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1) 2-9 순서대로 2) 9-2 역순으로 : ");
		int input = sc.nextInt();
		
		if(input==1) {
			for(int i=2;i<=9;i++) {
				for(int j=1; j<=9;j++) {
					System.out.printf("%d X %d = %d \n", i, j, i*j);
				}
				System.out.println("-------------------------");
			}
		} 
		else if(input==2) {
			for(int i=9;i>=2;i--) { 
				System.out.printf("[%d단]\n", i);
				for(int j=1; j<=9;j++) {
					System.out.printf("%d X %d = %d\n", i, j, i*j);
				}
				System.out.println("-------------------------");
			}
		}
		else {
			System.out.println("\n잘못 입력 하셨습니다.");
		}
		
		
	}

	// 예제 12 - count 변수 이용하기
	public void ex12() {
		// 1 2 3
		// 4 5 6
		// 7 8 9
		
		int count = 0;
		// 1행, 2행, 3행
		for(int row = 1; row <=3; row++) {
			// 1열, 2열, 3열
			for(int col = 1; col<=3; col++) {
				System.out.print(++count);
				/*
				 * count++;
				 * System.out.print(count+" ");
				 */
			}
			System.out.println();
		}
	}

	// 예제 13 - count 변수 이용하기 2
	public void ex13() {
		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12

		int count = 0;
		for(int row = 1; row <=3; row++) {
			for(int col = 1; col<=4; col++) {
				System.out.print(++count + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		
		// 단일 for 문 + if
		for(int i = 1; i<=12; i++) {
			System.out.print(i + " ");
			if(i%4==0) {
				System.out.println();
			}
		}
		
		
	}

	// 예제 14 - 행/열 크기를 입력 받아 출력하기 + count
	public void ex14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 : ");
		int row = sc.nextInt();
		System.out.print("열 : ");
		int col = sc.nextInt();
		
		int count = 0;
		
		// 초기식, 조건식, 증감식은 상황에 따라서 늘어나거나 
		// 작성하지 않을 수 있다!
		// for( ; ; ) -> 무한루프

		// 초기식 작성X -> 대신 row, col (입력받은 값) 사용
		for( ; row>=1 ; row--) {
			// col은 다시 반복되므로 초기식 필요
			for(int y = col ; y>=1; y--) {
				System.out.print(++count + " ");
			}
			System.out.println();
		}
		
	}

	// 예제 15 - 계단모양 만들기
	public void ex15() {
		//1
		//12
		//123
		//1234
		
		// 줄(행)이 증가할 때마다 칸(열)이 같은 수로 증가
		
		for(int row = 1; row<=4 ; row++) {
			for(int col = 1; col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		
	}

	// 예제 16 - 계단 거꾸로
	public void ex16() {
		// 1 2 3 4
		// 1 2 3 
		// 1 2
		// 1
		for(int row = 4; row>=1 ; row--) {
			for(int col = 1; col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
	// 예제 17 - 숫자 반대로
	public void ex17() {
		// 4 3 2 1
		// 3 2 1
		// 2 1
		// 1
		for(int row = 4; row>=1 ; row--) {
			for(int col = row; col>=1;col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	// 예제 18
	public void ex18() {
		// 4
		// 4 3
		// 4 3 2
		// 4 3 2 1
		for(int row = 4; row>=1 ; row--) {
			for(int col = 4  ; col>=row ;col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
	}

}
