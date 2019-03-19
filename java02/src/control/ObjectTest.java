package control;
// 맨위 package 두번째import 세번째class
import java.lang.*;
import java.util.Date;

import javax.xml.crypto.Data;
public class ObjectTest {

	public static void main(String[] args) {
		
		new Date();  // 부품 복사 (부품만 대문자 반드시 사용)
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int year = date.getYear();
		int month = date.getMonth();
		int day= date.getDate();
		System.out.println("현재 몇시?"+hour);
		System.out.println("현재 몇분?"+min);
		System.out.println("현재 몇년도?"+year);
		System.out.println("이번 달은?"+month);
		System.out.println("오늘 몇일?"+day);
		System.out.println(date.getDay());
		System.out.println(date.getMonth()+1);
		System.out.println(date.getYear()+1900);
		

		
	}

}
