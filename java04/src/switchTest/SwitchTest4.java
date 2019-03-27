package switchTest;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	
	//String input = sc.nextLine();  //String 한줄을 다 가지고 올 경우에 nextLine();을 사용한다 
	//int intput2 = sc.nextInt(); // int <- String
	//double input3 = sc.nextDouble(); //double <- String
	//boolean input4 = sc.hasNext();   //boolean <- String
	
	System.out.print("입력하세요>>");
	String input1 = sc.next();  //String
	
	char c = input1.charAt(1);  //첫번째 글짜 추출
	System.out.println("두번째 글자는 "+ c);
	
	
	
	
	
	}
}
