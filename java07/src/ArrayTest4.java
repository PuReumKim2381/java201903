
public class ArrayTest4 {

	public static void main(String[] args) {
//		2���� �迭�ε� ������ �� ���
		int[][] num = {
				{1,2,3,4,5},
				{6,7,8,9,10}
				};
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]);
				
			}
			System.out.println(); // �ѹ� for���� �� �� ���� ���ָ� ����� ��µ�
//			1) ���ڸ� �迭�� �ִ´�.
//			2) �ݺ������� ��ȸ�Ѵ�.
//			3) ���ǹ����� �ּҰ����� Ȯ���ؼ�
//			      �� ������ �ּҰ��� �����ϴ� ������ �Ű��ش�.
//			4) ���������� �ּҰ��� �����ϴ� �������� �ּҰ���
//			      ����Ǿ� ���� ���̴�.
		}

	}//main

}//class
