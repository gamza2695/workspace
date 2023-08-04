package edu.kh.oarr.model.dto;

public class Student {
	
	// 필드
	private int grade;
	private int ban;
	private int number;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	
	// 생성자
	public Student() {}
	
	public Student(int grade, int ban, int number, String name) {// 오버로딩	
		this.grade = grade;
		this.ban = ban;
		this.number = number;
		this.name = name;
	}
	
	// getter/setter
	// getter/setter 자동완성 - alt+(shift)+s (source) - r (generate getters and setters)
	// grade
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	// ban
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	// number
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	// name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	// 필드를 하나의 문자열로 만들어 반환하는 메서드
	// toString : 객체의 필드 값을 하나의 문자열로 반환 단어!
	public String toString() {
		return String.format("%d학년 %d반 %d번 %s [%d, %d, %d]",
				grade, ban, number, name, kor, eng, math);
	}
	
}
