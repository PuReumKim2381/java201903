package java05;

import javax.swing.JOptionPane;

public class ArrayTest5 {

	public static void main(String[] args) {
// �迭
		String[] names = new String[3];  // �迭�� Ư¡ : ũ�⸦ ����Ұ�
		names[0] = JOptionPane.showInputDialog("�̸��Է�");
		names[1] = JOptionPane.showInputDialog("�̸��Է�");
		names[2] = JOptionPane.showInputDialog("�̸��Է�");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
