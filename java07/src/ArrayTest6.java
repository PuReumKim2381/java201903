import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest6 {

	public static void main(String[] args) {
//		Ư���� ��ġ�� ã��
//		1.�迭
		int[] num = { 12, 22, 35, 56, 77, 45 };
		Arrays.sort(num); //num�� �迭�� �����ش޶�.

//		2.for
		for (int i = 0; i < num.length; i++) {
//		3.if
			if(num[i] == 12) {
				System.out.println("12�� ��ġ�� "+ (i+1) +"��°�̴�.");
			}
		}
//		4.print
	}// main

}// class
