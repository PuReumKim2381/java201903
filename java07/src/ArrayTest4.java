
public class ArrayTest4 {

	public static void main(String[] args) {
//		2차원 배열인데 내용을 알 경우
		int[][] num = {
				{1,2,3,4,5},
				{6,7,8,9,10}
				};
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]);
				
			}
			System.out.println(); // 한번 for돌아 간 후 엔터 쳐주면 열대로 출력됨
//			1) 숫자를 배열에 넣는다.
//			2) 반복문으로 순회한다.
//			3) 조건문으로 최소값인지 확인해서
//			      더 작으면 최소값을 저장하는 변수에 옮겨준다.
//			4) 최종적으로 최소값을 저장하는 변수에는 최소값이
//			      저장되어 있을 것이다.
		}

	}//main

}//class
