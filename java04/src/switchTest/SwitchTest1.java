package switchTest;

public class SwitchTest1 {

	public static void main(String[] args) {
		int num = 300;
		switch(num) {     //switch(�������Է�)
		case 100:
			System.out.println("100�� ����־��");
			break;   //switch case�� ������ ���� �� �� ��� �� break;�� ����� ��
		//ó������       case ��1:
		case 200:
			System.out.println("200�� ����־��");
			break;
		//ó������
		case 300:
			System.out.println("300�� ����־��");
			break;
		//ó������
		default:
			System.out.println("���� �������� �𸣰ھ��");
			break;
        //������ ó������.
		}
		
	}

}
