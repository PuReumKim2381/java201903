package java05;

public class ArrayTest4 {

	public static void main(String[] args) {
// �迭
		String[] names = new String[3];  // �迭�� Ư¡ : ũ�⸦ ����Ұ�
		names[0] = "�ھƹ���";
		names[1] = "��ƹ���";
		names[2] = "�̾ƹ���";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
