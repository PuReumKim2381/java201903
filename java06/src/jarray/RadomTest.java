package jarray;

import java.util.Random;

public class RadomTest {

	public static void main(String[] args) {
//		�迭�� �Է°��� �޾Ƽ� ����-->���
		
//		random���� �迭�� �־�ô�
		
		
		Random random = new Random();  //Math.random();
		int[] lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			lotto[i] = random.nextInt(46);  //0~45������ ���ڸ� �߻� ��Ű���� 45+1���� ���� ����
		}
			for (int x : lotto) {
				System.out.print(x + "  ");
				
			}
			
		}
		

	}


