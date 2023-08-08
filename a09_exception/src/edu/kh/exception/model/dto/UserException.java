package edu.kh.exception.model.dto;

//사용자 정의 예외
//- 자바에서 제공하지 않는 예외를 직접 만드는 방

//1. Exception 클래스 아무거나 상속 받기
//단, Unchecked로 만들고 싶으면 RuntimeException 관련 예외 상속 받기
//2. 생성자 만들기
public class UserException extends Exception{
	public UserException() {
		super("사용자 정의 예외 발생");
	}
	
	
	// 매개변수 생성자
	public UserException(String message) { // 매개변수로 전달받아온 메시지를 에러메시지로 띄운다
		super(message);
	}
}
