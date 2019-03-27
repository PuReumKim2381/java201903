package java05;

public class ArrayTest {

	public static void main(String[] args) {
		int[] seat = {1,2,3,4,5,};   //배열 : int(seat)가 5개가 생긴것 []->위치값
		
		for(int i = 0;i < seat.length; i++) {
		// 초기식            조건식                            증감식
		System.out.println(seat[i]);
		}
		System.out.println("------------");
		System.out.println(seat[0]);
		System.out.println(seat[4]);
		
	}

}
