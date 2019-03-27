package java05;

import javax.swing.JOptionPane;

public class ArrayTest7 {

	public static void main(String[] args) {
// 배열
		String[] names = new String[3];  // 배열의 특징 : 크기를 변경불가
		
		for (int i = 0; i < names.length; i++) {
			names[i] = JOptionPane.showInputDialog("이름입력");
			
		}
		
		for (int i = 0; i < names.length; i++) {
		//	System.out.println(names[i]);
			if(names[i].equals("박상혁")) {
				System.out.println("박상혁이 있어요");
		}
		}
			
		}
			
		
	
}
