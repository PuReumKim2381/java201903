import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[][] seat = new int[2][5]; 
//		 2�� 5���� �ش��ϴ� 2���� �迭([]�ΰ��� �־������)
//		 ������ �� 10�� ������, �Ǿտ� ���� �����Է�

		System.out.println("��ȭ ���� ���α׷��Դϴ�.");
		while (true) {
			System.out.println();
			for (int i = 0; i < 5; i++) {
				System.out.print("   " + (i + 1) + "��");
			}
			System.out.println();
			System.out.println("-----------------");

//		i=��(2��)
			for (int i = 0; i < seat.length; i++) {
				System.out.print((i + 1) + "��: ");

				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + "   ");
				}
				System.out.println();
			}
			System.out.println("-----------------");
//		���ϴ� �¼� �Է�
			Scanner sc = new Scanner(System.in);
			System.out.println("����� x,���Ŵ�y>>");
		    String input = sc.next();
		    if(input.equals("x")) {
		    	System.out.println("���� �ý����� �����մϴ�.");
		    	System.out.println("�ȳ��� ������.");
		    	break;
		    }else {
			System.out.println("�����Ͻ� �½��� ���� �Է� : ");
			int row = sc.nextInt();
			System.out.println("�����Ͻ� �½��� ���� �Է� : ");
			int col = sc.nextInt();
//		0��0�� => �̹� ���ŵ� �ڸ����� Ȯ��!
			if (seat[row][col] == 0) {
				seat[row][col] = 1;
				System.out.println("��û�Ͻ� �ڸ��� ���Ű� �Ϸ�Ǿ����ϴ�.");
			} else {
				System.out.println("�̹� ���ŵ� �ڸ��Դϴ�.");
				System.out.println("�ٸ� �ڸ��� �������ּ���.");
			} //else
		    }//else
		}//while
		

	}// main

}// class
