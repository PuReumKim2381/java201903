package ifTest;

import java.util.Date;
import java.util.Scanner;

public class if01 {

	public static void main(String[] args) {

//		지금 시각은 오전일까? 오후일까? 저녁일까? 판단.
		Date date = new Date();  
		// 컨트롤 +쉬프트+o(영문자)=> 자동 import
		int hour = date.getHours();
		if(hour<12) {
			System.out.println("오전이군요");
		}else if(hour<17){
			System.out.println("오후이군요");
		}else {
			System.out.println("밤이군요");
		}
//		if 옆에는 반드시 조건을 쓴다
         /*
		 * 저기요!!! 
		 * ----------------------------- 
		 * 메뉴를 고르세요
		 *  ----------------------------
		 * 1)짜장면, 2)짬뽕, 3)우동
		 *  ---------------------------- 
		 *  당신의 선택은? 
		 *  1 당신은 짜장면을 주문하셨습니다.
		 */

		System.out.println("저기요!!!");
		System.out.println("-------------");
		System.out.println("메뉴를 고르세요");
		System.out.println("-------------");
		System.out.println("1)짜장면, 2)짬뽕, 3)우동");
		System.out.println("-------------");
		System.out.print("당신의 선택은?>>>");
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("주문 수량은?>>>");
		int count = sc.nextInt();
		
		//계산을 할려면 미리 메뉴의 금액을 넣어 둬야함
		int jajang = 4500;
		int jambong = 5000;
		int woodong = 5500;
//		가격을 넣어주는 변수 생성
		int price = 0;  // 아무것도 들어있지 않은 초기값으로 설정해야 해서 0을 입력함(String에서 null과 같음)
		
		String food = null; // 조건이 많아지면 아래의 코딩보다 이 코딩이 효율적이다.
		if (num==1) {
			food = "짜장면";
			price = jajang*count;
		}else if(num==2) {
			food = "짬뽕";
			price = jambong*count;
		}if(num==3) {
			food = "우동";
			price = woodong*count;
					System.out.println("당신은"+food+"을 선택하셨군요");
			}
		System.out.println("당신이 지불할 금액은"+price+"원입니다.");
		System.out.println("---------------------------");
//		내야 할 금액이 10000원 이상이면, 2000원 할인
		
		if(price>=10000) {
			price = price -2000;
			}
		System.out.println("당신이 할인 받아 지불 할 금액은"+price+"원입니다.");
	/*	int num = sc.nextInt();
		if (num==1) {
			System.out.println("1)당신은 짜장면을 주문하셨습니다.");
		}if(num==2) {
				System.out.println("2)당신은 짬뽕을 주문하셨습니다.");
		}		if(num==3) {
					System.out.println("3)당신은 우동을 주문하셨습니다.");
				
			}
		
		
		*/
	}

}
