package java05;

import javax.swing.JOptionPane;

public class ArrayTest6 {

	public static void main(String[] args) {
			
		int[] number = {88,77,55,44,11,66,99};
		
		for (int i = 0; i < number.length; i++) {
			if (number[i]==11) {
				System.out.println((i+1)+"번째 있습니다");
			}
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println( i +":"+number[i]);
		}
		}
			
		
	
}
