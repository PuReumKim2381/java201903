package java05;

import javax.swing.JOptionPane;

public class dialogTest {

	public static void main(String[] args) {
	String name 
	= JOptionPane.showInputDialog("당신의 이름을 입력 :");  
//	입력 - 다이얼로그
	System.out.println("당신이 입력한 이름은>>"+name);
	String age 
	= JOptionPane.showInputDialog("당신의 나이 입력 :");  
	System.out.println("당신이 입력한 나이>>"+age);
	String attach
	= JOptionPane.showInputDialog("당신의 소속입력 :");  
	System.out.println("당신이 입력한 소속>>"+attach);
//  출력 - 콘솔
	}

}
