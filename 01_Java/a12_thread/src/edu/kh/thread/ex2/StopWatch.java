package edu.kh.thread.ex2;

public class StopWatch implements Runnable {

	@Override
	public void run() {
		int count = 0;
		int min = 0; // 분
		int sec = 0; // 초

		while(!Thread.currentThread().isInterrupted()) {
			try {
				// 00분 00초 00
				Thread.sleep(9); // 1/100 초
				count++; // 0.01초마다 카운트 증가
				
				if(count==100) { // 1초가 되었을 때
					sec++; // 초 단위를 1 증가
					count = 0; // 초기화
				}
				if(sec==60) { // 60초 1분이 되었을 때
					min++; // 분 단위 1 증가
					sec = 0; // 초 단위 0으로 초기화
				}
				
				for(int i = 0; i<30;i++) System.out.println();
				
				System.out.printf("%02d분 %02d초 %02d \n", min, sec, count);				
				
				
			} catch (InterruptedException e) {
				System.out.println("=== 인터럽트에 의해서 종료 ===");
				Thread.currentThread().interrupt(); 
			}
		}
	}
}
