package jarray;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {

//		�� �л��� ����, ���� ���� �Դϴ�.
//		���� :
//		���� :
//		 ������ ��������� ������ ��������� ����Ʈ
		Scanner sc = new Scanner(System.in);
		int[] eng = new int[3];
		int[] mat = new int[3];
		
		for (int i = 0; i < mat.length; i++) {
			System.out.print((i+1)+"��° �л��� ���� ���� :" );
			eng[i] = sc.nextInt();
			System.out.print((i+1)+"��° �л��� ���� ���� :" );
			mat[i] = sc.nextInt();
		}
			
			int sum1 = 0;
			int sum2 = 0;
		for (int i=0; i<3; i++) {
				sum1 = sum1+ eng[i];
				sum2 = sum2+ mat[i];
				
			}
			System.out.println("3�� �л����� ���� ��� ����"+sum1/3.0);
			System.out.println("3�� �л����� ���� ��� ����"+sum2/3.0);
		}
		

	}


