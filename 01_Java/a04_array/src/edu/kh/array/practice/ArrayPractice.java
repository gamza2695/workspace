package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		int[] arr = new int[9];
		int evensum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			if(i%2==0) {
				evensum += arr[i];
			}
		}
		System.out.println("\n짝수 번째 인덱스 합 : " + evensum);
	}
	
	public void practice2() {
		
		int[] arr = new int[9];
		int oddsum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = arr.length-i;
			System.out.print(arr[i] + " ");
			if(i%2==1) {
				oddsum += arr[i];
			}
		}
		System.out.println("\n홀수 번째 인덱스 합 : " + oddsum);
		
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		
		for(int i =0 ; i<input;i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i<5; i++) {
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			arr[i] = input;
		}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		int flag = 1;
		
		for(int i = 0 ; i<5 ; i++) {
			if(arr[i] == search) {
				System.out.println("인덱스 : " + i);
				flag = 0;
			}
		}
		if(flag==1) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] arr = str.toCharArray();
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		System.out.print(str + "에 " + ch +"가 존재하는 위치(인덱스) : ");
		int count = 0;
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i] == ch) {
				++count;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n" + ch + "개수 : " + count);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		int sum = 0;
		
		for(int i = 0; i<input; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int num = sc.nextInt();
			arr[i] = num;
			sum +=num;
		}
		for(int row : arr) {
			System.out.print(row + " ");
		}
		System.out.print("\n총  합 : " +sum);
		
	}
	
	//7번 다시
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		char[] num = new char[13];
		
		System.out.print("주민등록번호(-포함) : ");
		
		for(int i =0; i<8;i++) {
			num[i]= sc.next().charAt(i);
		}
		for(int i =8; i<13;i++) {
			num[i] = '*';
		}
		
		for(int arr : num) {
			System.out.print(arr);
		}
		
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if(input%2==0 || input<3) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			else {
				for(int i = 1 ; i<=input/2+1 ; i++) {
					System.out.print(i + " ");
				}
				for(int i = input/2; i>0;i-- ) {
					System.out.print(i + " ");
				}
				break;
			}
		}
	}

	public void practice9() {
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i<10;i++) {
			arr[i] = (int)(Math.random()*10 + 1);
			System.out.print(arr[i] + " ");
		}
	}

	public void practice10() {
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i<10;i++) {
			arr[i] = (int)(Math.random()*10 + 1);
			System.out.print(arr[i] + " ");
		}
		
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i<10;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}

	public void practice11() {
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i<10;i++) {
			arr[i] = (int)(Math.random()*10 + 1);
			
			for(int j = 0; j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		
		for(int i = 0; i<10;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice12() {
		int[] arr = new int[45];

		for(int i = 0; i<10;i++) {
			arr[i] = (int)(Math.random()*45 + 1);
			for(int j = 0; j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		
		for(int i = 0; i<6;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	//13번 다시
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] arr = str.toCharArray();
		int count = 0;
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i <arr.length; i++) {
			for(int  j = 0; j<arr.length; j++) {
				if(arr[i]!=arr[j]) {
					
					++ count;
				}
			}
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println("\n문자 개수 : " + count);
	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int input = sc.nextInt();
		
		String[] arr = new String[input];
		
		for(int i = 0; i<arr.length ; i++) {
			System.out.print((i+1) + "번째 문자열 : ");
			String s = sc.next();
			arr[i] = s;
		}
		
		while(true) {
			
			
			
		}
	}


}
