package ifTest;

import java.util.Date;
import java.util.Scanner;

public class if01 {

	public static void main(String[] args) {

//		���� �ð��� �����ϱ�? �����ϱ�? �����ϱ�? �Ǵ�.
		Date date = new Date();  
		// ��Ʈ�� +����Ʈ+o(������)=> �ڵ� import
		int hour = date.getHours();
		if(hour<12) {
			System.out.println("�����̱���");
		}else if(hour<17){
			System.out.println("�����̱���");
		}else {
			System.out.println("���̱���");
		}
//		if ������ �ݵ�� ������ ����
         /*
		 * �����!!! 
		 * ----------------------------- 
		 * �޴��� ������
		 *  ----------------------------
		 * 1)¥���, 2)«��, 3)�쵿
		 *  ---------------------------- 
		 *  ����� ������? 
		 *  1 ����� ¥����� �ֹ��ϼ̽��ϴ�.
		 */

		System.out.println("�����!!!");
		System.out.println("-------------");
		System.out.println("�޴��� ������");
		System.out.println("-------------");
		System.out.println("1)¥���, 2)«��, 3)�쵿");
		System.out.println("-------------");
		System.out.print("����� ������?>>>");
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("�ֹ� ������?>>>");
		int count = sc.nextInt();
		
		//����� �ҷ��� �̸� �޴��� �ݾ��� �־� �־���
		int jajang = 4500;
		int jambong = 5000;
		int woodong = 5500;
//		������ �־��ִ� ���� ����
		int price = 0;  // �ƹ��͵� ������� ���� �ʱⰪ���� �����ؾ� �ؼ� 0�� �Է���(String���� null�� ����)
		
		String food = null; // ������ �������� �Ʒ��� �ڵ����� �� �ڵ��� ȿ�����̴�.
		if (num==1) {
			food = "¥���";
			price = jajang*count;
		}else if(num==2) {
			food = "«��";
			price = jambong*count;
		}if(num==3) {
			food = "�쵿";
			price = woodong*count;
					System.out.println("�����"+food+"�� �����ϼ̱���");
			}
		System.out.println("����� ������ �ݾ���"+price+"���Դϴ�.");
		System.out.println("---------------------------");
//		���� �� �ݾ��� 10000�� �̻��̸�, 2000�� ����
		
		if(price>=10000) {
			price = price -2000;
			}
		System.out.println("����� ���� �޾� ���� �� �ݾ���"+price+"���Դϴ�.");
	/*	int num = sc.nextInt();
		if (num==1) {
			System.out.println("1)����� ¥����� �ֹ��ϼ̽��ϴ�.");
		}if(num==2) {
				System.out.println("2)����� «���� �ֹ��ϼ̽��ϴ�.");
		}		if(num==3) {
					System.out.println("3)����� �쵿�� �ֹ��ϼ̽��ϴ�.");
				
			}
		
		
		*/
	}

}
