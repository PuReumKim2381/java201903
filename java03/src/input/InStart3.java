package input;

import java.util.Scanner;

public class InStart3 {

	public static void main(String[] args) {
		

		
		//나이 : 10
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보르미나이:");
		int age = sc.nextInt();  //next-> String으로 읽고, Int->Int형으로 바꿔줘
		System.out.println("보르미 내년의 나이는:30"+(age+1));
	}


}
