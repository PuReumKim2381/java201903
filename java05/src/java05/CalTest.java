package java05;

import javax.swing.JOptionPane;

public class CalTest {

	public static void main(String[] args) {
		String num1 =JOptionPane.showInputDialog("숫자1입력");
		String num2 =JOptionPane.showInputDialog("숫자2입력");
		int n1 = Integer.parseInt(num1); 
		// 괄호안에는 입력값을 반드시 입력한다. (반환값)
		int n2 = Integer.parseInt(num2); 
		
		JOptionPane.showMessageDialog(null, n1+n2);  
		//+ :연결의 의미(String)와 산수(int)의 의미 공존
		
		int result = JOptionPane.showConfirmDialog(null,n1+n2);
		System.out.println(result);

	}

}
