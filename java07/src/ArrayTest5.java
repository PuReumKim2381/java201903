
public class ArrayTest5 {

	public static void main(String[] args) {
//			1) ���ڸ� �迭�� �ִ´�.
		int[] num = { 33, 5, 77, 88, 12, 44 };
//		�ּҰ� ������ ���� ����
		int min = num[0];
//			2) �ݺ������� ��ȸ�Ѵ�.
		for (int i = 0; i < num.length; i++) {

			if(num[i] < min) {
				min = num[i];
			} //if
		}
//			3) ���ǹ����� �ּҰ����� Ȯ���ؼ�
//			      �� ������ �ּҰ��� �����ϴ� ������ �Ű��ش�.
//			4) ���������� �ּҰ��� �����ϴ� �������� �ּҰ���
//			      ����Ǿ� ���� ���̴�.
		System.out.println("���� ���� ���ڴ�: " + min);

	}// main

}// class