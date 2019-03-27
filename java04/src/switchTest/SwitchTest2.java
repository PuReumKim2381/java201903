package switchTest;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
	Scanner sc	= new Scanner(System.in);
//  모든 프로그램의 입출력 데이터 타입은 String이다.
	System.out.print("오늘의 날씨는 :");
	String input = sc.next();    //변수로 넣어두는 과정
	System.out.println("당신의 입력값은 :"+ input);
	
	
	
	switch (input) {
	case "sun":
		System.out.println("모자를 챙기세요");
		break;
	case "rain":
		System.out.println("우산을 챙기세요");
		break;


	default:
		break;
	}
	
	
	}

}
