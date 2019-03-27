package switchTest;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest5 {

	public static void main(String[] args) {
	Date date = new Date();
	int month = date.getMonth() + 1;
	System.out.println("이번달은:"+ month+"월");
	
	switch (month) {  //()안에 실수,정수(long)사용불가
	case 4:
	case 6:
	case 9:
	case 11:
	   System.out.println("30일까지 입니다.");
		break;
	case 2:
		System.out.println("28일까지 입니다.");
		break;
	default:
		System.out.println("31일까지 입니다.");
		break;
	}
	
	}

}
