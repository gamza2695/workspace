package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//List<IPInfo> ipInfoList = null; // 이후 모두 NullPointerException 발생
		List<IPInfo> ipInfoList = new ArrayList<IPInfo>(); // 객체 생성
		
		ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
		ipInfoList.add(new IPInfo("212.133.7.8", "김갑돌"));
		ipInfoList.add(new IPInfo("177.233.111.222", "고길순"));
		
		System.out.print("ip 입력 : ");
		String ip = sc.next();
		
		for(int i = 0; i<ipInfoList.size();i++) {
			if(ip.equals(ipInfoList.get(i).getIp())){
				System.out.println(ipInfoList.get(i));
				return; 
				// break;
				// 일치하는 ip가 있을 때 반복문만 종료하는 break 구문을 작성하여  
				// 일치하는 ip가 있어도 "일치하는 ip 사용자가 없습니다"가 출력되는 문제 발생
				// 일치하는 ip가 있을 경우 메서드를 바로 종료할 수 있게 return으로 변경
			}
		}
		
		System.out.println("일치하는 ip 사용자가 없습니다.");
		
	}

}
