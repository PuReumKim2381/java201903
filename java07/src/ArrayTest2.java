
public class ArrayTest2 {

	public static void main(String[] args) {
		int[][] seat = new int[2][5];  //2행 5열에 해당하는 2차원 배열([]두개를 넣어줘야함)
//		 변수는 총 10개 생성됨, 맨앞에 행을 먼저입력
		System.out.println(seat.length);
		System.out.println(seat[0].length);
		
		
		System.out.println("-----------------");
		
//		i=행(2번)
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j]+ "  ");
			}
			System.out.println();
		}
	}

	
//		System.out.println(seat[0][0]);
//		System.out.println(seat[1][4]);
//		System.out.println(seat[2][4]);
	
}
