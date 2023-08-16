package edu.kh.thread.ex3;

public class MoveStar implements Runnable {
	@Override
	public void run() {

		try {
			
			for(int i = 0; i<9 ; i++) { // 9번 움직임
				
				// 50줄 띄우기
				for(int a = 0; a<50; a++) System.out.println();
				
				// i 이하만큼 반복하며 한 칸 띄어쓰기
				for(int h = 0; h<=i; h++) System.out.print(" ");
				System.out.println("❤");
				
				// 위 한바퀴돌때 아래는 0번/ 실행될때마다 위에가 한칸 더 띄어짐
				
				// i 미만까지 반복하며 한 칸 씩 띄우기
				for(int s = 0; s<i; s++) System.out.print(" ");
				System.out.print("★");			
				
				Thread.sleep(1000); // 1초 일시 정지
			}
			
			
		} catch (InterruptedException e) {
			
			Thread.currentThread().interrupt();
		}
	}
}
