package control;
// ���� package �ι�°import ����°class
import java.lang.*;
import java.util.Date;

import javax.xml.crypto.Data;
public class ObjectTest {

	public static void main(String[] args) {
		
		new Date();  // ��ǰ ���� (��ǰ�� �빮�� �ݵ�� ���)
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int year = date.getYear();
		int month = date.getMonth();
		int day= date.getDate();
		System.out.println("���� ���?"+hour);
		System.out.println("���� ���?"+min);
		System.out.println("���� ��⵵?"+year);
		System.out.println("�̹� ����?"+month);
		System.out.println("���� ����?"+day);
		System.out.println(date.getDay());
		System.out.println(date.getMonth()+1);
		System.out.println(date.getYear()+1900);
		

		
	}

}
