package whileTest;

import java.util.Random;
import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
// ��Ʈ��+������+f(�ڵ�����)
//		� �� : Random
		Random random = new Random();
		
		int target = random.nextInt(100);  // int�� �ƹ��ų� ����� �ִ� ��
		
		Scanner sc = new Scanner(System.in);
		int count = 0;  //try�� Ƚ��
		
		while (true) {
			count++;
			System.out.print("������ ���ڸ� �Է�>>>");
			int input = sc.nextInt();
//			��� �Է¹ް�
//			�Է°��� �������� Ȯ��
			if (input == target) {
				System.out.println("�����Դϴ�.");
				break;
			}else {
				System.out.println("�ٽ� �Է��ϼ���");
				if (input>target) {
					System.out.println("�� ���� ���� �Է��ϼ���");
					
				}else {
					System.out.println("�� ū ���� �Է��ϼ���");
				}//else
			}//else
			
		}//while
		System.out.println("����� �õ�Ƚ���� :"+ count + "ȸ");

	}//main

}//class
