package java05;

import javax.swing.JOptionPane;

public class loginTest {

	public static void main(String[] args) {
		String id2 = "root";
		String pw2 = "abcd";
		String id =JOptionPane.showInputDialog("ID�Է�");
		String pw =JOptionPane.showInputDialog("PW�Է�");
		
		if(id.equals(id2) && pw.equals(pw2)){  //.equals�� ==�� ����
//			String�� �⺻���� �ƴϱ⿡ �ٸ� ��ǰ�� ����ؾ��Ѵ�.
		System.out.println("�α��� ����");			
		}else {
		System.out.println("�α��� ����");			
			
		}
		
		

	}

}
