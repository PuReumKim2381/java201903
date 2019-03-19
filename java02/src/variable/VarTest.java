package variable;

/*
 * 프로그래머: 임아무개
 * 최종 수정 날짜 : 2019.03.19
 * 수정 원인 : 변수 확인
 */
public class VarTest {

	public static void main(String[] args) {
		// 자바의 기본(1줄 주석)
		// sysout 컨트롤 + 스페이스바
		// run 컨트롤 +F11
		System.out.println("오늘은 두번째 날입니다.");
		System.out.println("----------------");
		System.out.println();
		
		
		byte time = 15; // = 대입연산자, 할당연산자
		// 데이터타입 변수명 = 값;
		int seconds = 51245315;
		
		final double pi = 3.14; //상수
		//PI =3;  상수는 값을 변경할 수 없다.
		// 상수는 일반적으로 상수명을 대문자로 쓴다.(final)
		
		
		
		char lastName ='김';
		boolean lunch = true; //참: true, 거짓: false
		System.out.println("지금 시작은 :"+time);
		// + => 연결연산자
		System.out.println("아침부터 지난 초는:"+seconds);
		System.out.println("Pi의 값은: "+ pi);
		System.out.println("나의 이름 첫 글자는: "+ lastName);
		System.out.println("점심을 먹었나요:"+lunch);
		
		String name = "김효지니"; //String => "
		System.out.println("너의 전체 이름은"+name);

	}

}
