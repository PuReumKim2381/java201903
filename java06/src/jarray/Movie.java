package jarray;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];  // 자리를 위한 배열
		int count = 0;  //예매 카운트
		while(true) {  // 무한루프
		System.out.println("------------------------------");
        for (int i = 0; i < seat.length; i++) {
    	 System.out.print(i + 1 +"  ");
	
}
		System.out.println("\n------------------------------");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + "  ");
		}
		System.out.println("\n------------------------------");
		System.out.print("예매하실 좌석 번호를 입력하세요.(종료 :0>>>)");
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println("예매 시스템을 종료합니다");
			break; }
		// 예매 상태를 확인
		if(seat[input-1] ==0) {
			count ++;
			seat[input-1] = 1; // 예매완료
			System.out.println(input + "번의 예매가 완료되었습니다.");
		}else {
			System.out.println(input + " 번은 이미 예매가 된 자리입니다.");
			System.out.println("다른 자리를 선택해주세요.");
		}
	}
		System.out.println("당신이 지불 할 총 금액은 : "+ count * 7000);
	}

}
