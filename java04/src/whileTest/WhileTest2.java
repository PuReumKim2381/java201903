package whileTest;

public class WhileTest2 {

	public static void main(String[] args) {
		
		
	int num = 0;   //1. 시작값
	
    while(num < 10) {   //2.조건 //()안에 조건이 true면 무한 반복
    	System.out.println("환영합니다.");
    	num++; //3.증감값 
    	//num = num + 1의 뜻이며,  증감연산자 (++;,--;)라고 부른다.
    }
	}

}
