package jarray;

import java.util.Random;

public class RadomTest {

	public static void main(String[] args) {
//		배열의 입력값을 받아서 저장-->계산
		
//		random값을 배열에 넣어봅시다
		
		
		Random random = new Random();  //Math.random();
		int[] lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			lotto[i] = random.nextInt(46);  //0~45까지의 숫자를 발생 시키려면 45+1으로 범위 지정
		}
			for (int x : lotto) {
				System.out.print(x + "  ");
				
			}
			
		}
		

	}


