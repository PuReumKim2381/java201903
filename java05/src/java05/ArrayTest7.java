package java05;

import javax.swing.JOptionPane;

public class ArrayTest7 {

	public static void main(String[] args) {
// �迭
		String[] names = new String[3];  // �迭�� Ư¡ : ũ�⸦ ����Ұ�
		
		for (int i = 0; i < names.length; i++) {
			names[i] = JOptionPane.showInputDialog("�̸��Է�");
			
		}
		
		for (int i = 0; i < names.length; i++) {
		//	System.out.println(names[i]);
			if(names[i].equals("�ڻ���")) {
				System.out.println("�ڻ����� �־��");
		}
		}
			
		}
			
		
	
}
