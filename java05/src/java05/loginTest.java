package java05;

import javax.swing.JOptionPane;

public class loginTest {

	public static void main(String[] args) {
		String id2 = "root";
		String pw2 = "abcd";
		String id =JOptionPane.showInputDialog("ID입력");
		String pw =JOptionPane.showInputDialog("PW입력");
		
		if(id.equals(id2) && pw.equals(pw2)){  //.equals는 ==과 같다
//			String이 기본형이 아니기에 다른 부품을 사용해야한다.
		System.out.println("로그인 성공");			
		}else {
		System.out.println("로그인 실패");			
			
		}
		
		

	}

}
