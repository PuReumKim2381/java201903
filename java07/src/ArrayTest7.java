import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest7 {

	public static void main(String[] args) {
//		������ ����
		int num = 100;
		int num2 = num; // ���� ����
//		�迭�� ����
		int[] num3 = { 1, 2, 3 };
		int[] num4 = num3; // ���� ���� (�ּҸ� ����)

		num3[0] = 100;

		for (int n3 : num3) {
			System.out.print(n3 + "  ");
		}
		System.out.println();
		for (int n4 : num4) {
			System.out.print(n4 + "  ");
		}

		System.out.println();
		System.out.println("----------------");
		int[] num5 = num3.clone(); // ��������(�޼���,�ݷ��� ���ؼ� ��ü�� ����)
		num3[0] = 200;

		for (int n5 : num5) {
			System.out.print(n5 + "  ");

		}

	}// main

}// class