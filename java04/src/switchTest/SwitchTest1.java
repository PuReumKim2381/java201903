package switchTest;

public class SwitchTest1 {

	public static void main(String[] args) {
		int num = 300;
		switch(num) {     //switch(변수값입력)
		case 100:
			System.out.println("100이 들어있어요");
			break;   //switch case는 스스로 종료 할 수 없어서 꼭 break;를 해줘야 함
		//처리내용       case 값1:
		case 200:
			System.out.println("200이 들어있어요");
			break;
		//처리내용
		case 300:
			System.out.println("300이 들어있어요");
			break;
		//처리내용
		default:
			System.out.println("무슨 숫자인지 모르겠어요");
			break;
        //나머지 처리내용.
		}
		
	}

}
