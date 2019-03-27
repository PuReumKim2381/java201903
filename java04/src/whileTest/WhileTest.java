package whileTest;

public class WhileTest {

	public static void main(String[] args) {
		
//	1부터 10까지 더하기	
	int num = 1;   
	int sum = 0;   //누적시킬 공간 선언
    while(num <= 1000) {   
    	sum = sum + num;
    	num++; 
    	}
    System.out.println("총 합은 :"+ sum);
	}

}
