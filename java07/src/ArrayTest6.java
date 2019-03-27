import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest6 {

	public static void main(String[] args) {
//		특정한 위치값 찾기
//		1.배열
		int[] num = { 12, 22, 35, 56, 77, 45 };
		Arrays.sort(num); //num의 배열을 정렬해달라.

//		2.for
		for (int i = 0; i < num.length; i++) {
//		3.if
			if(num[i] == 12) {
				System.out.println("12의 위치는 "+ (i+1) +"번째이다.");
			}
		}
//		4.print
	}// main

}// class
