package java05;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[] friends = {"김효진","김이슬","김명성","임수연"};
		System.out.println(friends.length); // 배열갯수출력
		
		// 두가지 선택으로 사용해도 무방
		for(String f : friends) {
			System.out.println(f);
		}
		
		for (int i = 0; i < friends.length; i++) {
		}
	}

}
