package input;

import java.util.Scanner;

public class InStart4 {

	public static void main(String[] args) {
		

		
		//나이 : 10
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보르미나이:");
		int age = sc.nextInt();  //next-> String으로 읽고, Int->Int형으로 바꿔줘
		
		
////		  주석 단축키: 
//		한줄주석 ->컨트롤 +/ 
//		여러줄 주석 -> 컨트롤+쉬프트+/ 
//		나이를 입력받아서, 
//		18살 이상이면 성년입니다. 
//		18살미만이면
////		  미성년입니다.
		 if(age>=18) {
			 //맞으면 여기실행
			 System.out.println("성년입니다.");
		 }else {
			 System.out.println("미성년입니다.");
//			 복사:컨트롤+알트+화살표, 이동: 알트+화살표
		 }
	}

}
