package input;

import java.util.Scanner;

public class InStart4 {

	public static void main(String[] args) {
		

		
		//���� : 10
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����̳���:");
		int age = sc.nextInt();  //next-> String���� �а�, Int->Int������ �ٲ���
		
		
////		  �ּ� ����Ű: 
//		�����ּ� ->��Ʈ�� +/ 
//		������ �ּ� -> ��Ʈ��+����Ʈ+/ 
//		���̸� �Է¹޾Ƽ�, 
//		18�� �̻��̸� �����Դϴ�. 
//		18��̸��̸�
////		  �̼����Դϴ�.
		 if(age>=18) {
			 //������ �������
			 System.out.println("�����Դϴ�.");
		 }else {
			 System.out.println("�̼����Դϴ�.");
//			 ����:��Ʈ��+��Ʈ+ȭ��ǥ, �̵�: ��Ʈ+ȭ��ǥ
		 }
	}

}
