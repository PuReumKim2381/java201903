package jarray;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {

//		각 학생의 영어, 수학 점수 입니다.
//		영어 :
//		수학 :
//		 영어의 평균점수와 수학의 평균점수를 프린트
		Scanner sc = new Scanner(System.in);
		int[] eng = new int[3];
		int[] mat = new int[3];
		
		for (int i = 0; i < mat.length; i++) {
			System.out.print((i+1)+"번째 학생의 영어 점수 :" );
			eng[i] = sc.nextInt();
			System.out.print((i+1)+"번째 학생의 수학 점수 :" );
			mat[i] = sc.nextInt();
		}
			
			int sum1 = 0;
			int sum2 = 0;
		for (int i=0; i<3; i++) {
				sum1 = sum1+ eng[i];
				sum2 = sum2+ mat[i];
				
			}
			System.out.println("3명 학생들의 영어 평균 점수"+sum1/3.0);
			System.out.println("3명 학생들의 수학 평균 점수"+sum2/3.0);
		}
		

	}


