import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest7 {

	public static void main(String[] args) {
//		변수를 복사
		int num = 100;
		int num2 = num; // 변수 복사
//		배열을 복사
		int[] num3 = { 1, 2, 3 };
		int[] num4 = num3; // 얕은 복사 (주소를 복사)

		num3[0] = 100;

		for (int n3 : num3) {
			System.out.print(n3 + "  ");
		}
		System.out.println();
		for (int n4 : num4) {
			System.out.print(n4 + "  ");
		}

		System.out.println();
		System.out.println("----------------");
		int[] num5 = num3.clone(); // 깊은복사(메서드,콜론을 통해서 전체를 복사)
		num3[0] = 200;

		for (int n5 : num5) {
			System.out.print(n5 + "  ");

		}

	}// main

}// class
