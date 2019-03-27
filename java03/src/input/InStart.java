package input;

import java.util.Scanner;

public class InStart {

	public static void main(String[] args) {
		/*System.out.println("나는 기본 출력");
	
		Scanner sc = new Scanner(System.in);  // 부품 Scanner를 new를 통해 복사
		System.out.print("당신의 이름을 입력하세요.");
		String name = sc.next();
		System.out.println("당신의 이름은"+name);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("당신의 소속을 입력하세요");
		String attach = sc1.next();
		System.out.println("당신의 소속은"+attach);*/
		

		System.out.println("나의 정보 입력");
		System.out.println("---------------");
		//나이 : 10
		System.out.print("나이:");
		Scanner sc3 = new Scanner(System.in);
		String age = sc3.next();
		//성별 :man
		System.out.print("성별:");
		Scanner sc4 = new Scanner(System.in);
		String gender = sc4.next();
		
		//이름
		System.out.print("이름:");
		Scanner sc5 = new Scanner(System.in);
		String name = sc5.next();
		
		
	}


}
