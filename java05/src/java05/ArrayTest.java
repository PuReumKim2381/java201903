package java05;

public class ArrayTest {

	public static void main(String[] args) {
		int[] seat = {1,2,3,4,5,};   //�迭 : int(seat)�� 5���� ����� []->��ġ��
		
		for(int i = 0;i < seat.length; i++) {
		// �ʱ��            ���ǽ�                            ������
		System.out.println(seat[i]);
		}
		System.out.println("------------");
		System.out.println(seat[0]);
		System.out.println(seat[4]);
		
	}

}
