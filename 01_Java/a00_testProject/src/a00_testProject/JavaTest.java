package a00_testProject;

//주석

// class : 자바 코드를 작성하는 영역
public class JavaTest {
	
	// main 메서드(method, 기능)
	// - 자바 프로그램(프로젝트, 애플리케이션) 을 
	//   실행시키기 위해 반드시 필요한 구문(기능)
	public static void main(String[] args) {
		
		// 실행방법
		// 1) 위에 실행 버튼(Run 버튼)
		// 2) ctrl + f11
		
		// System.out.println() : () 안의 문자열 출력 후 엔터(한 줄 출력)
		System.out.println("Hello World");
		System.out.println("안녕하세요");
		
		// 숫자만 작성하면 연산
		System.out.println(3500 + 6000);
		// 사칙연산 우선순위 적용
		// 숫자 + "문자열" = 숫자문자열 (이어쓰기, 추가하기, 덧붙이기)
		System.out.println(1000 + 2000 + "원");
		
		System.out.println("");
		System.out.println("");
		
		// 김밥 : 2000원, 떡볶이 : 3000원  > 연산 우선순위 생각
		System.out.println("합계 : " + (2000 + 3000) + " 원");
		
		
	}
}
