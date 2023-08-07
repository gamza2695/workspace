package edu.kh.array.practice;

import java.util.Arrays;
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
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		char[] num = new char[14];
		
		System.out.print("주민등록번호(-포함) : ");
		char[] input = sc.next().toCharArray();
		
		for(int i = 0; i<8; i++) {
			System.out.print(input[i]);
		}
		for(int i = 8; i<14; i++) {
			input[i] = '*';
			System.out.print(input[i]);
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

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		String answer = "";
		int count = 0;
		
		
		for(int i = 0; i<str.length();i++) {
			if(str.indexOf(str.charAt(i))==i) { // str의 i번째 문자가 있는 str의 인덱스 번호가 i 일때
				answer +=str.charAt(i);
				count++;
			}
		}
		
		char[] arr = answer.toCharArray();
		
		System.out.print("문자열에 있는 문자 : " );
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);
	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		
		String[] arr = new String[size];
		String[] answer = new String[size*2]; // 추가 크기 문제,,,
		
		sc.nextLine();
		for(int i = 0; i < size ; i++) {
			System.out.print((i+1) + "번째 문자열 : ");
			String s = sc.nextLine();
			answer[i] = s;
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String add  = sc.nextLine();
			
			if(add.equals("n") || add.equals("N")) {
				System.out.println(Arrays.asList(answer));
				break;
			}
			
			if(add.equals("y") || add.equals("Y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int inputAdd = sc.nextInt();
				sc.nextLine();
				
				for(int i = size; i < size+inputAdd ; i++) {
					System.out.print((i+1) + "번째 문자열 : ");
					String s = sc.nextLine();
					answer[i] = s;
				}
				size = size+inputAdd;
			}
		}
	}
	
	public void practice15() {
		String[][] arr =new String[3][3]; 

		for(int i = 0; i<arr.length; i++) { 
			for(int j = 0; j<arr[0].length;j++) {
				System.out.printf("(%d, %d)", i, j);
			}
			System.out.println();
		}
	}

	public void practice16() {
		int[][] arr = new int[4][4];
		int count = 1;
		
		for(int i = 0; i<arr.length; i++) { 
			for(int j = 0; j<arr[0].length;j++) {
				System.out.printf("%3d",count++);
			}
			System.out.println();
		}
	}
	
	public void practice17() {
		int[][] arr = new int[4][4];
		int count = 16;
		
		for(int i = 0; i<arr.length; i++) { 
			for(int j = 0; j<arr[0].length;j++) {
				System.out.printf("%3d",count--);
			}
			System.out.println();
		}
	}

	public void practice18() {
		int[][] arr = new int[4][4];
		
		for(int i = 0; i<arr.length-1; i++) { 
			for(int j = 0; j<arr[0].length-1;j++) {
				arr[i][j] = (int)(Math.random()*10+1);
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j];
			}
		}
		
		for(int[] i : arr) {
			for(int j :i) {
				System.out.printf("%4d",j);
			}
			System.out.println();
		}	
	}

	public void practice19() {
		Scanner sc = new Scanner(System.in);
		int row = 0;
		int col = 0;
		
		while(true) {
			System.out.print("행 크기 : ");
			row = sc.nextInt();
			System.out.print("열 크기 : ");
			col = sc.nextInt();
			
			if(row<1||row>10||col<1||col>10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
			else break;
		}
		
		char[][] arr = new char[row][col];
		
		for(int i = 0; i<arr.length; i++) { 
			for(int j = 0; j<arr[0].length;j++) {
				arr[i][j] = (char)(Math.random()*26+65);
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

	public void practice20() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();

		char [][] arr = new char[row][];
		
		for(int i =0; i<row; i++) {
			System.out.print(i + "열의 크기 : ");
			int s = sc.nextInt();
			arr[i] = new char[s];
		}
		
		char k = 'a';
		
		for(int i = 0; i<row ; i++) { 
			for(int j = 0; j<arr[i].length;j++) {
				arr[i][j] = k++;
				System.out.printf("%3c",arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice21() {
		String[] students = {"강건강","남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] bundan1 = new String[3][2];
		String[][] bundan2 = new String[3][2];
		int count = 0;
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<2; j++) {
				bundan1[i][j] = students[count++];
				System.out.print(bundan1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<2; j++) {
				bundan2[i][j] = students[count++];
				System.out.print(bundan2[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		
		String[] students = {"강건강","남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] bundan1 = new String[3][2];
		String[][] bundan2 = new String[3][2];
		int count = 0;
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<2; j++) {
				bundan1[i][j] = students[count++];
				System.out.print(bundan1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<2; j++) {
				bundan2[i][j] = students[count++];
				System.out.print(bundan2[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();
		
		for(int i = 0; i < 3; i++) {
			if(name.equals(bundan1[i][0])){
				System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 왼쪽에 있습니다.", name, i+1);
			}
			if(name.equals(bundan1[i][1])){
				System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 오른쪽에 있습니다.", name, i+1);
			}
		}
		
		for(int i = 0; i < 3; i++) {
			if(name.equals(bundan2[i][0])){
				System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 왼쪽에 있습니다.", name, i+1);
			}
			if(name.equals(bundan2[i][1])){
				System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 오른쪽에 있습니다.", name, i+1);
			}
		}
	}

	public void practice23() {
		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[6][6];
		
		for(int i = 1; i<6; i++) {
			arr[0][i] = arr[i][0] = " " + (i-1) +" "; 
		}
		
		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int col = sc.nextInt();
		
		
		for(int i = 0; i<6; i++) { 
			for(int j = 0; j<6;j++) {
				if(i==row && j ==col) {
					arr[i+1][j+1]=" X ";
				}
				if(arr[i][j]==null) {
					arr[i][j]=" ";
				}
				System.out.printf("%3s",arr[i][j]);
			}
			System.out.println();
		}
		
	}

	public void practice24() {
		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[6][6];
		
		for(int i = 1; i<6; i++) {
			arr[0][i] = arr[i][0] = " " + (i-1) +" "; 
		}
		
		while(true) {
			System.out.print("행 인덱스 입력 : ");
			int row = sc.nextInt();
			
			if(row==99) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.print("열 인덱스 입력 : ");
			int col = sc.nextInt();
			

			
			for(int i = 0; i<6; i++) { 
				for(int j = 0; j<6;j++) {
					if(i==row && j ==col) {
						arr[i+1][j+1]=" X ";
					}
					if(arr[i][j]==null) {
						arr[i][j]=" ";
					}
					System.out.printf("%3s",arr[i][j]);
				}
				System.out.println();
			}
		}
	}

	public void practice25() {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int bingocount = 0;
		
		System.out.print("빙고판 크기 지정 : ");
		int size = sc.nextInt();
		
		int[][] bingo = new int[size][size];
		
		// 빙고판 초기화
		for(int i = 0; i<size; i++) {
			for(int j = 0; j<size;j++) {
				bingo[i][j] = i*size + j + 1;	
			}
		}
				
		// 빙고판 섞기
		for(int i = 0; i<size; i++) {
			for(int j = 0; j<size;j++) {
				x = (int)(Math.random() * size);
				y = (int)(Math.random() * size);
				
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
				
				// 빙고판 출력
				System.out.printf("%5s",bingo[i][j]);
			}
			System.out.println();
		}		
				
		
		/* 스트링 이용
		String[][] bingo = new String[size][size];
		
		// 빙고판 초기화
		for(int i = 0; i<size; i++) {
			for(int j = 0; j<size;j++) {
				bingo[i][j] = String.valueOf(i*size + j + 1);	
			}
		}
		
		// 빙고판 섞기 => 숫자 중복됨 why?
		for(int i = 0; i<size; i++) {
			for(int j = 0; j<size;j++) {
				x = (int)(Math.random() * size);
				y = (int)(Math.random() * size);
				
				String tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
				
				// 빙고판 출력
				System.out.printf("%5s",bingo[i][j]);
			}
			System.out.println();
		}*/
		
		System.out.println("==================빙고게임 시작==================");
		
		
		while(true) {
			System.out.print("정수를 입력하시오 : ");
			int input = sc.nextInt();
			
			for(int i = 0; i<size; i++) {
				for(int j = 0; j<size;j++) {
					if(input == bingo[i][j]) {
						bingo[i][j] = 0;
					}
					System.out.printf("%5d",bingo[i][j]);
				}
				System.out.println();
			}
			
			
			
		}
		
	}

}
