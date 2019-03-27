import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[][] seat = new int[2][5]; 
//		 2행 5열에 해당하는 2차원 배열([]두개를 넣어줘야함)
//		 변수는 총 10개 생성됨, 맨앞에 행을 먼저입력

		System.out.println("영화 예매 프로그램입니다.");
		while (true) {
			System.out.println();
			for (int i = 0; i < 5; i++) {
				System.out.print("   " + (i + 1) + "열");
			}
			System.out.println();
			System.out.println("-----------------");

//		i=행(2번)
			for (int i = 0; i < seat.length; i++) {
				System.out.print((i + 1) + "행: ");

				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + "   ");
				}
				System.out.println();
			}
			System.out.println("-----------------");
//		원하는 좌석 입력
			Scanner sc = new Scanner(System.in);
			System.out.println("종료는 x,예매는y>>");
		    String input = sc.next();
		    if(input.equals("x")) {
		    	System.out.println("예매 시스템을 종료합니다.");
		    	System.out.println("안녕히 가세요.");
		    	break;
		    }else {
			System.out.println("예매하실 좌식의 행을 입력 : ");
			int row = sc.nextInt();
			System.out.println("예매하실 좌식의 열을 입력 : ");
			int col = sc.nextInt();
//		0행0열 => 이미 예매된 자리인지 확인!
			if (seat[row][col] == 0) {
				seat[row][col] = 1;
				System.out.println("요청하신 자리에 예매가 완료되었습니다.");
			} else {
				System.out.println("이미 예매된 자리입니다.");
				System.out.println("다른 자리를 예매해주세요.");
			} //else
		    }//else
		}//while
		

	}// main

}// class
