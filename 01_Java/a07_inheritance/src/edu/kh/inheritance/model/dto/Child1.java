package edu.kh.inheritance.model.dto;


// 상속 키워드 : extends
// public calss 자식 클래스 extends 부모클래스{}
public class Child1 extends Parent{
	
	// 필드
	private String car;
	
	// 생성자
	public Child1() {
		super(); // 
		System.out.println("Child1() 기본 생성자로 자식 객체 생성");
	}
	public Child1(String car) {
		super(); // super 생성자 == 부모 생성자
		// 부모 객체가 먼저 생성된 후 자식 객체가 생성됨 
		this.car = car;
		System.out.println("Child1(String) 매개변수 생성자로 자식 객체 생성");
	}
	
	// getter/setter
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	
	// * 오버라이딩(Overriding) *
	// 위로 올라타다 = 코드를 덮어씌움
	// 부모로부터 상속받은 메서드를 자식이 원하는 형태로 재정의 하는 것
	
	// 오버라이딩 특징
	// - 부모의 메서드와 반환형, 메서드명, 매개변수까지 똑같음
	// - 내부코드는 다름
	
	// @ : Annotation(@, 어노테이션)
	// 컴파일러가 보는 주석으로, 컴파일리어에게 어노테이션에 작성된 내용을 보고
	// 코드가 정상 작성 되었는데, 해당 코드가 실행 되기 전에 다른 코드 싱행
	// 코드가 해석되는 순서를 작성한다던지 .. 등이 가능
	
	@Override // 이 메서드가 부모 것을 재정의 한거니까 제대로 작성했는지 검사해달라
	public String toString() {
		
		// 상속받은 Parent의 메서드를 자식이 자신의 것처럼 사용 가능
		// getMoney(); 
		// getLastName();
		// 부모 private 필드 직접 접근 불가능
		
		return getMoney() + " / " + getLastName() + " / " + car;
	}
	
	// 오버라이딩 연읍
	// 부모로부터 상속받은 getMoney()를 재정의
	@Override
	public int getMoney() {
		System.out.println("오버라이딩한 getMoney()");
		
		return (int)(super.getMoney() * 0.7);
	}

}