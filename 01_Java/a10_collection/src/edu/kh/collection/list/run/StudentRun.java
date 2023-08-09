package edu.kh.collection.list.run;

import edu.kh.collection.list.view.StudentView;

public class StudentRun {
	
	// Run -> View -> Service -> DTO 이런 구도가 좋음
	
	public static void main(String[] args) {
		StudentView view = new StudentView();
		
		view.displayMenu(); // 메뉴 출력
	}

}
