package test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("받은 돈을 입력하세요");
		int pay = sc.nextInt();
		System.out.println("상품의 총액은 :");
		int tot = sc.nextInt();
		System.out.println("부가세는 :"+(int)(tot*0.1));
		

	}

}
